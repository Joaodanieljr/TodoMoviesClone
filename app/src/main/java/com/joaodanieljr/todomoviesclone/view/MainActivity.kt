package com.joaodanieljr.todomoviesclone.view
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.joaodanieljr.todomoviesclone.R.*
import com.joaodanieljr.todomoviesclone.functions.Favorite
import com.joaodanieljr.todomoviesclone.functions.insertImage

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val viewModel = ViewModelProvider(this).get(MoviesViewModel::class.java)
        initMovie(viewModel)
        initSimilar(viewModel)

    }

    //Inicializando o Movie Principal
    private fun initMovie(viewModel: MoviesViewModel) {

        viewModel.movieLiveData.observe(this, Observer {movie ->
            setLayoutMovie(movie.title, movie.popularity, movie.vote_count, movie.backdrop_path)
        })
        viewModel.getMovie()
    }

    private fun setLayoutMovie(title: String, popularity: String, vote_count: String, backdrop_path: String) {
        textView_title.text = title
        textView_likes.text = vote_count
        textView_numberViews.text = popularity

        val url = backdrop_path
        insertImage(url,imageView_principal)


    }


    //Inicializando o Adapter do movie secundario
    private fun initSimilar(viewModel: MoviesViewModel) {
        viewModel.similarResultLiveData.observe(this, Observer {
            it?.let {similar ->
                with(recyclerView_similarMovies){
                    layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
                    setHasFixedSize(true)
                    adapter = SimilarMoviesAdapter(similar)
                }
            }
        })
        viewModel.getSimilarList()
    }

    override fun onResume() {
        super.onResume()

        imageButton.setOnClickListener {
            Favorite(it)
        }
    }

}
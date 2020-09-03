package com.joaodanieljr.todomoviesclone.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.joaodanieljr.todomoviesclone.R
import com.joaodanieljr.todomoviesclone.functions.BuscarGenero
import com.joaodanieljr.todomoviesclone.functions.getGenero
import com.joaodanieljr.todomoviesclone.functions.insertImage
import com.joaodanieljr.todomoviesclone.model.similar.SimilarResult
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.similar_movie.view.*

class SimilarMoviesAdapter(
    private val listSimilarMovies:List<SimilarResult>
    ): RecyclerView.Adapter <SimilarMoviesAdapter.SimilarViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimilarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.similar_movie,parent,false)
        return SimilarViewHolder(view)
    }

    override fun onBindViewHolder(holder: SimilarViewHolder, position: Int) {
        holder.bindView(listSimilarMovies[position])
    }

    override fun getItemCount() = listSimilarMovies.count()

    class SimilarViewHolder(view:View): RecyclerView.ViewHolder(view){

        private val title: TextView? = view.textView_title
        private val year: TextView? = view.textView_year
        private val imgPoster = itemView.imageView_poster
        private val genre = view.textView_genero


        fun bindView(holder:SimilarResult) {
            title?.text = holder.title
            year?.text = holder.release_date.substring(0,4)
            genre.text = getGenero(holder.genre_ids).joinToString()



            val img = holder.backdrop_path
            insertImage(img,imgPoster)

        }



    }




}
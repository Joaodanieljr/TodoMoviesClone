package com.joaodanieljr.todomoviesclone.view

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.joaodanieljr.todomoviesclone.api.ApiService
import com.joaodanieljr.todomoviesclone.model.movie.Movie
import com.joaodanieljr.todomoviesclone.model.similar.Similar
import com.joaodanieljr.todomoviesclone.model.similar.SimilarResult
import com.joaodanieljr.todomoviesclone.utils.Constants
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MoviesViewModel: ViewModel() {

    val movieLiveData: MutableLiveData<Movie> = MutableLiveData()
    val similarResultLiveData: MutableLiveData<List<SimilarResult>> = MutableLiveData()

    fun getMovie(){
        ApiService.serviceMovie
            .getMovies(Constants.ID_MOVIE)
            .enqueue(object: Callback<Movie>{
                override fun onResponse(call: Call<Movie>, response: Response<Movie>) {
                    if(response.isSuccessful){
                        response.body()?.let { movie ->
                            movieLiveData.value = movie
                        }
                    }
                }
                override fun onFailure(call: Call<Movie>, t: Throwable) {
                    Log.i("Erro Api", "Erro na Api Movie")
                }
            })
    }


    fun getSimilarList(){
        ApiService.serviceSimilar
            .getSimilar(Constants.ID_MOVIE)
            .enqueue(object : Callback<Similar> {
                override fun onResponse(call: Call<Similar>, response: Response<Similar>) {
                    if (response.isSuccessful) {
                        response.body()?.let { similar->
                            similarResultLiveData.value = similar.results
                        }
                    }
                }
                override fun onFailure(call: Call<Similar>, t: Throwable) {
                    Log.i("Erro Api", "Erro na Api Similar")
                }
            })

    }

}
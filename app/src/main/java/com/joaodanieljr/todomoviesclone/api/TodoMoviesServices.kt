package com.joaodanieljr.todomoviesclone.api

import com.joaodanieljr.todomoviesclone.model.movie.Movie
import com.joaodanieljr.todomoviesclone.model.similar.Similar
import com.joaodanieljr.todomoviesclone.utils.Constants
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface TodoMoviesServices {

    @GET("{id}?api_key=${Constants.KEY_API}")
    fun getMovies(@Path("id")id: Int) : Call<Movie>

    @GET("{id}/similar?api_key=${Constants.KEY_API}")
    fun getSimilar(@Path("id")id: Int) : Call<Similar>
}
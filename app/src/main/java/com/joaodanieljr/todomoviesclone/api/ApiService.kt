package com.joaodanieljr.todomoviesclone.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiService {

        private fun initRetrofit(): Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/3/movie/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    val serviceMovie:TodoMoviesServices = initRetrofit().create(TodoMoviesServices::class.java)

    val serviceSimilar:TodoMoviesServices = initRetrofit().create(TodoMoviesServices::class.java)
}
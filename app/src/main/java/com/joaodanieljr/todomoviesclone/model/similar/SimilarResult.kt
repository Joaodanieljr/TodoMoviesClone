package com.joaodanieljr.todomoviesclone.model.similar

data class SimilarResult(


    val title: String,
    val release_date: String,
    val genre_ids: List<Int>,
    val backdrop_path: String,

)


package com.joaodanieljr.todomoviesclone.model.similar

data class Similar(

    val page: Int,
    val results: List<SimilarResult>,
    val total_pages: Int,
    val total_results: Int

)
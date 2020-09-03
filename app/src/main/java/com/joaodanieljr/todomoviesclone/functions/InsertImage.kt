package com.joaodanieljr.todomoviesclone.functions

import android.widget.ImageView
import com.squareup.picasso.Picasso

fun insertImage(url: String, imageView: ImageView) {
    val urlPicasso = "https://image.tmdb.org/t/p/original/${url}"
    Picasso.get().load(urlPicasso).into(imageView)
}
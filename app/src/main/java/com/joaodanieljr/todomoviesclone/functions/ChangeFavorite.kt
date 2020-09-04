package com.joaodanieljr.todomoviesclone.functions

import android.R
import android.graphics.Color
import android.view.View
import com.joaodanieljr.todomoviesclone.model.movie.Movie
import kotlinx.android.synthetic.main.activity_main.view.*

var favourite: Boolean = false

fun Favorite(view: View){

    if (favourite) {
        view.imageButton.setImageResource(com.joaodanieljr.todomoviesclone.R.drawable.ic_baseline_favorite_36)
        favourite = false
    } else {
        view.imageButton.setImageResource(com.joaodanieljr.todomoviesclone.R.drawable.ic_baseline_favorite_red)
        favourite = true


    }

}
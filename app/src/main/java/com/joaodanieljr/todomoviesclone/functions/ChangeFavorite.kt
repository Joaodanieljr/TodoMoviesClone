package com.joaodanieljr.todomoviesclone.functions

import android.view.View
import kotlinx.android.synthetic.main.activity_main.view.*

var favourite: Boolean = false

fun Favorite(view: View){

    if (favourite) {
        view.imageButton_FavoriteInterativo.setImageResource(com.joaodanieljr.todomoviesclone.R.drawable.ic_baseline_favorite_36)
        favourite = false
    } else {
        view.imageButton_FavoriteInterativo.setImageResource(com.joaodanieljr.todomoviesclone.R.drawable.ic_baseline_favorite_red)
        favourite = true


    }

}
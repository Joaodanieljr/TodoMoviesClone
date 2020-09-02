package com.joaodanieljr.todomoviesclone.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.joaodanieljr.todomoviesclone.R

class SimilarMoviesAdapter: RecyclerView.Adapter <SimilarMoviesAdapter.SimilarviewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimilarviewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.similar_movie,parent,false)
        return SimilarviewHolder(view)
    }

    override fun onBindViewHolder(holder: SimilarviewHolder, position: Int) {

    }

    override fun getItemCount(): Int {

    }

    class SimilarviewHolder(view:View): RecyclerView.ViewHolder(view){

    }
}
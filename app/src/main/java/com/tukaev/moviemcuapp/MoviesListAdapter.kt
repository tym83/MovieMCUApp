package com.tukaev.moviemcuapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MoviesListAdapter(
    var movies: List<Movie>
): RecyclerView.Adapter<MoviesListHolder>() {
    override fun getItemCount(): Int = movies.size

    private fun getItem(position: Int): Movie = movies[position]

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesListHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.view_holder_movie, parent, false)
        return MoviesListHolder(view)
    }

    override fun onBindViewHolder(holder: MoviesListHolder, position: Int) {
        holder.bind(getItem(position))
    }
}
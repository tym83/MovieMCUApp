package com.tukaev.moviemcuapp

import android.provider.ContactsContract
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MoviesListHolder(view: View): RecyclerView.ViewHolder(view) {
    private val genres: TextView = itemView.findViewById(R.id.genres)
    private val ageRestrict: TextView = itemView.findViewById(R.id.age_restriction)
    private val like: ImageView = itemView.findViewById(R.id.like)
    private val cover: ImageView = itemView.findViewById(R.id.movie_cover)
    private val reviewsNumber: TextView = itemView.findViewById(R.id.reviews_number)
    private val name: TextView = itemView.findViewById(R.id.movie_header)
    private val duration: TextView = itemView.findViewById(R.id.duration)

    // Five start that means movie rating
    private val stars: List<ImageView> = listOf<ImageView>(
        itemView.findViewById(R.id.starOne),
        itemView.findViewById(R.id.starTwo),
        itemView.findViewById(R.id.starThree),
        itemView.findViewById(R.id.starFour),
        itemView.findViewById(R.id.starFive)
    )

    fun bind(movie: Movie) {
        name.text = movie.name
        duration.text = "${movie.duration} minutes"
        reviewsNumber.text = "${movie.reviewsNumber} reviews"
        genres.text = movie.genres.joinToString()
        ageRestrict.text = "${movie.ageRestrict}+"
        cover.setImageResource(movie.cover)
        //change colors in rating stars and like icon if it needed
        if (movie.like) like.setColorFilter(R.color.movieGenreRed) else like.setColorFilter(R.color.white)
        stars.forEach { if (stars.indexOf(it) < movie.rating) it.setColorFilter(R.color.movieGenreRed) else it.setColorFilter(R.color.movieEmptySymbolGray) }
    }
}
package com.tukaev.moviemcuapp

data class Actor(
    val name: String,
    val photo: Int
)

fun generateActors(): List<Actor> {
    return listOf(
        Actor("Cris Evans", R.drawable.evans),
        Actor("Cris Hemsworth", R.drawable.hemsworth),
        Actor("Mark Ruffalo", R.drawable.ruffalo),
        Actor("Ben Fredericson", R.drawable.hemsworth),
        Actor("Robert Dawney", R.drawable.dawny),
        Actor("Cris Evans", R.drawable.evans),
        Actor("Cris Hemsworth", R.drawable.hemsworth),
        Actor("Mark Ruffalo", R.drawable.ruffalo),
        Actor("Ben Fredericson", R.drawable.hemsworth),
        Actor("Robert Dawney", R.drawable.dawny),
    )
}
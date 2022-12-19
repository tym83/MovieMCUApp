package com.tukaev.moviemcuapp

data class Movie(
    val genres: List<String>,
    val ageRestrict: Int,
    val like: Boolean,
    val cover: Int,
    val rating: Int,
    val reviewsNumber: Int,
    val name: String,
    val duration: Int
)

fun generateMovies(): List<Movie> {
    return listOf(
        Movie(
            listOf("Action", "Adventure", "Drama"),
            13, false, R.drawable.avengers_cover, 4, 125,
            "Avengers: End Game", 137),
        Movie(
            listOf("Action", "Sci-Fi", "Thriller"),
            16, true, R.drawable.tenet, 5, 98,
            "Tenet", 97),
        Movie(
            listOf("Action", "Adventure", "Sci-Fi"),
            13, false, R.drawable.widow, 4, 38,
            "Black Widow", 102),
        Movie(
            listOf("Action", "Adventure", "Fantasy"),
            13, false, R.drawable.wonder_woman, 5, 74,
            "Black Widow", 120),
        Movie(
            listOf("Action", "Adventure", "Drama"),
            13, false, R.drawable.avengers_cover, 4, 125,
            "Avengers: End Game", 137),
        Movie(
            listOf("Action", "Adventure", "Fantasy"),
            13, false, R.drawable.wonder_woman, 5, 74,
            "Black Widow", 120),
        Movie(
            listOf("Action", "Adventure", "Fantasy"),
            13, false, R.drawable.wonder_woman, 5, 74,
            "Black Widow", 120),
        Movie(
            listOf("Action", "Adventure", "Fantasy"),
            13, false, R.drawable.wonder_woman, 5, 74,
            "Black Widow", 120),
        Movie(
            listOf("Action", "Adventure", "Fantasy"),
            13, false, R.drawable.wonder_woman, 5, 74,
            "Black Widow", 120),
        Movie(
            listOf("Action", "Adventure", "Fantasy"),
            13, false, R.drawable.wonder_woman, 5, 74,
            "Black Widow", 120),
        Movie(
            listOf("Action", "Adventure", "Fantasy"),
            13, false, R.drawable.wonder_woman, 5, 74,
            "Black Widow", 120),
    )
}
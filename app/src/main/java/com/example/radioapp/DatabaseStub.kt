package com.example.radioapp

class DatabaseStub {

    fun submitSongWish(name: String, songName: String, artistName: String) {
        println("Song Wunsch abgegeben: $name, $songName, $artistName")
    }

    fun ratePlaylist(rating: Int) {
        println("Playlist bewertet mit: $rating")
    }

    fun rateModerator(rating: Int) {
        println("Moderator bewertet mit: $rating")
    }
    fun storeHostRating(rating: Float) {
        println("Moderator Bewertung gespeichert: $rating")
    }
}

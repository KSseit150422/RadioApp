package com.example.radioapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class SongWishActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_song_wish)

        val nameInput = findViewById<EditText>(R.id.nameInput)
        val songInput = findViewById<EditText>(R.id.songInput)
        val artistInput = findViewById<EditText>(R.id.artistInput)
        val submitButton = findViewById<Button>(R.id.submitWishButton)

        submitButton.setOnClickListener {
            val name = nameInput.text.toString()
            val song = songInput.text.toString()
            val artist = artistInput.text.toString()

            Toast.makeText(this, "Song Wunsch abgegeben!: $name, $song, $artist", Toast.LENGTH_SHORT).show()
            // Handle the song wish as needed
        }
    }
}
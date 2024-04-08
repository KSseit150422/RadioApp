package com.example.radioapp

import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.IU.radioapp.R


class RateHostActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rate_host)

        val ratingBar = findViewById<RatingBar>(R.id.hostRatingBar)
        val submitButton = findViewById<Button>(R.id.submitRatingButton)

        submitButton.setOnClickListener {
            val rating = ratingBar.rating
            Toast.makeText(this, "Bewertung abgegeben!: $rating", Toast.LENGTH_SHORT).show()
            // Handle the rating as needed
        }
    }
}
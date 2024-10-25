package com.example.trivia_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        val correctAnswers = intent.getIntExtra("correct_answers", 0)
        val totalQuestions = intent.getIntExtra("total_questions", 5) // Default is 5

        val resultsText: TextView = findViewById(R.id.resultsText)
        val messageText: TextView = findViewById(R.id.messageText)

        resultsText.text = "You got $correctAnswers out of $totalQuestions correct!"

        val message = when (correctAnswers) {
            in 4..5 -> "Great Job!"
            in 2..3 -> "Good effort! Keep practicing."
            else -> "Better luck next time!"
        }
        messageText.text = message

        val restartButton: Button = findViewById(R.id.restartButton)
        restartButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()  // Finish the ResultsActivity
        }

    }
}

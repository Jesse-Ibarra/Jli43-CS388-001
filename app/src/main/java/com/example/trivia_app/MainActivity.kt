package com.example.trivia_app

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)

        val triviaQuestions = loadTriviaQuestions()

        val selectedQuestions = triviaQuestions.shuffled().take(5)

        val startButton: Button = findViewById(R.id.startButton)

        startButton.setOnClickListener {
            val intent = Intent(this, TriviaActivity::class.java)
            Log.d("MainActivity", "Starting TriviaActivity with ${selectedQuestions.size} questions")
            intent.putParcelableArrayListExtra("trivia_questions", ArrayList(selectedQuestions))
            startActivity(intent)
        }
    }

    private fun loadTriviaQuestions(): List<TriviaQuestion> {
        val inputStream = resources.openRawResource(R.raw.trivia_questions)
        val reader = InputStreamReader(inputStream)
        val triviaType = object : TypeToken<List<TriviaQuestion>>() {}.type
        val triviaQuestions: List<TriviaQuestion> = Gson().fromJson(reader, triviaType)
        reader.close()
        return triviaQuestions
    }
}


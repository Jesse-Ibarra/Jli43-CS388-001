package com.example.trivia_app

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TriviaActivity : AppCompatActivity() {

    private lateinit var triviaQuestions: List<TriviaQuestion>
    private var currentQuestionIndex: Int = 0
    private var correctAnswersCount: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trivia)

        triviaQuestions = intent.getParcelableArrayListExtra("trivia_questions") ?: emptyList()

        Log.d("TriviaActivity", "Received ${triviaQuestions.size} trivia questions")

        showQuestion()

        setupAnswerButtons()
    }

    private fun showQuestion() {

        val currentQuestion = triviaQuestions[currentQuestionIndex]

        Log.d("TriviaActivity", "Showing question: ${currentQuestion.question}")
        val questionText: TextView = findViewById(R.id.questionText)
        val answerButton1: Button = findViewById(R.id.answerButton1)
        val answerButton2: Button = findViewById(R.id.answerButton2)
        val answerButton3: Button = findViewById(R.id.answerButton3)
        val answerButton4: Button = findViewById(R.id.answerButton4)

        answerButton1.isEnabled = true
        answerButton2.isEnabled = true
        answerButton3.isEnabled = true
        answerButton4.isEnabled = true

        questionText.text = currentQuestion.question
        answerButton1.text = currentQuestion.answers[0]
        answerButton2.text = currentQuestion.answers[1]
        answerButton3.text = currentQuestion.answers[2]
        answerButton4.text = currentQuestion.answers[3]
    }


    private fun setupAnswerButtons() {

        val answerButton1: Button = findViewById(R.id.answerButton1)
        val answerButton2: Button = findViewById(R.id.answerButton2)
        val answerButton3: Button = findViewById(R.id.answerButton3)
        val answerButton4: Button = findViewById(R.id.answerButton4)

        val answerButtons = listOf(answerButton1, answerButton2, answerButton3, answerButton4)

        answerButtons.forEach { button ->
            button.setOnClickListener {
                handleAnswer(button.text.toString())
            }
        }
    }

    private fun handleAnswer(selectedAnswer: String) {
        val currentQuestion = triviaQuestions[currentQuestionIndex]

        Log.d("TriviaActivity", "Selected answer: $selectedAnswer")
        Log.d("TriviaActivity", "Correct answer: ${currentQuestion.correctAnswer}")

        if (selectedAnswer == currentQuestion.correctAnswer) {
            correctAnswersCount++
            Log.d("TriviaActivity", "Correct! Total correct answers: $correctAnswersCount")
        } else {
            Log.d("TriviaActivity", "Incorrect.")
        }

        currentQuestionIndex++
        if (currentQuestionIndex < triviaQuestions.size) {
            showQuestion()
        } else {
            showResults()
        }
    }

    private fun showResults() {

        Log.d("TriviaActivity", "Quiz finished. Correct answers: $correctAnswersCount / ${triviaQuestions.size}")

        val intent = Intent(this, ResultsActivity::class.java)
        intent.putExtra("correct_answers", correctAnswersCount)
        intent.putExtra("total_questions", triviaQuestions.size)
        startActivity(intent)
        finish()
    }

}

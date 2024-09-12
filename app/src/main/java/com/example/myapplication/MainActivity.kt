package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import android.widget.ImageView
import android.os.Handler
import android.os.Looper
import android.view.animation.AlphaAnimation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val imageView1 = findViewById<ImageView>(R.id.imageView1)

        val fadeIn = AlphaAnimation(0f, 1f).apply {
            duration = 500 // Duration for fade in (milliseconds)
        }
        val fadeOut = AlphaAnimation(1f, 0f).apply {
            duration = 500 // Duration for fade out (milliseconds)
            startOffset = 500 // Delay before starting the fade-out (to keep image visible)
        }
        button.setOnClickListener {
            Log.v("Hello world", "Button clicked!")

            imageView1.startAnimation(fadeIn)
            imageView1.visibility = ImageView.VISIBLE

            // Hide the image after 1 seconds
            Handler(Looper.getMainLooper()).postDelayed({
                imageView1.startAnimation(fadeOut)
                imageView1.visibility = ImageView.GONE
            }, 1000)
            // Inflate the custom toast layout
            val inflater = layoutInflater
            val layout = inflater.inflate(R.layout.custom_toast, findViewById(R.id.custom_toast_message))

            // Create and show the custom toast
            val toast = Toast(applicationContext)
            toast.duration = Toast.LENGTH_SHORT
            toast.view = layout
            toast.show()


        }
    }
}
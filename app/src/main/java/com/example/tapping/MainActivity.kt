package com.example.tapping
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var counter = 0
        var number = 1
        val incrementButton = findViewById<ImageButton>(R.id.b1)
        val upgradeButton = findViewById<ImageButton>(R.id.b2)
        val upgradetext = findViewById<TextView>(R.id.buttonText1)
        val appearanceButton = findViewById<ImageButton>(R.id.b3)
        val appearancetext = findViewById<TextView>(R.id.buttonText2)
        val counterTextView = findViewById<TextView>(R.id.textView)
        val newincrementButton = findViewById<ImageButton>(R.id.b4)
        val mainLayout = findViewById<ConstraintLayout>(R.id.main)
        val newgalaxyButton = findViewById<ImageButton>(R.id.b5)
        val newgalaxytext = findViewById<TextView>(R.id.textView3)
        val earthButton = findViewById<ImageButton>(R.id.b6)
        val earthtext = findViewById<TextView>(R.id.textView4)
        val goal_5 = findViewById<TextView>(R.id.goal5)
        val check_1 = findViewById<ImageView>(R.id.check1)
        val check_2 = findViewById<ImageView>(R.id.check2)
        val check_3 = findViewById<ImageView>(R.id.check3)
        val check_4 = findViewById<ImageView>(R.id.check4)

        var background = 0
        var upgrade = true
        var appearance = true

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)

            incrementButton.setOnClickListener {
                counter += number
                counterTextView.text = counter.toString()
                if (counter >= 20 && appearance) {
                    appearanceButton.visibility = Button.VISIBLE
                    appearancetext.visibility = TextView.VISIBLE

                }
                if (counter >= 20 && upgrade) {
                    upgradeButton.visibility = Button.VISIBLE
                    upgradetext.visibility = TextView.VISIBLE
                }
            }

            upgradeButton.setOnClickListener {
                if (counter >= 20) {
                    counter = counter - 20
                    counterTextView.text = counter.toString()
                    number += 1
                    upgrade = false
                    Toast.makeText(this, "Upgrade successful!", Toast.LENGTH_SHORT).show()
                    upgradeButton.visibility = Button.GONE
                    upgradetext.visibility = TextView.GONE
                    check_2.visibility = ImageView.VISIBLE

                    if (counter < 20) {
                        appearanceButton.visibility = Button.INVISIBLE
                        appearancetext.visibility = TextView.INVISIBLE
                    }
                }
            }

            appearanceButton.setOnClickListener {
                if (counter >= 20) {
                    counter = counter - 20
                    counterTextView.text = counter.toString()
                    appearance = false
                    Toast.makeText(this, "New Rocket!", Toast.LENGTH_SHORT).show()
                    appearanceButton.visibility = Button.GONE
                    appearancetext.visibility = TextView.GONE
                    incrementButton.visibility = ImageButton.GONE
                    newincrementButton.visibility = ImageButton.VISIBLE
                    check_1.visibility = ImageView.VISIBLE

                    if (counter < 20) {
                        upgradeButton.visibility = Button.INVISIBLE
                        upgradetext.visibility = TextView.INVISIBLE
                    }
                }
            }

            newincrementButton.setOnClickListener {
                counter += number
                counterTextView.text = counter.toString()
                if (counter >= 20 && upgrade) {
                    upgradeButton.visibility = Button.VISIBLE
                    upgradetext.visibility = TextView.VISIBLE
                }
                if (background == 0 && counter >= 20 && !appearance && !upgrade) {
                    newgalaxyButton.visibility = Button.VISIBLE
                    newgalaxytext.visibility = TextView.VISIBLE
                }
                if (background == 1 && counter >= 20 && !appearance && !upgrade) {
                    earthButton.visibility = Button.VISIBLE
                    earthtext.visibility = TextView.VISIBLE
                }
            }

            newgalaxyButton.setOnClickListener {
                    background += 1
                    counter = counter - 20
                    counterTextView.text = counter.toString()
                    Toast.makeText(this, "Getting closer to earth!", Toast.LENGTH_SHORT).show()
                    mainLayout.setBackgroundResource(R.drawable.galaxy2jpeg)
                    newgalaxyButton.visibility = Button.GONE
                    newgalaxytext.visibility = TextView.GONE
                    check_3.visibility = ImageView.VISIBLE
            }

            earthButton.setOnClickListener {
                counter = counter - 20
                background += 1
                counterTextView.text = counter.toString()
                Toast.makeText(this, "You made it home!", Toast.LENGTH_SHORT).show()
                mainLayout.setBackgroundResource(R.drawable.earth)
                earthButton.visibility = Button.GONE
                earthtext.visibility = TextView.GONE
                goal_5.visibility = TextView.VISIBLE
                check_4.visibility = ImageView.VISIBLE
            }
            insets
            }
        }
    }
package com.example.dice_roller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.dice_roller.R
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the Button in the layout
        val roll2Button: Button = findViewById(R.id.buttonD2)
        val roll4Button: Button = findViewById(R.id.buttonD4)
        val roll6Button: Button = findViewById(R.id.buttonD6)
        val roll8Button: Button = findViewById(R.id.buttonD8)
        val roll10Button: Button = findViewById(R.id.buttonD10)
        val roll12Button: Button = findViewById(R.id.buttonD12)
        val roll20Button: Button = findViewById(R.id.buttonD20)
        val roll100Button: Button = findViewById(R.id.buttonD100)

        // Set a click listener on the button to roll the dice when the user taps the button
        roll2Button.setOnClickListener {rollDice(2)}
        roll4Button.setOnClickListener {rollDice(4)}
        roll6Button.setOnClickListener {rollDice(6)}
        roll8Button.setOnClickListener {rollDice(8)}
        roll10Button.setOnClickListener {rollDice(10)}
        roll12Button.setOnClickListener {rollDice(12)}
        roll20Button.setOnClickListener {rollDice(20)}
        roll100Button.setOnClickListener {rollDice(100)}
    }

    private fun rollDice(numSides: Int) {
        // Create new Dice object with 6 sides and roll it

        val dice = Dice(numSides)
        val diceRoll = dice.roll()



        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}

class Dice(private val numSide: Int) {

    fun roll(): Int {
        return (1..numSide).random()
    }
}
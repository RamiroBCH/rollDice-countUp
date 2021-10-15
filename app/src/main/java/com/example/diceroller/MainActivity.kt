package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val countUpButton: Button = findViewById(R.id.countUp)
        countUpButton.setOnClickListener { countUp() }
    }
    private fun rollDice(){
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }
    private fun countUp(){
        Toast.makeText(this, "count",
            Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        var cont = resultText.text.toString()
        when(cont){
            "Hello World!" -> cont = "1"
            "1" -> cont = "2"
            "2" -> cont = "3"
            "3" -> cont = "4"
            "4" -> cont = "5"
            "5" -> cont = "6"
            "6" -> return
        }

        resultText.text = cont
    }
}
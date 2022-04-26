package com.example.decider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlin.random.Random
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultsTextView = findViewById<TextView>(R.id.resultsTextView)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val ChoiceCount = findViewById<TextView>(R.id.ChoiceCount)

        rollButton.setOnClickListener{

            val rand = Random.nextInt(seekBar.progress + 1) + 1
            resultsTextView.text = rand.toString()

            //ChoiceCount.text = "How many choices(" + seekBar.progress.toString() + ")?"

        }




    }
}
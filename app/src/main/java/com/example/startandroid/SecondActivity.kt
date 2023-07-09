package com.example.startandroid

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random

class SecondActivity : AppCompatActivity() {
    companion object {
        const val TOTAL_COUNT = "total_count"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    fun showRandomNumber() {
        val textViewRandom = findViewById<TextView>(R.id.textViewRandom)
        val textViewLabel = findViewById<TextView>(R.id.textViewLabel)

        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        val random = Random()
        var randomInt = 0

        if(count > 0) {
            randomInt = random.nextInt(count + 1)
        }
        textViewRandom.text = Integer.toString(randomInt)
        textViewLabel.text = getString(R.string.random_heading, count)

    }
}
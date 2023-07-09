package com.example.startandroid

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Hello, Toast!", Toast.LENGTH_SHORT)

        myToast.show()
    }

    fun countMe(view: View) {
        val counter = findViewById<TextView>(R.id.counter)
        val countString = counter.text.toString()

        var count: Int = Integer.parseInt(countString)
        count++

        counter.text = count.toString()
    }
}
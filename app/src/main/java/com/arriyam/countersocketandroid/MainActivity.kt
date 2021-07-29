package com.arriyam.countersocketandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counterBtn = findViewById<Button>(R.id.counterBtn)
        val countTextView = findViewById<TextView>(R.id.countTextView)

        counterBtn.setOnClickListener{

        }
    }
}
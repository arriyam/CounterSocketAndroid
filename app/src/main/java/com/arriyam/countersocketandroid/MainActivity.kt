package com.arriyam.countersocketandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // The following lines connects the Android app to the server.
        SocketHandler.setSocket()
        SocketHandler.establishConnection()

        val counterBtn = findViewById<Button>(R.id.counterBtn)
        val countTextView = findViewById<TextView>(R.id.countTextView)

        val mSocket = SocketHandler.getSocket()

        counterBtn.setOnClickListener{
            mSocket.emit("counter")
        }

        mSocket.on("counter") { args ->
            if (args[0] != null) {
                val counter = args[0] as Int
                runOnUiThread {
                    countTextView.text = counter.toString()
                }
            }
        }
    }
}
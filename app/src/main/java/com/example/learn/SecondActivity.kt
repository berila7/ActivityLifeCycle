package com.example.learn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i("MYTAGE", "SecondActivity: onCreate")
        val userName = intent.getStringExtra("USER")
        val textView = findViewById<TextView>(R.id.tvOffer)
        val message = "$userName you well get access for all content for a month"
        textView.text = message
    }

    override fun onStart() {
        super.onStart()
        Log.i("MYTAGE", "SecondActivity: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MYTAGE", "SecondActivity: onResum")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MYTAGE", "SecondActivity: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MYTAGE", "SecondActivity: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MYTAGE", "SecondActivity: onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MYTAGE", "SecondActivity: onRestart")
    }
}
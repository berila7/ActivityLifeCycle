package com.example.learn

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MYTAGE", "MainActivity: OnCreate")
        val txtView = findViewById<TextView>(R.id.textView)
        val inputFleid = findViewById<EditText>(R.id.editName)
        val btn = findViewById<Button>(R.id.btnSubmit)
        val offersBtn = findViewById<Button>(R.id.btnOfferse)
        var entredName: String = ""
        btn.setOnClickListener {
            entredName = inputFleid.text.toString()
            if(entredName.isEmpty()) {
                offersBtn.visibility = INVISIBLE
                txtView.text = ""
                Toast.makeText(
                    this@MainActivity,
                    "Please, enter your name!",
                    Toast.LENGTH_SHORT
                ).show()
            }else {
                txtView.text = "Welcome $entredName"
                inputFleid.text.clear()
                offersBtn.visibility = VISIBLE
            }
        }
        offersBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("USER", entredName)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("MYTAGE", "MainActivity: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MYTAGE", "MainActivity: onResum")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MYTAGE", "MainActivity: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MYTAGE", "MainActivity: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MYTAGE", "MainActivity: onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MYTAGE", "MainActivity: onRestart")
    }



}

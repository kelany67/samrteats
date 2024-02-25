package com.example.nutri

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Allgeries : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_allgeries)

        val bttn = findViewById<Button>(R.id.Btnext)
        val BTTN = findViewById<Button>(R.id.fruits)

        bttn.setOnClickListener {
            // Code to open the new activity
            val intent = Intent(this, eatinghabits::class.java)
            startActivity(intent)
        }

        BTTN.setOnClickListener {
            // Code to open the new activity
            val intent = Intent(this, DetailedfruitsActivity::class.java)
            startActivity(intent)
        }


    }
}
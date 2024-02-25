package com.example.nutri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class healthgoals : AppCompatActivity() {
    lateinit var butt: Button
    lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_healthgoals)

        val butt = findViewById<Button>(R.id.Btnext)
        butt.setOnClickListener {
            // Code to open the new activity
            val intent = Intent(this, Allgeries::class.java)
            startActivity(intent)

        }

        val btn = findViewById<Button>(R.id.weightloss)
        btn.setOnClickListener {
            // Code to open the new activity
            val intent = Intent(this, DiettypeActivity::class.java)
            startActivity(intent)

        }

    }
}
package com.example.nutri

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class eatinghabits : AppCompatActivity() {

    lateinit var btnnext: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eatinghabits)
        val btnnext = findViewById<Button>(R.id.BtnNext)
        btnnext.setOnClickListener {
            // Code to open the new activity
            val intent = Intent(this,PhysicalactivityActivity  ::class.java)
            startActivity(intent)
        }
    }


}
package com.example.nutri

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class personalnf : AppCompatActivity()
{
    lateinit var btnext: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personalnf)

        val btnext = findViewById<Button>(R.id.btnext)

        btnext.setOnClickListener {
            // Code to open the new activity
            val intent = Intent(this, healthgoals::class.java)
            startActivity(intent)
        }
    }

    }



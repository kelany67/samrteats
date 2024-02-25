package com.example.nutri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PhysicalactivityActivity : AppCompatActivity() {
    lateinit var btnnext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.physicalactivity)

        val btnnext = findViewById<Button>(R.id.nextbtn)
        btnnext.setOnClickListener {
            // Code to open the new activity
            val intent = Intent(this,MedicalhistoryActivity  ::class.java)
            startActivity(intent)
        }
    }
    }

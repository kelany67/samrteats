package com.example.nutri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MedicalhistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.medicalhistory)


        val butt = findViewById<Button>(R.id.Genetrating)
        butt.setOnClickListener {
            // Code to open the new activity
            val intent = Intent(this, ProgramActivity::class.java)
            startActivity(intent)

        }


    }


}
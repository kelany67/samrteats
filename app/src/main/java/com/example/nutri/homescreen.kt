package com.example.nutri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.nutri.register.RegisterActivity


class homescreen : AppCompatActivity() {
    lateinit var CreateAccount: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homescreen)
        val CreateAccount = findViewById<Button>(R.id.CreateAccount)

        CreateAccount.setOnClickListener {
            // Code to open the new activity
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }


}




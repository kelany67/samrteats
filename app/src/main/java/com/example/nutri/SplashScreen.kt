package com.example.nutri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.content.ContextCompat.startActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler().postDelayed(
            { startHomeScreen() },3000)
    }




fun startHomeScreen()
{
    val intent = Intent(this , homescreen::class.java)
    startActivity(intent)
}
}

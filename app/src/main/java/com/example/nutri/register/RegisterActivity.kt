package com.example.nutri.register

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import com.example.nutri.R
import com.example.nutri.base.BaseActivity
import com.example.nutri.databinding.ActivityRegisterFormBinding
import com.example.nutri.personalnf



class RegisterActivity : BaseActivity<RegisterViewModel, ActivityRegisterFormBinding>() {

    @SuppressLint("MissingInflatedId")
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
        val btnnext  = findViewById<Button>(R.id.btnRegister)
            binding.vm =viewModel

         btnnext.setOnClickListener {
             // Code to open the new activity
             val intent = Intent(this, personalnf::class.java)
             startActivity(intent)
         }

     }

     override fun getLayoutId(): Int = R.layout.activity_register_form
//polymorphism
     override fun initViewModel() : RegisterViewModel
     {
         return ViewModelProvider(this).get(RegisterViewModel::class.java)
     }

 }
















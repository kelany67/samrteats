package com.example.nutri.base

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel

abstract class BaseActivity <VM : ViewModel, B:ViewDataBinding>: AppCompatActivity()
{

 open lateinit var binding: B
 open lateinit var viewModel: VM


 @SuppressLint("MissingInflatedId")
 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  binding = DataBindingUtil.setContentView(this, getLayoutId())
  viewModel = initViewModel()



 }
 abstract fun getLayoutId(): Int


 abstract fun initViewModel(): VM
}

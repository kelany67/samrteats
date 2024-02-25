package com.example.nutri.utils

import androidx.databinding.BindingAdapter
import com.google.android.material.textfield.TextInputLayout


@BindingAdapter("error")
 fun addTextInputError(textInput :TextInputLayout, error:String?)
{

textInput.error =error
}
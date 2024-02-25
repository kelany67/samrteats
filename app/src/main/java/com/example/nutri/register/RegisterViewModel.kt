package com.example.nutri.register

import android.util.Log
import androidx.lifecycle.ViewModel

class RegisterViewModel : ViewModel() {

    var firstName :String =""
    var lastname : String=""
    var email: String =""
    var password :String =""

    fun createaccount()
    {
        if (!validate()) return
        Log.e("createaccount" , "$firstName" + "$lastname" )
    }


    var firstNameError : String? = null
    var lastnameError : String? = null
    var emailError : String? = null
    var passwordError : String? = null

    fun validate(): Boolean {

         var valid = true
        if(firstName.isEmpty())
        {
            firstNameError ="please valid first name "
            valid = false
        }
        else
        {
            firstNameError = null
            valid = false

        }
        if(lastname.isEmpty())
        {
            lastnameError ="please valid last name "
            valid = false

        }
        else
        {
            lastnameError = null
            valid = false

        }
        if(email.isEmpty())
        {
            emailError ="please valid Your Email "
            valid = false

        }
        else
        {
            emailError = null

        }
        if(password.isEmpty())
        {
            passwordError ="please valid your password "
            valid = false

        }
        else
        {
            passwordError = null

        }
        return valid

    }

}
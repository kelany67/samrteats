package com.example.nutri

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.SeekBar

class ProgramActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.program)
        // Find the CheckBox and SeekBar views
        val checkbox1 = findViewById<CheckBox>(R.id.checkbox1)
        val checkbox2 = findViewById<CheckBox>(R.id.checkbox2)
        val checkbox3 = findViewById<CheckBox>(R.id.checkbox3)
        val seekbar = findViewById<SeekBar>(R.id.seekbar)

        // Set the SeekBar progress based on which CheckBox is checked
        val progressValues = intArrayOf(25, 50, 75)
        val checkBoxIds = intArrayOf(R.id.checkbox1, R.id.checkbox2, R.id.checkbox3)

        val checkBoxListener = CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                for (i in checkBoxIds.indices) {
                    if (buttonView.id == checkBoxIds[i]) {
                        seekbar.progress = progressValues[i]
                        break
                    }
                }
            }
        }

        checkbox1.setOnCheckedChangeListener(checkBoxListener)
        checkbox2.setOnCheckedChangeListener(checkBoxListener)
        checkbox3.setOnCheckedChangeListener(checkBoxListener)
        // Set up Tooltips for each CheckBox

        val checkBox = findViewById<CheckBox>(R.id.checkbox1)
        checkBox.setOnClickListener {
            // Open a new activity when the checkbox is clicked
            val intent = Intent(this, DetailedinfoActivity::class.java)
            startActivity(intent)
        }
    }

}



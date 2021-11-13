package com.example.cse224_ca2

import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Ques2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ques2)

        val checkBox = findViewById<CheckBox>(R.id.chkBox)
        val radioBtn: RadioButton = findViewById(R.id.radioBtn)

        radioBtn.setOnClickListener {
            Toast.makeText(this, "Radio Button Selected", Toast.LENGTH_SHORT).show()
        }

        checkBox.setOnClickListener {
            if (checkBox.isChecked) {
                Toast.makeText(this, "checkBox Checked", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "chekcBox Unchecked", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
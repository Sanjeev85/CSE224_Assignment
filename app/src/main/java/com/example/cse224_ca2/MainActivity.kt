package com.example.cse224_ca2

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imgV = findViewById<ImageView>(R.id.img)
        val login = findViewById<Button>(R.id.sign_in)
        val signUp = findViewById<Button>(R.id.signUp)
        val help = findViewById<TextView>(R.id.help)
        val join = findViewById<Button>(R.id.join_meeting)

        help.setOnClickListener {
            Toast.makeText(this, "Help Pressed\n", Toast.LENGTH_SHORT).show()
        }

        login.setOnClickListener {
            Toast.makeText(this, "Login Pressed\n", Toast.LENGTH_SHORT).show()
        }

        signUp.setOnClickListener {
            Toast.makeText(this, "Sign Up Pressed\n", Toast.LENGTH_SHORT).show()
        }

        join.setOnClickListener {
            val snackBar = Snackbar.make(
                it, "Redirecting to Meeting",
                Snackbar.LENGTH_LONG
            ).setAction("Go Back") { Toast.makeText(this, "Toast Text", Toast.LENGTH_SHORT).show() }

            snackBar.setActionTextColor(Color.WHITE)
            val snackBarView = snackBar.view
            snackBarView.setBackgroundColor(R.color.bgcolor)
            snackBar.show()
        }


        val getI = registerForActivityResult(
            ActivityResultContracts.GetContent(),
            ActivityResultCallback {
                imgV.setImageURI(it)
            }
        )

        imgV.setOnClickListener {
            Toast.makeText(this, "Choose Image", Toast.LENGTH_SHORT).show()
            getI.launch("image/*")
        }
    }
}
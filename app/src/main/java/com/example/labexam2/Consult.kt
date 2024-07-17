package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Consult : AppCompatActivity() {

    lateinit var button1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consult)

        button1=findViewById(R.id.button2)

        button1.setOnClickListener {
            // Define the behavior for Button 1 click
            val intent = Intent(this@Consult, Appointment::class.java)
            startActivity(intent)
        }

    }

}
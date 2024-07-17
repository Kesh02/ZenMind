package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Home : AppCompatActivity() {

    //declaring button
    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var imageView1: ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Initialize the button
         button1= findViewById(R.id.button6)
        button2= findViewById(R.id.button9)
        imageView1= findViewById(R.id.imageView11)

        button1.setOnClickListener {
            // Define the behavior for Button 1 click
            val intent = Intent(this@Home, Consult::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            // Define the behavior for Button 1 click
            val intent = Intent(this@Home, Meditation::class.java)
            startActivity(intent)
        }

        imageView1.setOnClickListener {
            // Define your behavior here using Intent
            val intent = Intent(this@Home, Profile::class.java)
            startActivity(intent)
        }

    }





}
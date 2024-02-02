package com.example.hotels

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button1 = findViewById<Button>(R.id.button1)

        button1.setOnClickListener {

            val explicitIntent = Intent(this,SecondActivity::class.java)

            startActivity(explicitIntent)

        }
        var button2 = findViewById<Button>(R.id.button2)

        button2.setOnClickListener {

            val explicitIntent = Intent(this,SecondActivity::class.java)

            startActivity(explicitIntent)

        }
        var button4 = findViewById<Button>(R.id.button4)

        button4.setOnClickListener {

            val explicitIntent = Intent(this,SecondActivity::class.java)

            startActivity(explicitIntent)

        }
        var button5 = findViewById<Button>(R.id.button5)

        button5.setOnClickListener {

            val explicitIntent = Intent(this,SecondActivity::class.java)

            startActivity(explicitIntent)

        }
    }
}

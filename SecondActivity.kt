package com.example.hotels

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val payNowButton: Button = findViewById(R.id.button5)

        payNowButton.setOnClickListener(View.OnClickListener {
            // Start the ThirdActivity and pass the timer duration (5 minutes) as an extra
            val intent = Intent(this@SecondActivity, ThirdActivity::class.java)
            intent.putExtra("TIMER_DURATION", 300000) // 5 minutes in milliseconds
            startActivity(intent)
        })

    }
}

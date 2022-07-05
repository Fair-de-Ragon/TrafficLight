package com.example.trafficlight

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redButton: Button = findViewById(R.id.redButton)
        val yellowButton: Button = findViewById(R.id.yellowButton)
        val greenButton: Button = findViewById(R.id.greenButton)
        val colorName: TextView = findViewById(R.id.colorName)
        val background: ConstraintLayout = findViewById(R.id.rootLayout)

        redButton.setOnClickListener {
            colorName.setText(R.string.red)
            background.setBackgroundColor(Color.RED)
        }

        yellowButton.setOnClickListener {
            colorName.setText(R.string.Yellow)
            background.setBackgroundColor(Color.YELLOW)
        }

        greenButton.setOnClickListener {
            colorName.setText(R.string.Green)
            background.setBackgroundColor(Color.GREEN)
        }

    }
}
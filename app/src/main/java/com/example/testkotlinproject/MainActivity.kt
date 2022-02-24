package com.example.testkotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.testkotlinproject.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button = findViewById<Button>(R.id.main_activity__button)
        button.setOnClickListener { Toast.makeText(this,"Hello!",Toast.LENGTH_LONG).show() }
    }
}
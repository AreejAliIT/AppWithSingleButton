package com.example.appwithsinglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv = findViewById<TextView>(R.id.tv)
        var et = findViewById<EditText>(R.id.et)
        var btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener{
            tv.text = et.text
        }
    }
}
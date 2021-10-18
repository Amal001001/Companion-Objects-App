package com.example.companionobjectsapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layout = findViewById<ConstraintLayout>(R.id.layout)
        val et = findViewById<EditText>(R.id.et)
        val button = findViewById<Button>(R.id.button)
        val tv = findViewById<TextView>(R.id.tv)

        button.setOnClickListener{

            var choice = et.text?.toString()
                when(choice?.lowercase()){
                    "day"-> chosen.changeBackground(layout,constant.day)
                    "night"-> chosen.changeBackground(layout,constant.night)
                }
        }


    }
}
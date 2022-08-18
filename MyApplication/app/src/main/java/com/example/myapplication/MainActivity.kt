package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //show layout file
        setContentView(R.layout.activity_main)

        //user tap the button to change the text color
        //1. add a button

        //set up logic
        findViewById<Button>(R.id.button).setOnClickListener {
            //2.change the color of text
            Log.i("Jiayi", "TAP ON BUTTON")
            //set the color of textview
            findViewById<TextView>(R.id.textView).setTextColor(R.color.white)
        }




    }
}
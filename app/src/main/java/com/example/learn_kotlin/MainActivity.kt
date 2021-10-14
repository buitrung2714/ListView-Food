package com.example.learn_kotlin

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonIntent = findViewById<Button>(R.id.buttonIntent)

        buttonIntent.setOnClickListener {
            val intent : Intent = Intent(this, SecondActivity::class.java)
//            intent.putExtra("data","Tyson Bui") // truyền chuỗi
//            intent.putExtra("data", 2712) //truyền số
//            val arrayInt : IntArray = intArrayOf(123,456,789)
//            intent.putExtra("data", arrayInt)
            val vehicle : Vehicle = Vehicle("BMW","Black",4)
            intent.putExtra("data",vehicle)

            startActivity(intent)
        }
    }
}
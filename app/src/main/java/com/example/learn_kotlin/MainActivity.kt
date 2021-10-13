package com.example.learn_kotlin

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
        val listview = findViewById<ListView>(R.id.listview)
        var arraymonan: ArrayList<Food> = ArrayList()
        arraymonan.add(Food("Eg 1", R.mipmap.ic_launcher))
        arraymonan.add(Food("Eg 2", R.mipmap.ic_launcher_round))
        listview.adapter = CustomAdaptor(this@MainActivity, arraymonan)
    }
}
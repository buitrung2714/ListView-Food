package com.example.learn_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val txtKetqua = findViewById<TextView>(R.id.txtKetqua)
        val intent = intent
        val hoten: String? = intent.getStringExtra("data")
        val so: Int = intent.getIntExtra("data",1234) //Không có giá trị sẽ trả về value default (param 2)
        val mangso: IntArray? = intent.getIntArrayExtra("data")
        val car : Vehicle = intent.getSerializableExtra("data") as Vehicle

        txtKetqua.text = car.name + " - " + car.color
    }
}
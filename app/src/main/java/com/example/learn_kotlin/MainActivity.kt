package com.example.learn_kotlin

import android.content.Intent
import android.graphics.Color
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnXuly = findViewById<Button>(R.id.btnXuly)

        btnXuly.setOnClickListener {
            XuLyCongViec().execute()
        }
    }

   inner class XuLyCongViec : AsyncTask<Void, String, String>(){
        override fun onPreExecute() {
            super.onPreExecute()
            val txtKetqua = findViewById<TextView>(R.id.txtKetqua)
            Log.d("key", "Bắt đầu công việc")
            txtKetqua.text = "Bắt đầu công việc \n"
        }
        override fun doInBackground(vararg p0: Void?): String {
            for (cv in 1..3){
                publishProgress("Xong công việc $cv")
            }

            return "Hoàn thành"
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            val txtKetqua = findViewById<TextView>(R.id.txtKetqua)
            if (result != null) {
                Log.d("key", result)
            }
            txtKetqua.append(result)
        }

        override fun onProgressUpdate(vararg values: String?) {
            Log.d("key", "Xong cv $values")
            super.onProgressUpdate(*values)
        }
    }
}
package com.example.kasimadalan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        benimButton.setOnClickListener {
            //benimTextView.text = "Merhaba"

            val intent = Intent(this@MainActivity,OyunEkrani::class.java)
            startActivity(intent)


        }

    }
}
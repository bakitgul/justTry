package com.example.kasimadalan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_oyun_ekrani.*

class OyunEkrani : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oyun_ekrani)
        buttonBitir.setOnClickListener {

            val intent = Intent(this@OyunEkrani, SonucEkrani::class.java)
            startActivity(intent)
            finish()

        }
    }

    override fun onBackPressed() {
        val cikisIntent = Intent(Intent.ACTION_MAIN)
        cikisIntent.addCategory(Intent.CATEGORY_HOME)
        cikisIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(cikisIntent)
    }
}
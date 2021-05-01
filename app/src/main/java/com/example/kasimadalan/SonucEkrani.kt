package com.example.kasimadalan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sonuc_ekrani.*

class SonucEkrani : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sonuc_ekrani)

        buttonAnasayfaGit.setOnClickListener {
            val intent = Intent(this@SonucEkrani,MainActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}
package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import org.xml.sax.HandlerBase

class SpashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spash_screen)

        Handler(Looper.getMainLooper()).postDelayed({
         startActivity(Intent(this,MainActivity::class.java))
         finish()
        },3000)
    }
}
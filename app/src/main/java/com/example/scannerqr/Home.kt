package com.example.scannerqr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)

        val btnScan = findViewById<Button>(R.id.Scan)

        btnScan.setOnClickListener({
            val siguiente = Intent(this, Scan::class.java)
            startActivity(siguiente)
            finish()
        })
    }
}
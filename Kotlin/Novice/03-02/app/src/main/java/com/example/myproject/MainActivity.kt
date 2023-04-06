package com.example.myproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val btnMove: Button = findViewById(R.id.btn_move)
        btnMove.setOnClickListener {
            val moveIntent = Intent(this, DetailActivity::class.java)
            startActivity(moveIntent)
            moveIntent.putExtra(DetailActivity.EXTRA_VALUE,"intent")
            startActivity(intent)
        }
    }
}
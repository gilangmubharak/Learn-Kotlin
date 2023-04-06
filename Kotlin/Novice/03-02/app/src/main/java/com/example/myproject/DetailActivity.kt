package com.example.myproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val name: String? = intent.getStringExtra(EXTRA_VALUE)
        val tvName: TextView = findViewById(R.id.tv_name)
        tvName.text= name
    }

    companion object {
        const val EXTRA_VALUE: String= "extra_value"
    }
}
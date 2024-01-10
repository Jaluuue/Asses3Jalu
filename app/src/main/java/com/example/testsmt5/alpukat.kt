package com.example.testsmt5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class alpukat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alpukat)
    }

    fun btn_next(view: View?) {
        val a = Intent(this@alpukat, HowToPlay::class.java)
        startActivity(a)
    }

    fun btn_back(view: View?) {
        val a = Intent(this@alpukat, melon::class.java)
        startActivity(a)
    }
}


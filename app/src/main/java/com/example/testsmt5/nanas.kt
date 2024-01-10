package com.example.testsmt5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class nanas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nanas)
    }

    fun btn_back(view: View?) {
        val a = Intent(this@nanas, apel::class.java)
        startActivity(a)
    }

    fun btn_next(view: View?) {
        val a = Intent(this@nanas, kiwi::class.java)
        startActivity(a)
    }
}


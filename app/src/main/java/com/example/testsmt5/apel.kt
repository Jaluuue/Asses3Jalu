package com.example.testsmt5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class apel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apel)
    }

    fun btn_next(view: View?) {
        val a = Intent(this@apel, nanas::class.java)
        startActivity(a)
    }

    fun btn_back(view: View?) {
        val a = Intent(this@apel, MainscreenActivity::class.java)
        startActivity(a)
    }
}


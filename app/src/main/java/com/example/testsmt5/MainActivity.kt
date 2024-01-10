package com.example.testsmt5

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btn_Login(view: View?) {
        val a = Intent(this@MainActivity, MainscreenActivity::class.java)
        startActivity(a)
    }
}
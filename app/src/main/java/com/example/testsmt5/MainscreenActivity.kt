package com.example.testsmt5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainscreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainscreen)
    }

    fun btn_start(view: View?) {
        val a = Intent(this@MainscreenActivity, apel::class.java)
        startActivity(a)
    }

    fun btn_about(view: View?) {
        val a = Intent(this@MainscreenActivity, AboutActivity::class.java)
        startActivity(a)
    }
    fun btn_htp(view: View?) {
        val a = Intent(this@MainscreenActivity, HowToPlay::class.java)
        startActivity(a)
    }

    fun btn_detail(view: View?) {
        val a = Intent(this@MainscreenActivity, listbuah::class.java)
        startActivity(a)
    }
    fun btn_sayur(view: View?) {
        val a = Intent(this@MainscreenActivity, buahsayur::class.java)
        startActivity(a)
    }
}


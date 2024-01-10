package com.example.testsmt5

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.testsmt5.MainActivity

class Splash : AppCompatActivity() {

    // Waktu tampilan splash (dalam milidetik)
    private val SPLASH_TIME: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Menggunakan Handler untuk menunda pindah ke aktivitas utama
        Handler().postDelayed({
            val intent = Intent(this, slide_button::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME)
    }
}
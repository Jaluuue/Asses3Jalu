package com.example.testsmt5

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.testsmt5.databinding.ActivityMainBinding
import com.example.testsmt5.databinding.ActivityUserBinding


class UserActivity : AppCompatActivity () {

    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val country = intent.getStringExtra("country")
        val imageId = intent.getIntExtra("imageId",R.drawable.alpukat)

        binding.CdName.text = name
        binding.phoneNum.text = phone
        binding.cdCountry.text = country
        binding.Cdprofpic.setImageResource(imageId)

    }
}
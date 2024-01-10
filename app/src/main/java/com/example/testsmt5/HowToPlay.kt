package com.example.testsmt5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class HowToPlay : AppCompatActivity() {

    private val imageList = ArrayList<SlideModel>() // Create image list

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_how_to_play)

        // imageList.add(SlideModel("String Url" or R.drawable)
        // imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(SlideModel("https://manfaatkesehatan.com/wp-content/uploads/2020/08/manfat-buah-anggur-scaled.jpg"))
        imageList.add(SlideModel("https://manfaatkesehatan.com/wp-content/uploads/2020/08/Manfaat-buah-nanas-scaled.jpg"))
        imageList.add(SlideModel("https://tse4.mm.bing.net/th?id=OIP.B3oxiG_YG1QP5Dc4cu4HnwHaEc&pid=Api&P=0&h=180"))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)
    }

    fun btn_submit(view: View?) {
        val a = Intent(this@HowToPlay, MainActivity::class.java)
        startActivity(a)
    }
}

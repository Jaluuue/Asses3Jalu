package com.example.testsmt5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testsmt5.databinding.ActivityListbuahBinding

import com.example.testsmt5.databinding.ActivityMainBinding

class listbuah : AppCompatActivity() {

    private lateinit var binding : ActivityListbuahBinding
    private lateinit var userArrayList: ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListbuahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(

            R.drawable.alpukat,R.drawable.apel,R.drawable.berry,R.drawable.kiwi,R.drawable.melon,
            R.drawable.nanas,R.drawable.buah,R.drawable.terong,R.drawable.tebu

        )

        val name = arrayOf(

            "Alpukat",
            "Apel",
            "Berry",
            "Kiwi",
            "Melon",
            "Nanas",
            "Buah-Buahan",
            "Terong",
            "Tebu"
        )

        val lastmisscall = arrayOf(

            "Mengandung Lemak Sehat","Enak dan Penuh Manfaat","Asem dan Warnanya Cantik","Buah Hijau yang penuh manfaat","Melon Bagus untuk kesehatan kulit","Bagus untuk menghaluskan daging",
            "Penuh Manfaat!!","Sayur atau Buah?","Manis dan Sehat!!"
        )

        val misstime = arrayOf(

            "Hijau","Merah","Warna Warni","Hijau","Hijau dan Kuning!","Kuning","Warna Warni!!","Ungu","Hijau dan Coklat"
        )

        val phoneNo = arrayOf(

            "Mengandung Lemak Sehat","Enak dan Penuh Manfaat","Asem dan Warnanya Cantik","Buah Hijau yang penuh manfaat","Melon Bagus untuk kesehatan kulit","Bagus untuk menghaluskan daging",
            "Penuh Manfaat!!","Sayur atau Buah?","Manis dan Sehat!!"
        )

        val country = arrayOf(

            "Hijau","Merah","Warna Warni","Hijau","Hijau dan Kuning!","Kuning","Warna Warni!!","Ungu","Hijau dan Coklat"
        )

        userArrayList = ArrayList()

        for (i in name.indices){

            val user = User(name[i],lastmisscall[i],misstime[i],phoneNo[i],country[i],imageId[i])
            userArrayList.add(user)
        }

        binding.listview.isClickable = true
        binding.listview.adapter = MyAdapter(this,userArrayList)
        binding.listview.setOnItemClickListener {parent, view, position, id ->

            val name = name[position]
            val phone = phoneNo[position]
            val country = country[position]
            val imageId = imageId[position]

            val i = Intent(this,UserActivity::class.java)
            i.putExtra("name",name)
            i.putExtra("phone",phone)
            i.putExtra("country",country)
            i.putExtra("imageId",imageId)
            startActivity(i)
        }
    }
}
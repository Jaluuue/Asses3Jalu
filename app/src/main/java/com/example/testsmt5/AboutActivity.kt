package com.example.testsmt5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior

class AboutActivity : AppCompatActivity() {

    private lateinit var bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about)

        bottomSheetBehavior = BottomSheetBehavior.from(findViewById(R.id.bottomSheet))

        val linearGame = findViewById<Button>(R.id.button_share)
        linearGame.setOnClickListener {
            showBottomSheet()
        }

        bottomSheetBehavior.addBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                // Tambahkan logika yang sesuai berdasarkan onSlide
            }

            override fun onStateChanged(bottomSheet: View, newState: Int) {
                // Tambahkan logika yang sesuai berdasarkan newState
                // Misalnya, Anda dapat mengubah teks pada buttonBottomSheetPersistent
            }
        })
    }

    private fun showBottomSheet() {
        bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
    }
}

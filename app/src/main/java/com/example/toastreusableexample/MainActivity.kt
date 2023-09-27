package com.example.toastreusableexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast("This is a toast message")

        displayToastMsg()
    }

    private fun displayToastMsg() {
        showToast("Display Toast ")
    }


}
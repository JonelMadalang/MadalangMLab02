package com.example.madalangmlab02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)
    }

    fun goOrder(view: View){
        val intent= Intent(this,OrderForm::class.java)
        startActivity(intent)
    }
}
package com.example.madalangmlab02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ConfirmOrder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm_order)

        val cName = findViewById<TextView>(R.id.txtCustName)
        val cNum = findViewById<TextView>(R.id.txtCustNum)
        val cDelivery = findViewById<TextView>(R.id.txtCustDelivery)
        val cEmail = findViewById<TextView>(R.id.txtCustEmail)

        cName.text = intent.getStringExtra("NAME")
        cNum.text = intent.getStringExtra("MOBILE")
        cDelivery.text = intent.getStringExtra("DELIVERY")
        cEmail.text = intent.getStringExtra("EMAIL")
    }
}
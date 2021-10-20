package com.example.madalangmlab02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.result.contract.ActivityResultContracts

class OrderForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_form)

        val btnOrder = findViewById<Button>(R.id.btnOrder)
        val name = findViewById<EditText>(R.id.etName)
        val mobile = findViewById<EditText>(R.id.etNum)
        val delivery = findViewById<EditText>(R.id.etDeliveryAddress)
        val email = findViewById<EditText>(R.id.etEmailAddress)

        btnOrder.setOnClickListener {
            val myIntent = Intent(this@OrderForm, ConfirmOrder::class.java)
            val custName = name.text.toString()
            val custMob = mobile.text.toString()
            val custDelivery = delivery.text.toString()
            val custEmail = email.text.toString()

            myIntent.putExtra("NAME", custName)
            myIntent.putExtra("MOBILE", custMob)
            myIntent.putExtra("DELIVERY", custDelivery)
            myIntent.putExtra("EMAIL", custEmail)

            startActivityForResult(myIntent,1)
        }
    }
}
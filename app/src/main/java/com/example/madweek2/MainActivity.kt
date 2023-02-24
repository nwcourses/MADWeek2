package com.example.madweek2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // find the buttons using their IDs
        val btnPlus = findViewById<Button>(R.id.btnPlus)
        val btnMinus = findViewById<Button>(R.id.btnMinus)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)

        // find the edit texts using their IDs
        val etNum1 = findViewById<EditText>(R.id.etNum1)
        val etNum2 = findViewById<EditText>(R.id.etNum2)

        // Handle click events on all four buttons
        btnPlus.setOnClickListener {
            // Read the two numbers from the edit texts
            val num1 = etNum1.text.toString().toDouble()
            val num2 = etNum2.text.toString().toDouble()

            // Set the contents of the edit text  to the result
            // We have to use ${} to convert the number (num1+num2) to a string
            findViewById<TextView>(R.id.tvResults).text = "${num1 + num2}"
        }

        btnMinus.setOnClickListener {
            // Read the two numbers from the edit texts
            val num1 = etNum1.text.toString().toDouble()
            val num2 = etNum2.text.toString().toDouble()

            // Set the contents of the edit text  to the result
            // We have to use ${} to convert the number (num1+num2) to a string
            findViewById<TextView>(R.id.tvResults).text = "${num1 - num2}"
        }

        btnMultiply.setOnClickListener {
            // Read the two numbers from the edit texts
            val num1 = etNum1.text.toString().toDouble()
            val num2 = etNum2.text.toString().toDouble()

            // Set the contents of the edit text  to the result
            // We have to use ${} to convert the number (num1+num2) to a string
            findViewById<TextView>(R.id.tvResults).text = "${num1 * num2}"
        }

        btnDivide.setOnClickListener {
            // Read the two numbers from the edit texts
            val num1 = etNum1.text.toString().toDouble()
            val num2 = etNum2.text.toString().toDouble()

            // Set the contents of the edit text  to the result
            // We have to use ${} to convert the number (num1+num2) to a string
            findViewById<TextView>(R.id.tvResults).text = "${num1 / num2}"
        }
    }
}
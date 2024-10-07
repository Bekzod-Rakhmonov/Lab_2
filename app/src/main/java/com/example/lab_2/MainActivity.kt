package com.example.lab_2

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val btnCount = findViewById<Button>(R.id.btnCount)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        val textCounter = TextCounter()

        btnCount.setOnClickListener {
            val inputText = editText.text.toString()

            if (inputText.isEmpty()) {
                Toast.makeText(this, "Please enter text", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val selectedOption = spinner.selectedItem.toString()

            val result = when (selectedOption) {
                "Words" -> textCounter.countWords(inputText)
                "Characters" -> textCounter.countChars(inputText)
                else -> 0
            }

            txtResult.text = "Result: $result"
        }
    }
}

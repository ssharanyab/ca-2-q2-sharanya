package com.example.q2ca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)
        val radiobutton1 = findViewById<RadioButton>(R.id.radiobutton1);

        radiobutton1.setOnClickListener() {
            Toast.makeText(this, radiobutton1.text, Toast.LENGTH_SHORT).show();
        }

        val checkBox1 = findViewById<CheckBox>(R.id.checkbox1);

        checkBox1.setOnClickListener() {
            if (checkBox1.isChecked) {
                Toast.makeText(this, checkBox1.text, Toast.LENGTH_SHORT).show();
            }
        }

    }
}
package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var editTextA: EditText
    private lateinit var editTextB: EditText
    private lateinit var editTextC: EditText
    private lateinit var btn: Button
    private lateinit var res: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextA = findViewById(R.id.editTextA)
        editTextB = findViewById(R.id.editTextB)
        editTextC = findViewById(R.id.editTextC)
        btn = findViewById(R.id.button)
        res = findViewById(R.id.result)
        btn.setOnClickListener {
            val a = editTextA.text.toString().toInt()
            val b = editTextB.text.toString().toInt()
            val c = editTextC.text.toString().toInt()
            val d = b*b - 4*a*c
            res.text = if(d>0) "Есть решения" else "Нет решений"
        }

    }
}
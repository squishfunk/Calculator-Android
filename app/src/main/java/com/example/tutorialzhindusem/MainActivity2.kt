package com.example.tutorialzhindusem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    lateinit var wynik : TextView
    lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val intent = intent
        val dane: String? = intent.getStringExtra("dane")

        wynik = findViewById(R.id.wynik)
        btn = findViewById(R.id.klik)

        wynik.text = dane
        btn.setOnClickListener {
            openActivity3("")
        }

    }

    fun openActivity3(dane : String) {
        val intent = Intent(this, MainActivity3::class.java)
        intent.putExtra("dane", dane);
        startActivity(intent)
    }



}
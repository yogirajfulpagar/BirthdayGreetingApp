package com.example.diceroll

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: android.view.View) {
        val name = editTextTextPersonName.editableText.toString()

        val intent = Intent(this,MainActivity2::class.java)
        intent.putExtra(MainActivity2.NAME_EXTRA,name)
        startActivity(intent)
    }
}
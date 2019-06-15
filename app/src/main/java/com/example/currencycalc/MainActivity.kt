package com.example.currencycalc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

fun button2ClickHandler(v:View){
    Log.d("TAG1", "button2 was pr")
}

class MainActivity : AppCompatActivity() {

    private fun button3ClickHandler(v:View){
        Log.d("TAG1", "button 3 was p")
        val c: Int = button3.text.toString().toInt() +1
        button3.text = "$c"
    }

    fun add1(v:View){
        val a: Float = arg1.text.toString().toFloat()
        val b: Float = a + arg2.text.toString().toFloat()
        result.text = "$b"
        //calendarView.date = Calendar(2016, 5, 12)
        //calendarView.date = Date(2016, 5 ,20)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // var tv:TextView = findViewById(R.id.tv)
        //Log.d("TAG", tv.text.toString())
        //var et: EditText = findViewById(R.id.editText1)
        //Log.d("TAG", "our text == ${et.text}")
      //  et.setText("newText")
    //    editText2.setText("new way hahaha")
        button3.setText("1")
        button.setOnClickListener { Log.d("TAG1", "button1 was pressed") }
        toConverterButton.setOnClickListener(::button2ClickHandler)
        button3.setOnClickListener(this::button3ClickHandler)
        add.setOnClickListener(this::add1)
        toConverterButton.setOnClickListener {
            Log.d("TAG1", "INTENT!")
            val myIntent = Intent(this, ConverterActivity::class.java)
            startActivity(myIntent)
        }

    }
}

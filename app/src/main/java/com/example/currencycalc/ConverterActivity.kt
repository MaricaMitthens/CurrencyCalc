package com.example.currencycalc

import android.app.DatePickerDialog
import android.app.DatePickerDialog.OnDateSetListener
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_converter.*
import java.util.*
import javax.xml.datatype.DatatypeConstants
import javax.xml.datatype.DatatypeConstants.MONTHS

class ConverterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_converter)
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)
        val currentDate = " " + day + "." + MONTHS[month] + "." + year
        tvDate.text = currentDate
        changeDateButton.setOnClickListener {
            chooseDate()
        }





    }


    private fun chooseDate(){
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val dpd = DatePickerDialog(this, OnDateSetListener { _, year1, monthOfYear, dayOfMonth ->
            val d = " " + dayOfMonth + "." + MONTHS[monthOfYear] + "." + year1
            tvDate.text = d
        }, year, month, day)

        dpd.show()
    }
}

private operator fun DatatypeConstants.Field.get(monthOfYear: Int): Any? {
    return  monthOfYear
}

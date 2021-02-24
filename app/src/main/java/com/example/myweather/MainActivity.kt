package com.example.myweather

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

const val TAG_A = "ForEachCycleTag"
const val TAG_B = "ClosedRangeCycleTag"
const val TAG_C = "CRCReversiveTag"
const val TAG_D = "CRCReversiveStep10Tag"

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.text_view)
        val button = findViewById<MaterialButton>(R.id.button1)
        button.setOnClickListener {
            if (textView.text == "Нажмите кнопку") {
                textView.text = "Кнопка нажата"
                textView.setTextColor(Color.WHITE)
                textView.setBackgroundColor(Color.BLACK)
                forEachCycle()
            } else {
                textView.text = "Нажмите кнопку"
                textView.setTextColor(Color.BLACK)
                textView.setBackgroundColor(Color.WHITE)
                closedRangeCycle()
            }
        }
        val myData = MyData("MyData", 2021)
        val myObject = myData.copy("MyDataCopy", 3021)

        button.setOnLongClickListener {
            if (textView.text != "${myData.string} ${myData.number}") {
                textView.text = "${myData.string} ${myData.number}"
                cycleReversive()
            } else {
                textView.text = "${myObject.number} ${myObject.number}"
                cycleReversiveWithStep()
            }
            true
        }
    }

    private fun cycleReversiveWithStep() {
        for (i in 200 downTo 0 step 10) {
            Log.d(TAG_D, i.toString())
        }
    }

    private fun cycleReversive() {
        for (i in 100 downTo 50) {
            Log.d(TAG_C, i.toString())
        }
    }

    private fun closedRangeCycle() {
        for (i in 1..50) {
            Log.d(TAG_B, i.toString())
        }
    }

    fun forEachCycle() {
        val arrayList = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        for (i in arrayList) {
            Log.d(TAG_A, i.toString())
        }
    }
}
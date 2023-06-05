package com.krish.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle
import android.view.View
import com.krish.myapplication.R

class MainActivity : AppCompatActivity() {
    var e1: EditText? = null
    var e2: EditText? = null
    var tv: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        e1 = findViewById<View>(R.id.editText1) as EditText
        e2 = findViewById<View>(R.id.editText2) as EditText
        tv = findViewById<View>(R.id.tv1) as TextView
    }

    fun add(v: View?) {
        val a1 = e1!!.text.toString().toInt()
        val a2 = e2!!.text.toString().toInt()
        val result = a1 + a2
        tv!!.text = "" + result
    }

    fun sub(v: View?) {
        val a1 = e1!!.text.toString().toInt()
        val a2 = e2!!.text.toString().toInt()
        val result = a1 - a2
        tv!!.text = "" + result
    }

    fun mul(v: View?) {
        val a1 = e1!!.text.toString().toInt()
        val a2 = e2!!.text.toString().toInt()
        val result = a1 * a2
        tv!!.text = "" + result
    }

    operator fun div(v: View?) {
        val a1 = e1!!.text.toString().toInt().toFloat()
        val a2 = e2!!.text.toString().toInt().toFloat()
        val result = a1 / a2
        tv!!.text = "" + result
    }
}
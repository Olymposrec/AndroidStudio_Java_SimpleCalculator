package com.melihakkose.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var first: Double?=null
    var second: Double?=null
    var result: Double?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mySum(view: View){
        first=editTextFirst.text.toString().toDoubleOrNull()
        second=editTextSecond.text.toString().toDoubleOrNull()

        if(first==null || second==null){
            textView.text="Error!"
        }else{
            result=first!! +second!!
            textView.text="Result: $result"
        }



    }
    fun myDiv(view:View){
        first=editTextFirst.text.toString().toDoubleOrNull()
        second=editTextSecond.text.toString().toDoubleOrNull()

        if(first==null || second==null){
            textView.text="Error!"
        }else{
            result=first!! /second!!
            textView.text="Result: $result"
        }
    }

    fun myMultiply(view:View){
        first=editTextFirst.text.toString().toDoubleOrNull()
        second=editTextSecond.text.toString().toDoubleOrNull()

        if(first==null || second==null){
            textView.text="Error!"
        }else{
            result=first!! *second!!
            textView.text="Result: $result"
        }

    }
    fun mySub(view:View){
        first=editTextFirst.text.toString().toDoubleOrNull()
        second=editTextSecond.text.toString().toDoubleOrNull()

        if(first==null || second==null){
            textView.text="Error!"
        }else{
            result=first!! -second!!
            textView.text="Result: $result"
        }

    }
}
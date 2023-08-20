package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    var num1=0
    var num2=0
    var op=""



    fun setinput(view:View){
        val id=view.id
        if(id==(R.id.plus)){
        op="+"
        }
         if(id==(R.id.minuse)){
            op="-"
        }
         if(id==(R.id.multiply)){
            op="*"
        }
         if(id==(R.id.divide)){
            op="/"
        }
        if(id==(R.id.module)){
            op="%"
        }

        val d=findViewById(R.id.textView) as TextView
            num1=Integer.parseInt(d.text.toString())
            d.text=""
    }

    fun equal(view:View){
        val d=findViewById(R.id.textView) as TextView
        num2=Integer.parseInt(d.text.toString())
        d.text=""

        if(op=="+"){
            val z=num1+num2
            d.text=z.toString()

        }
         if(op=="-"){
            val z=num1-num2
            d.text=z.toString()
        }

         if(op=="*"){
            val z=num1*num2
            d.text=z.toString()
        }
         if(op=="/"){
            val z=num1/num2
            d.text=z.toString()
        }

         if(op=="%"){
            val z=num1%num2
            d.text=z.toString()
        }

    }


    fun addtext(view: View){

        val d=findViewById<TextView>(R.id.textView)
        val id=view.id
        val update=d.text.toString()
        if(id==(R.id.ac)){
            d.text=""
            num1=0
            num2=0
        }
         if(id==(R.id.zero))
        {
            d.text=d.text.toString()+"0"
        }
         if(id==(R.id.one)){
            d.text=d.text.toString()+"1"
        }
         if(id==(R.id.two)){
            d.text=d.text.toString()+"2"
        }
         if(id==(R.id.three)){
            d.text=d.text.toString()+"3"
        }
         if(id==(R.id.four)){
            d.text=d.text.toString()+"4"
        }
         if(id==(R.id.five)){
            d.text=d.text.toString()+"5"
        }
         if(id==(R.id.six)){
            d.text=d.text.toString()+"6"
        }
         if(id==(R.id.seven)){
            d.text=d.text.toString()+"7"
        }
         if(id==(R.id.eight)){
            d.text=d.text.toString()+"8"
        }
         if(id==(R.id.nine)){
            d.text=update+"9"
        }

    }

}
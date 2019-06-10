package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.toasterlibrary.ToasterMessage

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToasterMessage.s(this,"Hello World")
    }
}

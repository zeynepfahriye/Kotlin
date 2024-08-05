package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var str1 : String? = null
    lateinit var  str2:String //daha sonra initilaze edicem
 // lateinit var primitive tiplerde kullanılmıyor double ,int,long
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        str2 = "Merhaba"
    }
}
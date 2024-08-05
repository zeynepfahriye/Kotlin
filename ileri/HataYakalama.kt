package com.example.studykotlin.ileri

fun main() {
    //1.Compile error
    val x = 10
    //x = 300

    //Exception -Run Time Error (uygulamayı çökerten hatalar)
    val a = 10
    val b = 0
    try {
        println("Sonuç: ${a/b}")
        println("İşlem tamam")
    }catch (e:Exception){
        println("İkinci sayı sıfır olmaz")
    }
}
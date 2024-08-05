package com.example.studykotlin.standart_programlama

fun main() {

    val yas = 17
    val isim = "zeynep"

    if (yas >= 18){
        println("Reşitsiniz")
    }else {
        println("Reşit değilsiniz")
    }

    if (isim ==  "zeynep"){
        println("Merhaba zeynep")
    }else if(isim == "furkan"){
        println("merhaba furkan")
    }else{
        println("Tanınmayan kişi")
    }


    val ka = "admin"
    val s = 1234567

    if( ka == "admin" && s == 123456){
        println("Admin giriş")
    } else {
        println("Yetkisi olmayan kişi")
    }

    //When swift te switch
    val gun = 1
    when (gun){
        1 -> println("Pazartesi")
        2 -> println("Salı")
        3 -> println("Çarşamba")
        4 -> println("Perşembe")
        5 -> println("Cuma")
        6 -> println("Cumartesi")
        7 -> println("Pazar")
        else -> println("Böyle gün yok")
    }
}
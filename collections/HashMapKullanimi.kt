package com.example.studykotlin.collections

fun main() {
    //Dictionary

    val iller = HashMap<Int,String>()
    iller.put(16,"Bursa")
    iller.put(34,"İstanbul")
    iller[7] = "Ankara"

    println(iller)

    //Okuma
    println(iller.get(16))

    //Güncelleme
    iller.put(7,"Yeni Antalya")

    println(iller)

    println(iller.size)
    println(iller.isEmpty())

    for ((anahtar,deger)in iller){
        println("$anahtar -> $deger")
    }

    iller.remove(16)
    println(iller)

    iller.clear()
    println(iller)
}
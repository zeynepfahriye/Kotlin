package com.example.studykotlin.collections

fun main() {
    //note: bunlar kalıcı kayıt değildir
    //Tanımlama
    val sayilar = ArrayList<Int>()
    val meyveler = ArrayList<String>()

    //Veri ekleme
    meyveler.add("Elma")
    meyveler.add("Erik")
    meyveler.add("Kiraz")
    println(meyveler)

    //veri güncelleme
    meyveler[1] = "Yeni Erik"
    println(meyveler)

    //Insert -> var olan bilgiyi bozmaz 1. index 'e  portakalı koyduk diğerleri kaymış oldu
    meyveler.add(1,"Portakal")
    println(meyveler)

    //Okuma işlemi
    println(meyveler[3])
    println(meyveler.get(2))

    println("Boyut : ${meyveler.size}")
    println("Boyut : ${meyveler.count()}")

    println("Boş kontrol ${meyveler.isEmpty()}")
    println("İçeriyor mu ${meyveler.contains("Portakal")}")

    //içeriği terse çevirme
    meyveler.reverse()
    println(meyveler)
    //harf sırasına göre sıraladı sayı olsaydı sayılara göre olurdu
    meyveler.sort()
    println(meyveler)


    for (meyve in meyveler) {
        println("Sonuç: $meyve")
    }

    for ((index,meyve) in meyveler.withIndex()) {
        println("$index. -> $meyve")
    }

    meyveler.removeAt(2)
    println("İkinci indexe ait veriyi sildik $meyveler")

    meyveler.clear()
    println("tüm içeriği temizledik $meyveler")
}
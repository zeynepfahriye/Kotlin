package com.example.studykotlin.collections

fun main() {
    val o1 = Ogrenciler(100,"Zeynep","12C")
    val o2 = Ogrenciler(200,"Furkan","11B")
    val o3 = Ogrenciler(50,"Nazlı","9A")

    val ogrencilerListesi = ArrayList<Ogrenciler>()
    ogrencilerListesi.add(o1)
    ogrencilerListesi.add(o2)
    ogrencilerListesi.add(o3)

    for (o in ogrencilerListesi) {
        println("No: ${o.no} - Ad: ${o.ad} - Sınıf: ${o.sinif}")
    }
    //Sort
    println("Numaraya göre :Küçülten > Büyüğe")
    val siralama1 = ogrencilerListesi.sortedWith(compareBy { it.no }) //   ASC : ascend
    for (o in siralama1) {
        println("No: ${o.no} - Ad: ${o.ad} - Sınıf: ${o.sinif}")
    }

    println("Numaraya göre :büyükten > küçüğe")
    val siralama2 = ogrencilerListesi.sortedWith(compareByDescending { it.no }) //DESC : descend
    for (o in siralama2) {
        println("No: ${o.no} - Ad: ${o.ad} - Sınıf: ${o.sinif}")
    }

    println("İsme göre :Küçülten > Büyüğe")
    val siralama3 = ogrencilerListesi.sortedWith(compareBy { it.ad }) //   ASC : ascend
    for (o in siralama3) {
        println("No: ${o.no} - Ad: ${o.ad} - Sınıf: ${o.sinif}")
    }

    println("İsme göre :büyükten > küçüğe")
    val siralama4 = ogrencilerListesi.sortedWith(compareByDescending { it.ad }) //DESC : descend
    for (o in siralama4) {
        println("No: ${o.no} - Ad: ${o.ad} - Sınıf: ${o.sinif}")
    }

    //Filtreleme
    println("Filtrleme 1")
    val filtreleme1 = ogrencilerListesi.filter { it.no >= 150 }
    for (o in filtreleme1) {
        println("No: ${o.no} - Ad: ${o.ad} - Sınıf: ${o.sinif}")
    }

    println("Filtrleme 2")
    val filtreleme2 = ogrencilerListesi.filter { (it.ad).contains("y")}
    for (o in filtreleme2) {
        println("No: ${o.no} - Ad: ${o.ad} - Sınıf: ${o.sinif}")
    }
}
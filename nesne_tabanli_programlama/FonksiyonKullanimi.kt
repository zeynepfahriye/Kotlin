package com.example.studykotlin.nesne_tabanli_programlama

fun main() {

    val f = Fonksiyonlar()
    f.hello()

    val gelenSonuc = f.hello2()
    println(gelenSonuc)

    f.hello3("Fahriye")

    val toplamSonuc = f.toplam(25,10)
    println("ToplamSonuc : $toplamSonuc")

    val cikarmaSonuc = f.cikarmaFun(5,10)
    println("Cikarma sonuc : $cikarmaSonuc")

    val carpimSonuc = f.carpmaFun(8.22,7.2)
    println("Çarpma Sonuc : $carpimSonuc")

}
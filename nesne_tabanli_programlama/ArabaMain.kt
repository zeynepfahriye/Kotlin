package com.example.studykotlin.nesne_tabanli_programlama

fun main() {
    // nesne oluşturma
    val mercedes = Araba("Siyah",0,true)
    val bmw = Araba("Kırmızı",100,true)
    val opel =Araba("Yeşil",400,false)

    //    Okuma (araba class ında oluşturuduğumuz bilgiAlma fonksiyonunu çağırdık)
    opel.bilgiAl()
    bmw.bilgiAl()
    mercedes.bilgiAl()

    // Veri atama
    bmw.renk = "Mavi"
    bmw.calisiyorMu = false
    bmw.hiz = 1000

    // durdur ve calistir fonksiyonalrını araba class ında yaptık (side effect)
    bmw.calistir()
    bmw.bilgiAl()
    bmw.durdur()
    bmw.bilgiAl()
    bmw.hizlan(50)
    bmw.bilgiAl()
    bmw.yavasla(5)
    bmw.bilgiAl()


}
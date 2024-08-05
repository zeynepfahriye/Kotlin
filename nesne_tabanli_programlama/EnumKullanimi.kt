package com.example.studykotlin.nesne_tabanli_programlama

fun main() {
ucretHesapla(20,KonserveBoyut.BUYUK)
}
fun ucretHesapla (adet:Int,boyut: KonserveBoyut){
    when(boyut){
        KonserveBoyut.KUCUK -> println("Toplam Maliyet: ${adet * 30} ₺")
        KonserveBoyut.ORTA -> println("Toplam Maliyet: ${adet * 40} ₺")
        KonserveBoyut.BUYUK -> println("Toplam Maliyet: ${adet * 50} ₺")
    }
}
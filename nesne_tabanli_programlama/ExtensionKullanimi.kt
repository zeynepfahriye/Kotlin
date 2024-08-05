package com.example.studykotlin.nesne_tabanli_programlama

fun main() {
    val sonuc = 5.carpi(2)
    println(sonuc)
    val bolumSonuc = 12.3 bolum 3.0
    println(bolumSonuc)
}
//carpı fonksiyonu Int classının bir fonksiyonu oldu artık
fun Int.carpi(sayi: Int):Int{
    return  this * sayi //this = Int sınıfı
}
//infix kullanımıylada bolumsonuc kısmındaki gibi bir yazıma kavuşabiliriz
infix fun Double.bolum(sayi: Double):Double{
    return  this / sayi //this = Int sınıfı
}

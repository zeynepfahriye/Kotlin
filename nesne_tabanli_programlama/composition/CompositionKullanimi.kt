package com.example.studykotlin.nesne_tabanli_programlama.composition

fun main() {
    val k1 = Kategoriler(1,"Dram")
    val k2 = Kategoriler(2,"Bilim Kurgu")

    val y1 = Yonetmenler(1,"Quentin Tarantino")
    val y2 = Yonetmenler(2,"Christopher Nolan")

    //k1 neyi temsil ediyor kategori id'si 1 olan dram türünü o zaman k1 nesnesini yazıcam
    //y1 de yönetmen id 1 olan tarantinoyu temsil ediyor y1 yazıcam

    val f1 = Filmler(1,"Django",2013,k1,y1)

    println("Film ad : ${f1.film_ad}")
    println("Film id : ${f1.film_id}")
    println("Film yıl : ${f1.film_yil}")
    println("Film yönetmen : ${f1.yonetmen.yonetmen_ad}")
    println("Film kategori : ${f1.kategori.kategori_ad}")

}
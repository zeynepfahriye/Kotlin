package com.example.studykotlin.nesne_tabanli_programlama.kalitim

fun main() {
    val topkapiSrayi = Saray(5,300)
    val bogazVilla = Villa(true,10)
    println("Topkapı sarayı kule    : ${topkapiSrayi.kuleSayisi}")
    println("Topkapı sarayı pencere : ${topkapiSrayi.pencereSayisi}")
    println("Boğaz Villa garaj      : ${bogazVilla.garajVarMi}")
    println("Boğaz Villa pencere    : ${bogazVilla.pencereSayisi}")

    //tür kontrolü yaptık
    if (topkapiSrayi is Saray){
        println("Saraydır")
    }else {
        println("Saray değildir")
    }
    //bu örnekler dönüşüme uygun değil yazım açısından gösterildi sadece
    //upcasting
    val ev : Ev = bogazVilla

    //Downcasting
    val ev1 = Ev(7)
    val saray = ev1 as Saray
}
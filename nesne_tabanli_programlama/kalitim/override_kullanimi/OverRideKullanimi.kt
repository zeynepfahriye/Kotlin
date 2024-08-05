package com.example.studykotlin.nesne_tabanli_programlama.kalitim.override_kullanimi

fun main() {
    val hayvan  = Hayvan()
    val memeli  = Memeli()
    val kedi    =   Kedi()
    val kopek   =  Kopek()

    hayvan.sesCikar()   //kalıtım yok , kendi sınıfına erişti
    memeli.sesCikar()   //kalıtım var,üst sınıfın metodunu kullandı
    kedi.sesCikar()     //kalıtım var , kendi metodunu kullandı override
    kopek.sesCikar()    //kalıtım var , kendi metodunu kullandı override

    //superclass'ı subclass'a dönüştürmek istediğimizde buna downCasting denir
    //subclass'ı superclass'a dönüştürmek istediğimizde ise buna Upcasting denir
    //downCasting ve upcasting için kalıtım ilişkisi olmak zorundadır

}
package com.example.studykotlin.nesne_tabanli_programlama

class Araba (var renk :String ,var hiz :Int ,var calisiyorMu :Boolean ){

    //Bir class tan nesne oluşyturduğumuz zaman çalışan fonksiyon
    //nerde kullanıyoruz ? bir classtan nesne oluşturduğumuz zaman başka bir classla işlem yapmak isteyebiliriz
    init {
        println("****Consturctor çalıştı****")
    }
    fun calistir () { //side effect Fonksiyon ile sınıfın özelliklerini değiştirebilme
        calisiyorMu = true
        hiz = 5
    }
    fun durdur () {
        calisiyorMu = false
        hiz = 0
    }

    fun hizlan(kacKm:Int){
        hiz += kacKm
    }
    fun yavasla(kacKm:Int){
        hiz -= kacKm
    }

    fun bilgiAl(){
        println("--------------------------")
        println("Renk           : ${renk}")
        println("Hız            : ${hiz}")
        println("Çalışıyor mu   : ${calisiyorMu}")
    }
    //this veya self(swift) bulunduğunuz sınıfı temsil eder
    //super : Kalıtım varsa üst sınıfı temsil eder

}
package com.example.studykotlin.nesne_tabanli_programlama

fun main() {
    //val a = ASinifi()
    //println(a.x)
    //a.metod()

    //Virtual Object -Sanal Nesne - İsimsiz nesne
    //Asinifi hafızada iki kere ayrı bir nesne olarak oluşur yukarda 1 nesneyle x ve metodu kullandık burda ise 2 nesneyle kullandık
    //println(ASinifi().x)
    //ASinifi().metod()


    //static performans olarak daha verimlidir Asinifi claasına bak
    println(ASinifi.x)
    ASinifi.metod()
}
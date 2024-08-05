package com.example.studykotlin.nesne_tabanli_programlama

import java.util.Scanner

fun main() {
    val k = OdevFonksiyon()
    //km mil çevirme
    val convertKm = k.convertToMil(22.0)
    println("Km'nin mil'e çevrilmesi: $convertKm")

    //dikdörtgen alan hesabı
    k.alanHesabi(10, 5)

    //factoriyel hesabı
    val factorial = k.factorialIterative(-2)
    println("Factorial: $factorial")

    //kaç tane e var
    k.harfBul("ne",'e')

    //iç acı toplamı
    val result =  k.icAcilarToplami(5)
    println("İç açılar toplamı $result")

    // maaş hesabi
    val maasHesabi = k.maasHesabi(20)
    println(   "Ücret  $maasHesabi")
    //otopark ücreti hesapla sürenin saat türünde girildiğini varsayarak yaptım
    val ucret = k.otoparkUcretiHesapla(2)
    println("Otopark süresi: $ucret tl")

}


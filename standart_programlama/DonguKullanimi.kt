package com.example.studykotlin.standart_programlama

fun main() {
    //1,2,3 görebileceğimiz döngü

    for(i in 1 ..3){
        println("döngü 1 $i")
    }
    //10 ile 20 arasında 5 er artsın

    for (a in 10..20 step 5){
        println("Dongu2: $a")
    }
    //20 ile 10 arasında 5 er azalsın

    for (b in 20 downTo 10 step 5){
        println("Dongu 3 : $b")
    }
    //1 den 5 e kadar 1 arttır
    var sayac = 1
    while (sayac < 6) {
        println("Döngü 4: $sayac")
        sayac ++
    }
    // break döngüyü durdurur continue o adımı pas geçer
    for(i in 1 ..5){
        if (i == 3) {
            break
        }
        println("Döngü 5 : $i")
    }
    for(i in 1 ..5){
        if (i == 3) {
            continue
        }
        println("Döngü 6 : $i")
    }



}
package com.example.studykotlin.collections

fun main() {
    val meyveler = HashSet<String>()

    meyveler.add("Karpuz")
    meyveler.add("Elma")
    meyveler.add("Erik")
    meyveler.add("Çilek")
    println(meyveler)
    meyveler.add("Amasya Elma")
    println(meyveler)

    println(meyveler.elementAt(1))
    println(meyveler.size)
    println(meyveler.isEmpty())

    for (m in meyveler){
        println("Sonuç : $m")
    }

    for ((i,m) in meyveler.withIndex()){
        println("Sonuç :$i -> $m")
    }

    meyveler.remove("Elma")
    println(meyveler)

    meyveler.clear()
    println(meyveler)
}
package com.example.studykotlin.standart_programlama

fun main() {

    val a = 40
    val b = 50

    val x = 90
    val y = 80

    println("a == b : ${ a == b }")
    println("a != b : ${ a != b }")
    println("a > b : ${ a > b }")
    println("a < b : ${ a < b }")
    println("a >= b : ${ a >= b }")
    println("a <= b : ${ a <= b }")

    println("a > b || x > y : ${a > b || x > y }") // or - veya sağ false false ise false olur diğer türlü her türlü true
    println("a > b && x > y : ${a > b && x > y }") // and - ve iki tarafta true olursa true olur
}
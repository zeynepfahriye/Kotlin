package com.example.studykotlin.degiskenler

fun main() {
    var studentName = "Zeynep"
    var studentSurname ="Çakır"
    var studentInch = 1.55
    var studentNameFirstChar = 'Z'
    var studentContinue = true

    println(studentName)
    println(studentSurname)
    println(studentInch)
    println(studentContinue)
    println(studentNameFirstChar)


    var productId : Int = 3416
    var productName : String = "Mackbook Pro"
    var productCount : Int = 100
    var productPrice : Int = 42999
    var brand : String= "Apple"

    println("Product Id:  $productId")
    println("Product Price: $productPrice")
    println("Product Name : $productName")
    println("Product Count $productCount")
    println("Brand: $brand")

    var a = 10
    var b = 20

    println("$a x $b : ${ a * b }" )

    // Constant - Sabitler
    // Val (kotlin) - let (swift) - const(js)
    // Sabit kullanmanın performansa etkisi nedir ?
    // var  hafızada daha esnek bir alan sunuyor val ise gerektiği kadar alan sunuyor bu sayede performansa etkisi önemli
    var sayi = 30
    println(sayi)
    sayi = 100
    println(sayi)

    val number = 40
    println(number)

    // Type Casting - Tür Dönüşümü
    // toDouble(),toFloat(),toLong(),toInt(),toShort(),toByte(),toChar(),toString()
    val i = 42
    val d = 78.9

    // Sayısaldan sayısala dönüşüm
    val sonuc1 = i.toDouble()
    val sonuc2 = d.toInt()

    //sonc2 nin dönüşümünde veri kaybı yaşadık integer a dönüştürürken yukarı aşağı yuvarlamıyor . dan sonrasıını direkt yok sayıyor
    println("Sonuç1: $sonuc1")
    println("Sonuç2: $sonuc2")

    // Sayısaldan metine dönüşüm
    val sonuc3 = i.toString()
    val sonuc4 = d.toString()

    println("Sonuc3: $sonuc3")
    println("Sonuc4: $sonuc4")

    // Metinden sayısala dönüşüm
    val yazi = "67.54"
    val sonuc5 = yazi.toDouble()
    val yazi2 = "66t"
    val sonuc6 = yazi2.toDoubleOrNull()


    println("Sonuc5: $sonuc5")
    println("Sonuc6 : $sonuc6")

    //toDoubleOrNull uygulama içinde her zaman sağlıklı çalışan bir yöntem değil onun yerine koşul yapısıyla devam etmek daha mantıklı olacaktır
    if (sonuc6 != null) {
        println(sonuc6)
    } else {
        println("Dönüşüm hatası oldu")
    }

    //if yapısının pratik hali
    sonuc6?.let {
        println(it)
    }




}

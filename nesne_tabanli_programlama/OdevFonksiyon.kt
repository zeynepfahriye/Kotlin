package com.example.studykotlin.nesne_tabanli_programlama

class OdevFonksiyon {
   //Parametre oalrak girilen km mile dönüştürdükten sonra geri döndüren bir method yazınız
    fun convertToMil(km:Double):Double {
        val convert = km * 0.621
        return convert
    }

    //Kenarları parametre olarak girilen ve dikdörtgenin alanın hesaplayan bir method yazınız
    fun alanHesabi (kisaKenar:Int,uzunKenar:Int){
        val dikdörtgenAlan = kisaKenar * uzunKenar
        println("Dikdörtgen Alan Hesabı: $dikdörtgenAlan")
    }
    //parametre olarak girilen sayının faktöriyel değerini hesaplayıp geri döndüren methodu yazınız
    fun factorialIterative(n: Int): Int {
        var result = 1
        for (i in 1..n) {
            result *= i
        }
        return result
    }
    //parametre olarak girilen kelime içinde kaç adet e harfi oldupunu gösteren method yazınız
    fun harfBul(cumle: String, harf: Char) {
        var sayac = 0
        for (i in cumle.indices) {
            if (cumle[i] == harf) {
                sayac++
            }
        }
        println("Girdiğiniz cümle veya kelimede $sayac tane '$harf' vardır")
    }

    //parametre olarak girilen kenar sayısına göre her bir iç açıyı hesaplayıp sonucu geri döndğren method yazınız
    fun icAcilarToplami (kenarSayisi:Int):Int{
        var sonuc = (kenarSayisi -2) * 180
        return sonuc
    }
//parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod yazınız
    fun maasHesabi(gunSayisi: Int): Int {
    val gunlukCalismaSaati = 8
    val normalSaatUcreti = 40
    val mesaiSaatUcreti = 80
    val toplamCalismaSaati = gunSayisi * gunlukCalismaSaati
    val mesaiSiniri = 150

    return if (toplamCalismaSaati > mesaiSiniri) {
        (toplamCalismaSaati - mesaiSiniri) * mesaiSaatUcreti + (mesaiSiniri * normalSaatUcreti)
    } else {
        toplamCalismaSaati * normalSaatUcreti
    }
}
    //parametre olarak girilen otopark süresine göre otoaprk ücreti hesaplayarak geri döndüren metodu yazınız
    fun otoparkUcretiHesapla(sure: Int): Int {
        val ilkSaatUcreti = 50
        val ekSaatUcreti = 10

        return if (sure <= 1) {
            ilkSaatUcreti
        } else {
            ilkSaatUcreti + (sure - 1) * ekSaatUcreti
        }
    }


}
package com.example.studykotlin.nesne_tabanli_programlama

class Fonksiyonlar {
    //void - geri dönüş değeri olmayan
    fun hello () {
        val sonuc = "Merhaba Dünya"
        println(sonuc)
    }

    // return - geri dönüş değeri olan (veri transferi var)
    fun hello2() : String{
        val sonuc = "merhaba dünya"
        return sonuc
    }
    // parametre
    fun hello3(isim:String){
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    fun toplam(sayi1:Int,sayi2:Int) : Int{
        val toplam = sayi1 + sayi2
        return  toplam
    }
    fun cikarmaFun(sayi1: Int,sayi2: Int) : Int{
        val cikarma = sayi1-sayi2
        return (cikarma)
    }

    fun carpmaFun(sayi1: Double,sayi2: Double) : Double {
        val carpım = sayi1 * sayi2
        return (carpım)
    }

    //Overlading!!! -> aynı isimde fonksiyon kullanabilirsin tek şartım parametrelerin türlerinde farklılıklara gidince sorun yaşamazsın
    //parametrelerin türlerini değiştirerek aynı isimde fonksiyon oluşturabildik,parametre sayısı artarak veya azaltarakta bu işlemi yapabiliriz
    fun carpmaFun(sayi1: Int,sayi2: Double) : Double {
        val carpım = sayi1 * sayi2
        return (carpım)
    }
    fun carpmaFun(sayi1: Double,sayi2: Int) : Double {
        val carpım = sayi1 * sayi2
        return (carpım)
    }
    fun carpmaFun(sayi1: Int,sayi2: Int) : Int {
        val carpim = sayi1 * sayi2
        return (carpim)
    }
    //Extension fonksiyonlar (var olan yapıları genişletmek anlamına geliyor)

}
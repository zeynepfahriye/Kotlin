package com.example.studykotlin.nesne_tabanli_programlama.composition

//note: katerori_id  ve yönetmen_id db 'de ikincil anahtar bizde burda class bazında modellemiz gerekiyor
//kategori_id yerine kategoriler classından bir nesne koyucaz yönetmen id yerine de yönetmenler clasından nesne koyucaz
//veri tabanında foregin key ilişkisini bu şekilde classlarla nesne oluşturarak kurucaz kotegori ve yonetmen compasition olmuş oluyor
data class Filmler (var film_id:Int ,
                    var film_ad:String,
                    var film_yil:Int,
                    var kategori:Kategoriler,
                    var yonetmen:Yonetmenler

    ){
}
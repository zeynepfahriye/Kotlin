package com.example.studykotlin.nesne_tabanli_programlama.paket2

import com.example.studykotlin.nesne_tabanli_programlama.paket1.A

class B : A() {
    fun fonksiyon(){
        println(varsayilanDegisken)
        println(publicDegisken)
        println(internalDegisken)
        println(protectedDegisken) //kalıtım olduğu için artık buna da erişebiliyoruz
    }
}
package com.example.studykotlin.nesne_tabanli_programlama.interface_kullanimi

class ClassA :MyInterface {
    override val degisken: Int = 10


    override fun method1() {
        println("method 1 çalıştı")
    }

    override fun method2(): String {
        return "method 2 çalıştı"
    }
    //normalde kalıtımda class'a bir özellik aktardığımız zaman virgül ile başka kalıtım aktaramayız ama interface'de virgül ile başka bir interface 'i de aktarabiliriz
    //kalıtımda parantez var interface'de yok
    //interface'de özellikleri aktarmak zorundayız kalıtımda istersek aktarırız
}
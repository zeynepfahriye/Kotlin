package com.example.studykotlin.nesne_tabanli_programlama.paket1

open class A {
    var varsayilanDegisken = 1
    public var publicDegisken = 2 // -> her yerden erişilebilir
    private var privateDegisken = 3 // -> sadece class içinden erişilebilir
    internal var  internalDegisken = 4 //
    protected var protectedDegisken = 5 // -> kalıtım yoluyla (inheritance) erişilebilir
    //protected 'a erişmek istiyorsam claasımı open yapmalıyım yani class A ifadesinin başına open yazmalıyım
    //open kalıtım oluşturcam anlamına geliyor B sınıfına gidip kalıtımla aktarmak için claas B : A() ifadesini yerleştiriyoruz


    fun fonk (){
        println(privateDegisken) //sadece sınıf içinde erişebiliyoruz
    }
}
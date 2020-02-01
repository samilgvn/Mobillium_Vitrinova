package com.example.vitrinova.Models



class mesajmodel(isim:String, resimid:Int,eskiucret:String) {
    var isim:String
    var resimid:Int = 0
    var eskiucret:String
    init{
        this.eskiucret=eskiucret
        this.isim = isim
        this.resimid = resimid
    }
}
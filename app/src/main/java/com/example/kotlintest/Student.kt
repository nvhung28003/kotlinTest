package com.example.kotlintest

class Student  {
    var Hoten: String = ""
    var Phone: Long = 0
    private var NamSinh: Long = 0
constructor(hoten : String, phone : Long, NamSinh : Long) {
    this.Hoten = hoten
    this.Phone = phone;
    this.NamSinh = NamSinh
}
    fun setNamSinh(ns: Long) {
        NamSinh = ns
    }

    val getNamSinh: Long
        get() {
            return NamSinh
        }

    val child: Boolean
        get() {
            if (2020 - NamSinh < 18) {
                return true
            } else {
                return false
            }
        }


    val AldultNotChild: Boolean
        get() = 2020 - NamSinh >= 18
}
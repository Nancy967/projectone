package com.kotlin

import java.util.Random

data class Ticket(val origin:Int, val destination:Int, val price:Int)

fun main() {
    var ticket = Ticket(23,51,560)
    var s = "abcdefg"
    println(s.validate())
    println((1..10).random1())

    /*val r1 = Random().nextInt(10)+1
    println(r1)*/
}

fun String.validate():Boolean{
    return this.length >=6
}

fun IntRange.random1():Int{
    val r = Random().nextInt(endInclusive-start)+start
    return r
}
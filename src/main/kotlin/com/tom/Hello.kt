package com.tom

fun main() {
//    println("Hello Kotlin")

    var s:String? = "abcdefg"
    s = null
    println(s?.get(5))
    println(s?.length)
    println(s?.substring(2))
    println(s?.substring(0,5))

    val h = Human(weight = 55.2f, height = 1.6f)
    println(h.bmi())
    h.hello()

    val score = 87
    println(score>85)
    val c = 'A'
    println(c.toInt()>60)

    /*var age = 22
    age = 32
    val weight = 73.2f
    var name1 : String
    name1 = "Mike"*/
}

class Human(var name:String="",var weight:Float, var height:Float){
    init {
        println("test $weight")
    }
//    constructor(name:String, weight: Float, height: Float):this(weight,height)
    fun bmi():Float{
        val bmi=weight/(height*height)
        return bmi
    }
    fun hello(){
        println("Hello Kotlin")
    }
}
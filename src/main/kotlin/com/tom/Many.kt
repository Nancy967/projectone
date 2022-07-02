package com.tom

fun main() {
    val list = listOf(5,4,3,2,6,7,9)
    println(list)
    println(list.get(3))

    val scores = listOf(55,92,71,60,43,100)
    for (score in scores){
        println(score)
    }
    var mutableList = mutableListOf(7,2,1,5,4,6,0)
    mutableList.add(3)
    println(mutableList)
}
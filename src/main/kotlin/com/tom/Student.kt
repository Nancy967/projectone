package com.tom

import java.util.Scanner

fun main() {
//    userInput()

    val stu = Student("Zoey", 52, 74)
    stu.print()
    println("High score : ${stu.hightest()}")

    /*var billy = 123
    println("Test billy : $billy")*/

    /*val stu = Student("Zoey", 52, 74)
    stu.print()*/
}

class Student(var name:String?, var english:Int, var math:Int){
    fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    fun getAverage() = (english+math)/2

    fun grading() = when (getAverage()){
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    fun passOrFailed() = if (getAverage() >= 60) "PASS" else "FAILED"

    fun hightest() = if (english > math){
        println("english")
        english
    } else {
        println("math")
        math
    }

    private fun userInput() {
        val scanner = Scanner(System.`in`)
        print("Please enter student's name:\n")
//    var name = scanner.next()
        var name = null
        print("Please enter student's english:")
        var english = scanner.nextInt()
        print("Please enter student's math:")
        var math = scanner.nextInt()


        val stu = Student(name, english, math)
        stu.print()
        stu.checkName()
    }

    fun checkName() = name?.length
}
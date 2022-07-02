package com.kotlin

import java.util.Scanner

fun main() {
//    userInput()
    Student.pass = 65
    val stu = Student("Zoey", 52, 74)
    val stu1 = Student("Rose", 75, 62)
    val stu2 = Student("Cindy", 75, 88)
    var gstu = GraduateStudent("Emily", 75,80,72)
    gstu.print();
    stu.print()
    stu1.print()
    stu2.print()
    println("High score : ${stu.hightest()}")

    /*var billy = 123
    println("Test billy : $billy")*/

    /*val stu = Student("Zoey", 52, 74)
    stu.print()*/
}

class GraduateStudent(name: String?, english: Int, math: Int, var thesis:Int):Student(name, english, math){
    companion object{
        var pass = 80
    }

    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    override fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"
}

open class Student(var name:String?, var english:Int, var math:Int){
    companion object{
        @JvmStatic
        var pass = 60
        fun test(){
            println("testing")
        }
    }

    open fun print(){
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

    open fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"

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
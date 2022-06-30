package com.tom.kotlin

import com.tom.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {
    @Test
    fun hightestTest(){
        val student = Student("Dora",45,72)
        Assertions.assertEquals(72,student.hightest())
    }

    @Test
    fun averageTest(){
        val student = Student("Dora",45,72)
        Assertions.assertEquals((45+72)/2,student.getAverage())
    }

    @Test
    fun gradingTest(){
        val student = Student("Dora",45,72)
        Assertions.assertEquals('F',student.grading())
    }

}
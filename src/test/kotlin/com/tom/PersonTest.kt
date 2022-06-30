package com.tom.kotlin

import com.tom.Human
import com.tom.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun humonBmiTest(){
        val humon = Human("Leo",95.4f,1.86f)
        Assertions.assertEquals(95.4f/(1.86f*1.86f),humon.bmi())
    }

    @Test
    fun personBmiTest(){
        val person = Person(45.7f,1.554f)
        Assertions.assertEquals(45.7f/(1.554f*1.554f),person.bmi())
    }
}
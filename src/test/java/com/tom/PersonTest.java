package com.tom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void bmiTest(){
        Person person = new Person(55.2f,1.65f);
        Assertions.assertEquals(55.2f/(1.65f*1.65f),person.bmi());
    }
}

package com.tom;

import com.tom.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void highestScoreTest(){
        Student student = new Student("Brous",95,72);
        Assertions.assertEquals(95,student.hightest());
    }

    @Test
    public void averageTest(){
        Student student = new Student("Bob",62,87);
        Assertions.assertEquals((62+87)/2,student.getAverage());
    }
}

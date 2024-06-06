package org.example;

import DayOfWeekApp.DayOfWeek;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

//Add unit tests for this method.
//Think about:
//positive tests - all the days have correct return values
//negative tests - numbers < 1 and >7
//a null value (expect for exception)

public class DayTest {


    @Test
    public void testGetDayValid() {
        assertEquals("Sunday", DayOfWeek.getDay(1));
        assertEquals("Monday", DayOfWeek.getDay(2));
        assertEquals("Tuesday", DayOfWeek.getDay(3));
        assertEquals("Wednesday", DayOfWeek.getDay(4));
        assertEquals("Thursday", DayOfWeek.getDay(5));
        assertEquals("Friday", DayOfWeek.getDay(6));
        assertEquals("Saturday", DayOfWeek.getDay(7));
    }

    @Test
    public void sameNameOfDay() {
        String expectedResult1 = "Sunday";
        String actualResult1 = DayOfWeek.getDay(1);
        String expectedResult2 = "Monday";
        String actualResult2 = DayOfWeek.getDay(2);
        String expectedResult3 = "Tuesday";
        String actualResult3 = DayOfWeek.getDay(3);
        String expectedResult4 = "Wednesday";
        String actualResult4 = DayOfWeek.getDay(4);
        String expectedResult5 = "Thursday";
        String actualResult5 = DayOfWeek.getDay(5);
        String expectedResult6 = "Friday";
        String actualResult6 = DayOfWeek.getDay(6);
        String expectedResult7 = "Saturday";
        String actualResult7 = DayOfWeek.getDay(7);
    }

    @Test
    public void numDayLow() {
        assertEquals("Number lower then 1", DayOfWeek.getDay(0));
        assertEquals("Number is negative", DayOfWeek.getDay(-1));
    }

    @Test
    public void numDayHigher() {
        assertEquals("Number higher then 7", DayOfWeek.getDay(8));
    }

    @Test
    public void nullDay() {
        String expectedResult1 = "Sunday";
        String actualResult1 = DayOfWeek.getDay(1);
        assertNotNull(actualResult1, "Is null. Input some value");

        String expectedResult2 = "Monday";
        String actualResult2 = DayOfWeek.getDay(2);
        assertNotNull(actualResult2, "Is null. Input some value");

        String expectedResult3 = "Tuesday";
        String actualResult3 = DayOfWeek.getDay(3);
        assertNotNull(actualResult3, "Is null. Input some value");

        String expectedResult4 = "Wednesday";
        String actualResult4 = DayOfWeek.getDay(4);
        assertNotNull(actualResult4, "Is null. Input some value");

        String expectedResult5 = "Thursday";
        String actualResult5 = DayOfWeek.getDay(5);
        assertNotNull(actualResult5, "Is null. Input some value");

        String expectedResult6 = "Friday";
        String actualResult6 = DayOfWeek.getDay(6);
        assertNotNull(actualResult6, "Is null. Input some value");

        String expectedResult7 = "Saturday";
        String actualResult7 = DayOfWeek.getDay(7);
        assertNotNull(actualResult7, "Is null. Input some value");
    }

}


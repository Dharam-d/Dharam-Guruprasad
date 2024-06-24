package com.wipro;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestDate {

    // Test case for constructor
    @Test
    public void testConstructor() {
        Date date = new Date(1, 1, 2020);
        assertEquals(1, date.getDay());
        assertEquals(1, date.getMonth());
        assertEquals(2020, date.getYear());
    }

    // Test case for setDay() and getDay()
    @Test
    public void testSetAndGetDay() {
        Date date = new Date(1, 1, 2020);
        date.setDay(15);
        assertEquals(15, date.getDay());
    }

    // Test case for setMonth() and getMonth()
    @Test
    public void testSetAndGetMonth() {
        Date date = new Date(1, 1, 2020);
        date.setMonth(12);
        assertEquals(12, date.getMonth());
    }

    // Test case for setYear() and getYear()
    @Test
    public void testSetAndGetYear() {
        Date date = new Date(1, 1, 2020);
        date.setYear(2023);
        assertEquals(2023, date.getYear());
    }

    // Test case for toString() method
    @Test
    public void testToString() {
        Date date = new Date(1, 1, 2020);
        assertEquals("Date is 1/1/2020", date.toString());
    }

    // Additional test cases can be added for edge cases and other scenarios
}

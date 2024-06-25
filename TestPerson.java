package com.wipro;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPerson {

    // Test case for the constructor with valid inputs
    @Test
    public void testConstructorValidInputs() {
        Person p = new Person("John", "Doe");
        assertEquals("John", p.getFirstName());
        assertEquals("Doe", p.getLastName());
    }

    // Test case for the constructor with null first name
    @Test
    public void testConstructorNullFirstName() {
        try {
            Person p = new Person(null, "Doe");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Both Names Cannot be NULL", e.getMessage());
        }
    }

    // Test case for the constructor with null last name
    @Test
    public void testConstructorNullLastName() {
        try {
            Person p = new Person("John", null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Both Names Cannot be NULL", e.getMessage());
        }
    }

    // Test case for getFullName() method
    @Test
    public void testGetFullName() {
        Person p1 = new Person("John", "Doe");
        assertEquals("John Doe", p1.getFullName());

        Person p2 = new Person(null, "Smith");
        assertEquals("? Smith", p2.getFullName());

        Person p3 = new Person("Jane", null);
        assertEquals("Jane ?", p3.getFullName());

        Person p4 = new Person(null, null);
        assertEquals("? ?", p4.getFullName());
    }

    // Additional test cases can be added for edge cases and other scenarios
}

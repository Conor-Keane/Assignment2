/*
package ie.atu.Assignment2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    Passenger myPass;

    @BeforeEach
    void setUp() {
    }

    @Test
    void success_test_Title() {
        Passenger myPass = new Passenger("Mr", "Conor", "1111111111", "879543461", 21);
        assertEquals("Mr", myPass.getTitle());
    }

    @Test
    void success_test_Title_Mrs() {
        Passenger myPass = new Passenger("Mrs", "Conor", "1111111111", "879543461", 21);
        assertEquals("Mrs", myPass.getTitle());
    }

    @Test
    void success_test_Title_Ms() {
        Passenger myPass = new Passenger("Ms", "Conor", "1111111111", "879543461", 21);
        assertEquals("Ms", myPass.getTitle());
    }


    @Test
    void test_fail_title_check() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {
            new Passenger("Miss", "Conor", "1111111111", "879543461", 21);
        });
        assertEquals("Please enter Mr, Mrs or Ms", exMessage.getMessage());

    }

    @Test
    void test_success_name_check() {
        Passenger myPass = new Passenger("Mr", "Conor", "1111111111", "879543461", 21);
        assertEquals("Conor", myPass.getName());
    }

    @Test
    void test_fail_name() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {
            new Passenger("Mr", "Oj", "1111111111", "879543461", 21);
        });
        assertEquals("Name must be greater than 3 characters long", exMessage.getMessage());
    }

    @Test
    void test_success_ID_check() {
        Passenger myPass = new Passenger("Mr", "Conor", "1111111111", "879543461", 21);
        assertEquals("1111111111", myPass.getID());
    }

    @Test
    void test_fail_ID_check() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {
            new Passenger("Mr", "Conor", "12345", "879543461", 21);
        });
        assertEquals("ID must be greater than 10 characters long", exMessage.getMessage());
    }

    @Test
    void test_success_Phone_check() {
        Passenger myPass = new Passenger("Mr", "Conor", "1111111111", "879543461", 21);
        assertEquals("879543461", myPass.getPhoneNo());
    }

    @Test
    void test_fail_Phone_check() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {
            new Passenger("Mr", "Conor", "1111111111", "23456", 21);
        });
        assertEquals("Phone number must be greater than 6 characters long", exMessage.getMessage());
    }

    @Test
    void test_success_Age_check() {
        Passenger myPass = new Passenger("Mr", "Conor", "1111111111", "879543461", 21);
        assertEquals(21, myPass.getAge());
    }

    @Test
    void test_fail_Age_check() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {
            new Passenger("Mr", "Conor", "1111111111", "879543461", 15);
        });
        assertEquals("You must be over the age of 16 to fly", exMessage.getMessage());
    }


    @AfterEach
    void tearDown() {
    }
}
*/
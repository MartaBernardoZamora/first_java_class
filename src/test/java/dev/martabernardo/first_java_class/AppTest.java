package dev.martabernardo.first_java_class;

import org.junit.jupiter.api.Test;

import dev.martabernardo.first_java_class.person.Person;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;

class AppTest {
    @Test
    @DisplayName("Test person instance print")
    void testAppPersonInstance() {
        Person person = new Person("Marta", "Bernardo", "11222333D", 1985);
        
        String result = person.completeData();

        assertEquals(result, "Marta Bernardo / 11222333D / 1985");


    }
}

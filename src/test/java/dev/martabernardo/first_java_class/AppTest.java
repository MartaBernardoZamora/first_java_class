package dev.martabernardo.first_java_class;

import org.junit.jupiter.api.Test;

import dev.martabernardo.first_java_class.person.Person;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

class AppTest {
    @Test
    @DisplayName("Test person instance print")
    void testAppPersonInstance() {
        Person person = new Person("Marta", "Bernardo", "11222333D", 1985);
        
        String result = person.completeData();

        assertEquals(result, "Marta Bernardo / 11222333D / 1985");
        assertThat(person, instanceOf(Person.class));
    }
    @Test
    @DisplayName("Second test person instance print")
    void testAppPersonInstanceSecond() {
        String result = App.dataToPrint("Marta", "Bernardo", "11222333D", 1985);

        assertEquals(result, "Marta Bernardo / 11222333D / 1985");
    }
}

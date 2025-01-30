package dev.martabernardo.first_java_class.person;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    @DisplayName("Instance person with name, surname, document and year")
    void testPersonInstance() {
        String name= "Marta";
        String surname= "Bernardo";
        String document= "11222333D";
        int year= 1985;

        Person person = new Person(name, surname, document, year);

        
        assertEquals(name, person.getName());
        assertEquals(surname, person.getSurname());
        assertEquals(document, person.getDocument());
        assertEquals(year, person.getYear());
        
    }
    @Test
    @DisplayName("Test person instance print")
    void testAppPersonInstance() {
        Person person = new Person("Marta", "Bernardo", "11222333D", 1985);
        
        String result = person.completeData();

        assertEquals(result, "Marta Bernardo / 11222333D / 1985");
        assertThat(person, instanceOf(Person.class));
    }

}

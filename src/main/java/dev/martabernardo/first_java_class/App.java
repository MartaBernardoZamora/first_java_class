package dev.martabernardo.first_java_class;

import dev.martabernardo.first_java_class.person.Person;

public final class App {
    

    public static void main(String[] args) {
        Person person = new Person("Marta", "Bernardo", "11222333D", 1985);
        String result=person.completeData();
        System.out.println(result);
    }
}

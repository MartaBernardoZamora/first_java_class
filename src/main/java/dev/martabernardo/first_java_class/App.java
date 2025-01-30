package dev.martabernardo.first_java_class;

import dev.martabernardo.first_java_class.person.Person;

public final class App {
    private App() {
    }
    public static void main(String[] args) {
        String result=dataToPrint("Marta", "López", "22333444F", 1990);
        System.out.println(result);
    }

    public static String dataToPrint(String name, String surname, String document, int year) {
        Person person = new Person(name, surname, document, year);
        return person.completeData();
    }
    
}

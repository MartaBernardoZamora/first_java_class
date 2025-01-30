package dev.martabernardo.first_java_class;

import dev.martabernardo.first_java_class.person.Person;

public final class App {
    

    public static void main(String[] args) {
        String result;
        Person person = new Person("Marta", "Bernardo", "11222333D", 1985);
        result=person.completeData();
        System.out.println(result);
    }

    public static String dataToPrint(String string, String string2, String string3, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dataToPrint'");
    }

    
}

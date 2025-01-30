package dev.martabernardo.first_java_class.person;

public class Person {

    private String name;
    private String surname;
    private String document;
    private int year;
                    
    public Person(String name, String surname, String document, int year) {
        this.name = name;
        this.surname=surname;
        this.document=document;
        this.year=year;
    } 

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDocument() {
        return document;
    }

    public Integer getYear() {
        return year;
    }

}

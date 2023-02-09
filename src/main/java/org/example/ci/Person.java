package org.example.ci;

public class Person {
    private String name;
    private int personID;

    public Person(String name, int personID) {
        this.name = name;
        this.personID = personID;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personID=" + personID +
                '}';
    }
}

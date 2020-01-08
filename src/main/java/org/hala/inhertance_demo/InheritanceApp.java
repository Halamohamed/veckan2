package org.hala.inhertance_demo;

import org.hala.inhertance_demo.model.Person;

import java.time.LocalDate;

public class InheritanceApp {
    public static void main(String[] args) {
        Person p = new Person("Nisse", LocalDate.parse("2001-02-21"));

        Object obj = p;
        Object obj2 = new Person("Olle", LocalDate.now());
        Person p2 = (Person) obj2;
        

        System.out.println(obj2);
    }
}

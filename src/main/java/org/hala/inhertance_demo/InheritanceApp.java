package org.hala.inhertance_demo;

import org.hala.inhertance_demo.model.Employee;
import org.hala.inhertance_demo.model.Person;
import org.hala.inhertance_demo.model.Walkable;

import java.time.LocalDate;

public class InheritanceApp {
    public static void main(String[] args) {
        Employee employee = new Employee(1, 43789.90, "Bruce Wayne", LocalDate.parse("1959-07-21"));


        if (employee instanceof Person){
            Person person = employee;
            person.startWalk();
            System.out.println(person);
        }


        Comparable<Employee> comparable = employee;
        Walkable walkable = employee;

        System.out.println(employee instanceof Person);
        System.out.println(employee instanceof Walkable);
        System.out.println(employee instanceof Object);
        System.out.println(employee instanceof Comparable);
    }
}

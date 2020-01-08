package org.hala.inhertance_demo.model;

import java.time.LocalDate;

public class Employee extends Person implements Comparable<Employee>{

    protected int employeeId;
    protected double salary;

    public Employee(int employeeId, double salary,String name, LocalDate birthDate){
        this(name,birthDate);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    private Employee(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void startWalk() {
        System.out.println("walking...");
    }

    @Override
    public void stopWalking() {

        System.out.println("...stop");
    }

    @Override
    public int compareTo(Employee o) {
        return (int) (this.salary - o.getSalary());
    }
}

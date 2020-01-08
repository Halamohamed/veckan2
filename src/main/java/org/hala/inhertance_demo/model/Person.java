package org.hala.inhertance_demo.model;

import java.time.LocalDate;

public abstract class Person implements Walkable {
    protected String name;
    protected LocalDate birthDate;

    public Person(String name, LocalDate birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{");
        sb.append("name='"+name);
        sb.append("\', birthDate="+ birthDate);
        sb.append("}");
        return sb.toString();
    }
}

package com.workintech.inheritance.company;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    public void work() {
        setSalary(25000);
        System.out.println(getName() + " Junior Developer starts working.");
    }
}

package com.workintech.inheritance.company;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    public void work() {
        setSalary(45000);
        System.out.println(getName() + " Senior Developer starts working.");
    }
}

package com.workintech.inheritance.company;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniors;
    private MidDeveloper[] mids;
    private  SeniorDeveloper[] seniors;

    public HRManager(long id, String name, double salary, JuniorDeveloper[] juniors,
                     MidDeveloper[] mids, SeniorDeveloper[] seniors) {
        super(id, name, salary);
        this.juniors = juniors;
        this.mids = mids;
        this.seniors = seniors;
    }

    public void addEmployee(int index, JuniorDeveloper developer) {
        try {
            if (juniors[index] == null) {
                juniors[index] = developer;
            } else {
                System.out.println("Bu index dolu.");
            }
        } catch(ArrayIndexOutOfBoundsException ex) {
                System.out.println("Index bulunamadı." + ex.getMessage());
            }
    }

    public void addEmployee(int index, MidDeveloper developer) {
        try {
            if (mids[index] == null) {
                mids[index] = developer;
            } else {
                System.out.println("Bu index dolu.");
            }
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index bulunamadı." + ex.getMessage());
        }
    }

    public void addEmployee(int index, SeniorDeveloper developer) {
        try {
            if (seniors[index] == null) {
                seniors[index] = developer;
            } else {
                System.out.println("Bu index dolu.");
            }
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index bulunamadı." + ex.getMessage());
        }
    }

    public JuniorDeveloper[] getJuniors() {
        return juniors;
    }

    public MidDeveloper[] getMids() {
        return mids;
    }

    public SeniorDeveloper[] getSeniors() {
        return seniors;
    }

    public void work() {
        setSalary(40000);
        System.out.println(getName() + " HR Manager starts working.");
    }
}

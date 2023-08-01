package com.workintech.inheritance.main;

import com.workintech.inheritance.company.*;

import java.util.Arrays;

public class CompanyMain {

    public static void main(String[] args) {

        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(2, "Emre", 25000);
        juniorDeveloper1.work();
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(3, "Mert", 20000);
        juniorDeveloper2.work();

        MidDeveloper midDeveloper1 = new MidDeveloper(4, "Melis", 35000);
        midDeveloper1.work();
        MidDeveloper midDeveloper2 = new MidDeveloper(5, "Eda", 30000);
        midDeveloper2.work();

        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(6, "Emre", 45000);
        seniorDeveloper.work();

        HRManager hrManager = new HRManager(1, "Mert", 40000, new JuniorDeveloper[3], new MidDeveloper[2], new SeniorDeveloper[1]);
        hrManager.work();

        System.out.println("Senior Developer Salary " + seniorDeveloper.getSalary());
        System.out.println("HR Manager Salary: " + hrManager.getSalary());

        System.out.println("Juniors: " + Arrays.toString(hrManager.getJuniors()));
        System.out.println("Mids: " + Arrays.toString(hrManager.getMids()));
        System.out.println("Seniors: " + Arrays.toString(hrManager.getSeniors()));

        hrManager.addEmployee(0, juniorDeveloper1);
        hrManager.addEmployee(0, midDeveloper1);
        hrManager.addEmployee(0, seniorDeveloper);

        System.out.println("Juniors: " + Arrays.toString(hrManager.getJuniors()));
        System.out.println("Mids: " + Arrays.toString(hrManager.getMids()));
        System.out.println("Seniors: " + Arrays.toString(hrManager.getSeniors()));

    }

}

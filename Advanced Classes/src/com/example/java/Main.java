package com.example.java;

public class Main {

    public static void main(String[] args) {
        Employees emp1 = new Employees("Jane Doe" , PositionTitle.ADMINISTRATION, true, 27.00, 1, "this week\n");
        Employees emp2 = new Employees("Larry Jackson", PositionTitle.PRODUCTION, false, 22.00, 2, "this week\n");
        Employees emp3 = new Employees("John Smith", PositionTitle.MAINTENANCE, false, 21.00,3, "this week\n");

        emp1.calculate(45);
        emp2.calculate(50);
        emp3.calculate(35);
    }
}
package com.example.java;

public class Employees {

    private String name;
    private PositionTitle position;
    private boolean salary;
    private double payRate;
    private int shift;
    private String startDate;

    public Employees(String name, PositionTitle position, boolean salary, double payRate, int shift, String startDate) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.payRate = payRate;
        this.shift = shift;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PositionTitle getPosition() {
        return position;
    }

    public void setPosition(PositionTitle position) {
        this.position = position;
    }

    public boolean isSalary() {
        return salary;
    }

    public void setSalary(boolean salary) {
        this.salary = salary;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public double calculate(double hoursIn) {
        double totalPay = 0.00;
        double shift2 = 1.05 * payRate;
        double shift3 = 1.10 * payRate;

        if (!salary) {
            if (shift == 1 && hoursIn > 40) {
                totalPay = (payRate * 40) + ((payRate * 1.5) * (hoursIn - 40));
            } else if (shift == 1) {
                totalPay = (payRate * hoursIn);
            }

            if (shift == 2 && hoursIn > 40) {
                totalPay = (shift2 * 40) + ((shift2 * 1.5) * (hoursIn - 40));
            } else if (shift == 2) {
                totalPay = (payRate * hoursIn);
            }

            if (shift == 3 && hoursIn > 40) {
                totalPay = (shift3 * 40) + ((shift3 * 1.5) * (hoursIn - 40));
            } else if (shift == 3) {
                totalPay = (payRate * hoursIn);
            }
        } else {
            totalPay = payRate * 40;
        }

        System.out.println(name + "\n" + position + "\nIs on salary: " + salary + "\nshift: " + shift + "\nRate of pay is: $" + (String.format("%.2f", payRate)) + " per hour" + "\n" + name  + " earned $" + (String.format("%,.2f", totalPay)) + " " + startDate);

        return totalPay;

    }
}
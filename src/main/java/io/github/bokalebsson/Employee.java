package io.github.bokalebsson;

import java.time.DateTimeException;
import java.time.LocalDate;


public abstract class Employee {

    private static int idCounter = 0;

    // Attributes:
    private int id;
    private String name;
    private LocalDate dateHired;
    private double salary;

    // Constructor:
    public Employee(String name, int year, int month, int day) {
        this.id = ++idCounter;
        this.name = name;

        if (year < 1900) {
            throw new IllegalArgumentException("Year must be 1900 or later");
        }

        try {
            this.dateHired = LocalDate.of(year, month, day);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException("Invalid date values for year/month/day");
        }
    }

    // Getters:
    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    // Setters:
    public void setName(String name){
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.name = name;
    }

    protected final void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
        this.salary = salary;
    }

    // Operations:
    public String getSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("-- Employee Information --").append("\n");
        sb.append("Id: ").append(id).append("\n");
        sb.append("Name: ").append(name).append("\n");
        sb.append("Salary: ").append(getSalary()).append("\n");
        sb.append("Date Hired: ").append(dateHired).append("\n");
        sb.append("---------------------------").append("\n");;
        return sb.toString();
    }

    public String toString() {
        return String.format("\nEmployee Information:\nId: %d \nName: %s \nDate Hired: %s\nSalary: %.2f \n", getId(), getName(), getDateHired(), getSalary());
    }

    public abstract void calculateSalary();


}

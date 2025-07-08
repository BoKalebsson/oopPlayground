package io.github.bokalebsson;

public class RegularEmployee extends Employee {

    public RegularEmployee(String name, int year, int month, int day) {
        super(name, year, month, day);
    }

    @Override
    public void calculateSalary() {
        setSalary(25000);
    }
}

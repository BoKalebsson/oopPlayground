package io.github.bokalebsson;

public class RegularEmployee extends Employee {

    public RegularEmployee(String name, int year, int month, int day) {
        super(name, year, month, day);
    }

    @Override
    public void calculateSalary() {
        setSalary(25000);
    }

    // Included calculateSalary() here, to always get the correct salary.
    @Override
    public String getSummary() {
        calculateSalary();
        String baseSummary = super.getSummary();
        StringBuilder sb = new StringBuilder(baseSummary);
        sb.append("-- Regular Employee --").append("\n");
        return sb.toString();
    }

    // Included calculateSalary() here, to always get the correct salary.
    @Override
    public String toString() {
        calculateSalary();
        String baseString = super.toString();
        StringBuilder sb = new StringBuilder(baseString);
        sb.append("Employee Type: Regular\n");
        return sb.toString();
    }

}

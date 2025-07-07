package io.github.bokalebsson;

public class SystemDeveloper extends Employee {

    // Attributes:
    private int certificates;
    private int programmingLanguages;

    // Constructor:
    public SystemDeveloper(String name, int year, int month, int day, int certificates, int programmingLanguages){
        super(name, year, month, day);
        this.certificates = certificates;
        this.programmingLanguages = programmingLanguages;
    }

    // Operations:
    @Override
    public double getSalary() {
        return super.getSalary() + (1000 * certificates) + (1500 * programmingLanguages);
    }
}

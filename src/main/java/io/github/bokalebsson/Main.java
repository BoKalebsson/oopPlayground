package io.github.bokalebsson;

public class Main {
    public static void main(String[] args) {

        // Simulating setting up a new Employee:
        Employee Magnus = new Employee("Magnus Persson",
                2025, 1, 12);
        System.out.println(Magnus.getSummary());

        // Simulating setting up a new System Developer:
        SystemDeveloper Greger = new SystemDeveloper("Greger Pettersson",
                2025, 1,1,
                new String[]{"Java", "Python"}, new String[]{"Java", "Python", "C++"});
        System.out.println(Greger.getSummary());

    }
}
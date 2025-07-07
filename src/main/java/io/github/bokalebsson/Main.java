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

        // Simulating setting up a new Sales Person:
        SalesPerson Katja = new SalesPerson("Katja Svensson",
                2025, 3, 24,
                new String[]{"Jens", "Kalle", "Martin"}, 15);
        System.out.println(Katja.getSummary());

        // Testing toString() as Employee:
        System.out.println(Magnus.toString());

        // Testing toString() as System Developer:
        System.out.println(Greger.toString());

        // Testing toString() as Sales Person:
        System.out.println(Katja.toString());

    }
}
package io.github.bokalebsson;

public class SalesPerson extends Employee {

    // Attributes:
    private String[] clients;
    private int acquiredClients;

    // Constructor
    public SalesPerson(String name, int year, int month, int day, String[] clients, int acquiredClients){
        super(name, year, month, day);
        this.setClients(clients);
        setAcquiredClients(acquiredClients);
    }

    // Getters:
    public String[] getClients() {
        return this.clients;
    }

    public int getAcquiredClients() {
        return this.acquiredClients;
    }

    // Setters:
    public void setClients(String[] clientsCount){

        if(clientsCount == null){
            throw new IllegalArgumentException("The array is not allowed to be null.");
        }

        if(clientsCount.length == 0){
            throw new IllegalArgumentException("The array is not allowed to be empty.");
        }
        clients = clientsCount;
    }

    public void setAcquiredClients(int acquiredClients) {
        if (acquiredClients < 0) {
            throw new IllegalArgumentException("Acquired clients can't be negative.");
        }
        this.acquiredClients = acquiredClients;
    }

    // Operations:
    @Override
    public void calculateSalary() {
        final double BASE_SALARY = 25000;
        int maintainedBonus = clients.length * 500;
        int acquiredBonus = acquiredClients * 1000;
        double totalSalary = BASE_SALARY + maintainedBonus + acquiredBonus;
        setSalary(totalSalary);
    }

    private String arrayToStringOrNone(String[] arr) {
        if (arr == null || arr.length == 0) {
            return "None";
        }
        return String.join(", ", arr);
    }

    // Included calculateSalary() here, to always get the correct salary.
    public String getSummary() {
        calculateSalary();
        String clientsResult = arrayToStringOrNone(clients);
        String baseSummary = super.getSummary();
        StringBuilder sb = new StringBuilder(baseSummary);
        sb.append("Employee Type: Sales Person\n");
        sb.append("Clients: ").append(clientsResult).append("\n");
        sb.append("Acquired Clients: ").append(acquiredClients).append("\n");
        sb.append("---------------------------").append("\n");;
        return sb.toString();
    }

    // Included calculateSalary() here, to always get the correct salary.
    @Override
    public String toString() {
        calculateSalary();
        return super.toString() + String.format("Clients: %d \nAcquired Clients: %d\n",
                clients.length, acquiredClients);
    }


}

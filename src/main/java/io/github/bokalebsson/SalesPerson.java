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
    public double getSalary() {
        double baseSalary = super.getSalary();
        int maintainedBonus = clients.length * 500;
        int acquiredBonus = acquiredClients * 1000;
        return baseSalary + maintainedBonus + acquiredBonus;
    }

    private String arrayToStringOrNone(String[] arr) {
        if (arr == null || arr.length == 0) {
            return "None";
        }
        return String.join(", ", arr);
    }

    public String getSummary() {
        String clientsResult = arrayToStringOrNone(clients);
        String baseSummary = super.getSummary();
        StringBuilder sb = new StringBuilder(baseSummary);
        sb.append("-- Sales Person --").append("\n");
        sb.append("Clients: ").append(clientsResult).append("\n");
        sb.append("Acquired Clients: ").append(acquiredClients).append("\n");
        sb.append("---------------------------").append("\n");;
        return sb.toString();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Clients: %d \nAcquired Clients: %d\n",
                clients.length, acquiredClients);
    }


}

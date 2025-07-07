package io.github.bokalebsson;

public class SystemDeveloper extends Employee {

    // Attributes:
    private String[] certificates;
    private String[] programmingLanguages;

    // Constructor:
    public SystemDeveloper(String name, int year, int month, int day, String[] certificates, String[] programmingLanguages){
        super(name, year, month, day);
        setCertificates(certificates);
        setProgrammingLanguages(programmingLanguages);
    }

    // Getters:
    public String[] getCertificates() {
        return this.certificates;
    }

    public String[] getProgrammingLanguages() {
        return this.programmingLanguages;
    }

    // Setters:
    public void setCertificates(String[] certificationCount){

        if(certificationCount == null){
            throw new IllegalArgumentException("The array is not allowed to be null.");
        }

        if(certificationCount.length == 0){
            throw new IllegalArgumentException("The array is not allowed to be empty.");
        }
        certificates = certificationCount;
    }

    public void setProgrammingLanguages(String[] programmingLanguagesCount){

        if(programmingLanguagesCount == null){
            throw new IllegalArgumentException("The array is not allowed to be null.");
        }

        if(programmingLanguagesCount.length == 0){
            throw new IllegalArgumentException("The array is not allowed to be empty.");
        }
        programmingLanguages = programmingLanguagesCount;
    }

    // Operations:
    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        int certBonus = certificates.length * 1000;
        int langBonus = programmingLanguages.length * 1500;
        return baseSalary + certBonus + langBonus;
    }

    private String arrayToStringOrNone(String[] arr) {
        if (arr == null || arr.length == 0) {
            return "None";
        }
        return String.join(", ", arr);
    }

    public String getSummary() {
        String certificationResult = arrayToStringOrNone(certificates);
        String languagesResult = arrayToStringOrNone(programmingLanguages);
        String baseSummary = super.getSummary();
        StringBuilder sb = new StringBuilder(baseSummary);
        sb.append("-- System Developer --").append("\n");
        sb.append("Certificates: ").append(certificationResult).append("\n");
        sb.append("Programming Languages: ").append(languagesResult).append("\n");
        sb.append("---------------------------").append("\n");;
        return sb.toString();
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Certificates: %d, Programming Languages: %d",
                certificates.length, programmingLanguages.length);
    }

}

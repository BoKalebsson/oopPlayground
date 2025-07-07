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

    // Getters:
    public int getCertificates() {
        return this.certificates;
    }

    public int getProgrammingLanguages() {
        return this.programmingLanguages;
    }

    // Setters:
    public void setCertificates(int certificationCount){
        if(certificationCount < 0 ){
            throw new IllegalArgumentException("Certifications can't be a negative number.");
        }
        certificates = certificationCount;
    }

    public void setProgrammingLanguages(int programmingLanguagesCount){
        if(programmingLanguagesCount < 0 ){
            throw new IllegalArgumentException("Programming languages can't be a negative number.");
        }
        programmingLanguages = programmingLanguagesCount;
    }

    // Operations:
    @Override
    public double getSalary() {
        return super.getSalary() + (1000 * certificates) + (1500 * programmingLanguages);
    }

    public String getSummary() {
        String baseSummary = super.getSummary();
        StringBuilder sb = new StringBuilder(baseSummary);
        sb.append("-- System Developer --").append("\n");
        sb.append("Certificates: ").append(certificates).append("\n");
        sb.append("Programming Languages: ").append(programmingLanguages).append("\n");
        sb.append("---------------------------").append("\n");;
        return sb.toString();
    }

}

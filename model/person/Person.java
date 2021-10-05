package taxiSystem.model.person;

public abstract class Person {
    private String name;
    private String family;
    private String nationalCode;
    protected String phoneNumber;
    protected int age;
    protected boolean tripStatus;

    public Person(String name, String family, String nationalCode, String phoneNumber, int age, boolean tripStatus) {
        this.name = name;
        this.family = family;
        this.nationalCode = nationalCode;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.tripStatus = tripStatus;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(boolean tripStatus) {
        this.tripStatus = tripStatus;
    }

    @Override
    public abstract String toString();
}

package taxiSystem.model.person;

import taxiSystem.model.Location;
import taxiSystem.model.Trip;

public abstract class Person {
    protected String userName;
    protected String name;
    protected String family;
    protected String nationalCode;
    protected String phoneNumber;
    protected int age;
    protected Trip trip;
    protected Location location;

    public Person(String userName, String name, String family, String nationalCode, String phoneNumber, int age, Trip trip, Location location) {
        this.userName = userName;
        this.name = name;
        this.family = family;
        this.nationalCode = nationalCode;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.trip = trip;
        this.location = location;
    }

    public Person() {

    }

    public Person(String userName, String name, String family, String nationalCode, String phoneNumber, int age) {
        this.userName = userName;
        this.name = name;
        this.family = family;
        this.nationalCode = nationalCode;
        this.phoneNumber = phoneNumber;
        this.age = age;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public abstract String toString();
}

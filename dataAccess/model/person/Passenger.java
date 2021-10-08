package taxiSystem.model.person;

import taxiSystem.enumeration.PassengerStatus;
import taxiSystem.model.Location;
import taxiSystem.model.Trip;

public class Passenger extends Person {

    private double accountBalance;
    private PassengerStatus passengerStatus;

    public Passenger(String userName, String name, String family, String nationalCode, String phoneNumber, int age, Trip trip, Location location, double accountBalance) {
        super(userName, name, family, nationalCode, phoneNumber, age, trip, location);
        this.accountBalance = accountBalance;
    }

    public Passenger(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Passenger() {


    }

    public Passenger(String userName, String name, String family, String nationalCode, String phoneNumber, int age, double accountBalance) {
        super(userName, name, family, nationalCode, phoneNumber, age);
        this.accountBalance = accountBalance;
        setPassengerStatus(PassengerStatus.NOTGOING);
    }

    public PassengerStatus getPassengerStatus() {
        return passengerStatus;
    }

    public void setPassengerStatus(PassengerStatus passengerStatus) {
        this.passengerStatus = passengerStatus;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return
                "Passenger{" +
                        "userName='" + userName + '\'' +
                        ", name='" + name + '\'' +
                        ", family='" + family + '\'' +
                        ", nationalCode='" + nationalCode + '\'' +
                        ", phoneNumber='" + phoneNumber + '\'' +
                        ", age=" + age + '\'' +
                        "accountBalance=" + accountBalance +
                        '}';
    }
}

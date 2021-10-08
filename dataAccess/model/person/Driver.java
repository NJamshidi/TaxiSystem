package taxiSystem.model.person;

import taxiSystem.enumeration.TypeOfVehicle;
import taxiSystem.model.Location;
import taxiSystem.model.Trip;
import taxiSystem.model.vehicle.Vehicle;

public class Driver extends Person {

    private Vehicle vehicle;

    public Driver(String userName, String name, String family, String nationalCode, String phoneNumber, int age, Trip trip, Location location, Vehicle vehicle) {
        super(userName, name, family, nationalCode, phoneNumber, age, trip, location);
        this.vehicle = vehicle;
    }


    public Driver() {

    }

    public Driver(String userName, String name, String family, String nationalCode, String phoneNumber, int age, Vehicle vehicle) {
        super(userName, name, family, nationalCode, phoneNumber, age);
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Driver{" +


                "userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age + '\'' +
                ",vehicle" + vehicle +
                '}';
    }
}

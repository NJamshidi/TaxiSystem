package taxiSystem.model;

import taxiSystem.model.person.Driver;
import taxiSystem.model.person.Passenger;

public class Trip {
    private int id;
    private Passenger passenger;
    private Driver driver;
    private Location origin;
    private Location destination;
    private double cost;

    public Trip(int id, Passenger passenger, Driver driver, Location origin, Location destination, double cost) {
        this.id = id;
        this.passenger = passenger;
        this.driver = driver;
        this.origin = origin;
        this.destination = destination;
        this.cost = cost;
    }
}

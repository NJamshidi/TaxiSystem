package taxiSystem.model;

public class Trip {
    private int id;
    private String userName;
    private String driverUserName;
    private String origin;
    private String destination;
    private double cost;

    public Trip(int id, String userName, String driverUserName, String origin, String destination, double cost) {
        this.id = id;
        this.userName = userName;
        this.driverUserName = driverUserName;
        this.origin = origin;
        this.destination = destination;
        this.cost = cost;
    }
}

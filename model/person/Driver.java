package taxiSystem.model.person;

import taxiSystem.enumeration.TypeOfVehicle;

public class Driver extends Person {
    private String driverUserName;
    private int vehicleId;
    private TypeOfVehicle typeOfVehicle;

    public Driver(String driverUserName,String name, String family, String nationalCode, String phoneNumber, int age, boolean tripStatus, int vehicleId, TypeOfVehicle typeOfVehicle) {
        super(name, family, nationalCode, phoneNumber, age, tripStatus);
        this.driverUserName = driverUserName;
        this.vehicleId = vehicleId;
        this.typeOfVehicle = typeOfVehicle;
    }

    public Driver() {
        super();

    }


    public String getDriverUserName() {
        return driverUserName;
    }

    public void setDriverUserName(String driverUserName) {
        this.driverUserName = driverUserName;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public TypeOfVehicle getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(TypeOfVehicle typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    @Override
    public String toString() {
        return driverUserName + ',' +
                vehicleId +
                "," + typeOfVehicle +
                "," + phoneNumber +
                "," + age +
                "," + tripStatus;
    }
}

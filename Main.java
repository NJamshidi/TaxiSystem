package taxiSystem;

import taxiSystem.enumeration.TypeOfVehicle;
import taxiSystem.model.person.Driver;
import taxiSystem.model.person.Passenger;

import java.sql.SQLException;
import java.util.Objects;
import java.util.Scanner;

import taxiSystem.dataAccess.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        DriverDataAccess driverDataAccess = new DriverDataAccess();
        PassengerDataAccess passengerDataAccess = new PassengerDataAccess();
        while (true) {
            showMenu:
            showFirstPage();
            int selection = input.nextInt();
            switch (selection) {
                case 1: {
                    System.out.println("Enter number of drivers:");
                    int numberOfdrivers = input.nextInt();
                    for (int i = 0; i < numberOfdrivers; i++) {
                        System.out.println("Enter drivers information: (userName, name, family, nationalCode, phoneNumber ,age ,tripStatus,vehicleId, TypeOfVehicle) ");
                        input.nextLine();
                        String line = input.nextLine();
                        String[] lineArray = line.split(",");
                        String userName = lineArray[0];
                        String name = lineArray[1];
                        String family = lineArray[2];
                        String nationalCode = lineArray[3];
                        String phoneNumber = lineArray[4];
                        String strAge = lineArray[5];
                        int age = Integer.parseInt(strAge);
                        String strTrip = lineArray[6];
                        Boolean tripStatus = Boolean.parseBoolean(strTrip);
                        String strId = lineArray[7];
                        int vehicleId = Integer.parseInt(strId);

                        Driver driver = new Driver(userName, name, family, nationalCode, phoneNumber, age, tripStatus, vehicleId, TypeOfVehicle.CAR);
                        try {
                            driverDataAccess.addDriver(driver);
                        } catch (SQLException e) {
                            System.out.println("can not add driver :" + e.getMessage());
                        }
                    }
                    System.out.println("Your information was successfully registered.");
                }
                break;
                case 2: {
                    System.out.println("Enter number of passenger:");
                    int numberOfPassengers = input.nextInt();
                    for (int i = 0; i < numberOfPassengers; i++) {
                        System.out.println("Enter passengers information: (userName, name, family, nationalCode, phoneNumber,age,tripStatus,accountBalance, driverUserName) ");
                        input.nextLine();
                        String line = input.nextLine();
                        String[] lineArray = line.split(",");
                        String userName = lineArray[0];
                        String name = lineArray[1];
                        String family = lineArray[2];
                        String nationalCode = lineArray[3];
                        String phoneNumber = lineArray[4];
                        String strAge = lineArray[5];
                        int age = Integer.parseInt(strAge);
                        String strTrip = lineArray[6];
                        boolean tripStatus = Boolean.parseBoolean(strTrip);
                        String str = lineArray[7];
                        double accountBalance = Double.parseDouble(str);
                        String driverUserName = lineArray[8];
                        Passenger passenger = new Passenger(userName, name, family, nationalCode, phoneNumber, age, tripStatus, accountBalance, driverUserName);
                        try {
                            passengerDataAccess.addPassenger(passenger);
                        } catch (SQLException e) {
                            System.out.println("can not add passenger :" + e.getMessage());
                        }
                    }
                    System.out.println("Your information was successfully registered.");
                }
                break;
                case 3: {
                    System.out.println("Enter username:");
                    String uName = input.next();
                    String str = driverDataAccess.getDriverByDriverUserName(uName);
                    String[] secondStr = str.split(",");
                    String uNameTest = secondStr[0];
                    if (Objects.equals(uNameTest, "null")) {
                        System.out.println("1.Register");
                        System.out.println("2.Exit");
                        int selection2 = input.nextInt();
                        switch (selection2) {
                            case 1: {
                                System.out.println("Enter your information: (userName, name, family, nationalCode, phoneNumber ,age ,tripStatus,vehicleId, TypeOfVehicle) ");
                                input.nextLine();
                                String line = input.nextLine();
                                String[] lineArray = line.split(",");
                                String userName = lineArray[0];
                                String name = lineArray[1];
                                String family = lineArray[2];
                                String nationalCode = lineArray[3];
                                String phoneNumber = lineArray[4];
                                String strAge = lineArray[5];
                                int age = Integer.parseInt(strAge);
                                String strtrip = lineArray[6];
                                Boolean tripStatus = Boolean.parseBoolean(strtrip);
                                String str1 = lineArray[7];
                                int vehicleId = Integer.parseInt(str1);

                                Driver driver = new Driver(userName, name, family, nationalCode, phoneNumber, age, tripStatus, vehicleId, TypeOfVehicle.CAR);
                                try {
                                    driverDataAccess.addDriver(driver);
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Your information was successfully registered.");
                            }
                            break;
                            case 2:
                                break;
                            default:
                                System.out.println("Invalid input!");
                        }
                    } else System.out.println(str);
                }
                break;
                case 4: {
                    System.out.println("Enter username:");
                    String uNamePass = input.next();
                    String str = passengerDataAccess.getPassengerByUserName(uNamePass);
                    String[] secondStr = str.split(",");
                    String uNameTest = secondStr[0];
                    if (Objects.equals(uNameTest, "null")) {
                        System.out.println("1.Register");
                        System.out.println("2.Exit");
                        int selection2 = input.nextInt();
                        switch (selection2) {
                            case 1: {
                                System.out.println("Enter your information: (userName, name, family, nationalCode, phoneNumber,age,tripStatus,accountBalance, driverUserName) ");
                                input.nextLine();
                                String line = input.nextLine();
                                String[] lineArray = line.split(",");
                                String userName = lineArray[0];
                                String name = lineArray[1];
                                String family = lineArray[2];
                                String nationalCode = lineArray[3];
                                String phoneNumber = lineArray[4];
                                String strAge = lineArray[5];
                                int age = Integer.parseInt(strAge);
                                String strTrip = lineArray[6];
                                boolean tripStatus = Boolean.parseBoolean(strTrip);
                                String strBalance = lineArray[7];
                                double accountBalance = Double.parseDouble(strBalance);
                                String driverUserName = lineArray[8];
                                Passenger passenger = new Passenger(userName, name, family, nationalCode, phoneNumber, age, tripStatus, accountBalance, driverUserName);
                                try {
                                    passengerDataAccess.addPassenger(passenger);
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }

                                System.out.println("Your information was successfully registered.");
                            }
                            break;
                            case 2:
                                break;
                            default:
                                System.out.println("Invalid input!");
                        }
                    } else {
                        menuIncreaseBalance();
                        int selection3 = input.nextInt();
                        switch (selection3) {
                            case 1: {
                                System.out.println("Enter amount in RIAL:");
                                input.nextLine();
                                double increaseAccount = input.nextDouble();
                                passengerDataAccess.updatePassenger(uNamePass, increaseAccount);
                                System.out.println("Your account balance has been updated");
                            }
                            break;

                            case 2:
                                break;
                            default:
                                System.out.println("Invalid input!");
                        }
                    }
                }
                break;
                case 5: {
                    System.out.println(driverDataAccess.getAllDriver());
                }
                break;
                case 6: {
                    System.out.println(passengerDataAccess.getAllPassenger());
                }
                break;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }

    public static void showFirstPage() {
        System.out.println("1.Add a group of drivers");
        System.out.println("2.Add a group of passengers");
        System.out.println("3.Driver signup or login");
        System.out.println("4.Passenger signup or login");
        System.out.println("5.Show a list of drivers");
        System.out.println("6.Show a list of passengers");
    }

    public static void menuIncreaseBalance() {
        System.out.println("1.Increase account balance");
        System.out.println("2.Exit");
    }
}

package taxiSystem;

import taxiSystem.model.Driver;
import taxiSystem.model.Passenger;

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
                        System.out.println("Enter drivers information: (username, name, family, national code, ...) ");
                        input.nextLine();
                        String line = input.nextLine();
                        String[] lineArray = line.split(",");
                        String userName = lineArray[0];
                        String name = lineArray[1];
                        String family = lineArray[2];
                        String nationalCode = lineArray[3];
                        Driver driver = new Driver(userName, name, family, nationalCode);
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
                        System.out.println("Enter passengers information: (username, name, family, national code, accountBalance, driverUserName ...) ");
                        input.nextLine();
                        String line = input.nextLine();
                        String[] lineArray = line.split(",");
                        String userName = lineArray[0];
                        String name = lineArray[1];
                        String family = lineArray[2];
                        String nationalCode = lineArray[3];
                        String str = lineArray[4];
                        double accountBalance = Double.parseDouble(str);
                        String driverUserName = lineArray[5];

                        Passenger passenger = new Passenger(userName, name, family, nationalCode, accountBalance, driverUserName);
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

                                System.out.println("Enter your information: (username, name, family, national code, ...) ");
                                input.nextLine();
                                String line = input.nextLine();
                                String[] lineArray = line.split(",");
                                String userName = lineArray[0];
                                String name = lineArray[1];
                                String family = lineArray[2];
                                String nationalCode = lineArray[3];
                                Driver driv = new Driver(userName, name, family, nationalCode);
                                try {
                                    driverDataAccess.addDriver(driv);
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

                                System.out.println("Enter your information: (username, name, family, national code,accountBalance,driverUserName) ");
                                input.nextLine();
                                String line = input.nextLine();
                                String[] lineArray = line.split(",");
                                String userName = lineArray[0];
                                String name = lineArray[1];
                                String family = lineArray[2];
                                String nationalCode = lineArray[3];
                                String accountBalanceStr = lineArray[4];
                                double accountBalance = Double.parseDouble(accountBalanceStr);
                                String driverUserName = lineArray[5];
                                Passenger passenger = new Passenger(userName, name, family, nationalCode, accountBalance, driverUserName);
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
                    driverDataAccess.getAllDriver();
                }
                break;
                case 6: {
                    passengerDataAccess.getAllPassenger();
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

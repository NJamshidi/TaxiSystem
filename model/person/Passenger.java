package taxiSystem.model.person;

public class Passenger extends Person{
    private String userName;
    private double accountBalance;
    private String driverUserName;

    public Passenger(String userName,String name, String family, String nationalCode, String phoneNumber, int age, boolean tripStatus, double accountBalance, String driverUserName) {
        super(name, family, nationalCode, phoneNumber, age, tripStatus);
        this.userName = userName;
        this.accountBalance = accountBalance;
        this.driverUserName = driverUserName;
    }

    public Passenger() {
        super();

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getDriverUserName() {
        return driverUserName;
    }

    public void setDriverUserName(String driverUserName) {
        this.driverUserName = driverUserName;
    }

    @Override
    public String toString() {
        return
                 userName +
                "," + accountBalance +
                "," + driverUserName +
                "," + phoneNumber +
                "," + age +
                "," + tripStatus ;
    }
}

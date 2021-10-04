package taxiSystem.model;

public class Passenger {
    private String userName;
    private String name;
    private String family;
    private String nationalCode;
    private double accountBalance;
    private String driverUserName;

    public Passenger(String userName, String name, String family, String nationalCode, double accountBalance, String driverUserName) {
        this.userName = userName;
        this.name = name;
        this.family = family;
        this.nationalCode = nationalCode;
        this.accountBalance = accountBalance;
        this.driverUserName = driverUserName;
    }

    public Passenger() {

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
                 userName + ',' +
                name + ',' +
                family + ',' +
                 nationalCode + ',' +
                accountBalance +','+
                 driverUserName;
    }
}

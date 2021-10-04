package taxiSystem.model;

public class Driver {
    private String driverUserName;
    private String name;
    private String family;
    private String nationalCode;

    public Driver(String driverUserName, String name, String family, String nationalCode) {

        this.driverUserName = driverUserName;
        this.name = name;
        this.family = family;
        this.nationalCode = nationalCode;
    }

    public Driver() {

    }


    public String getDriverUserName() {
        return driverUserName;
    }

    public void setDriverUserName(String driverUserName) {
        this.driverUserName = driverUserName;
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

    @Override
    public String toString() {
        return
               driverUserName + ',' +
                 name + ',' +
                 family + ',' +
                 nationalCode;
    }
}

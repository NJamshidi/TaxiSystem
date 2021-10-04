package taxiSystem.dataAccess;

import taxiSystem.model.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DriverDataAccess {
    public int addDriver(Driver driver) throws SQLException {
        Connection connection = SqlConnection.getConnection();
        if (connection != null) {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into drivers values (?, ?, ?, ?)");
            preparedStatement.setString(1, driver.getDriverUserName());
            preparedStatement.setString(2, driver.getName());
            preparedStatement.setString(3, driver.getFamily());
            preparedStatement.setString(4, driver.getNationalCode());

            int i = preparedStatement.executeUpdate();
            return i;
        } else {
            return 0;
        }
    }

    public List<Driver> getAllDriver() throws SQLException {
        Connection connection = SqlConnection.getConnection();

        if (connection != null) {
            List<Driver> drivers = new ArrayList<>();
            Statement statement = connection.createStatement();
            String sqlQuery = "SELECT * FROM drivers";
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                Driver driver = new Driver();
                driver.setDriverUserName(resultSet.getString("driverUserName"));
                driver.setName(resultSet.getString("name"));
                driver.setFamily(resultSet.getString("family"));
                driver.setNationalCode(resultSet.getString("nationalCode"));

                drivers.add(driver);
            }

            return drivers;
        } else {
            return Collections.emptyList();
        }
    }

    public String getDriverByDriverUserName(String driverUserName) throws SQLException {
        Connection connection = SqlConnection.getConnection();

        if (connection != null) {
            Driver driv = new Driver();
            PreparedStatement statement = connection.prepareStatement("select * from drivers where driverUserName = ?");
            statement.setString(1, driverUserName);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                driv.setDriverUserName(rs.getString("driverUserName"));
                driv.setName(rs.getString("name"));
                driv.setFamily(rs.getString("family"));
                driv.setNationalCode(rs.getString("nationalCode"));
            }
            return driv.toString();
        } else {
            return null;
        }
    }

}

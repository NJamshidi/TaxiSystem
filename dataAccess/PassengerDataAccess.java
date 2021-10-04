package taxiSystem.dataAccess;

import taxiSystem.model.Driver;
import taxiSystem.model.Passenger;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PassengerDataAccess {
    public int addPassenger(Passenger passenger) throws SQLException {
        Connection connection = SqlConnection.getConnection();
        if (connection != null) {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into passengers values (?, ?, ?, ?,? ,?)");
            preparedStatement.setString(1, passenger.getUserName());
            preparedStatement.setString(2, passenger.getName());
            preparedStatement.setString(3, passenger.getFamily());
            preparedStatement.setString(4, passenger.getNationalCode());
            preparedStatement.setDouble(5, passenger.getAccountBalance());
            preparedStatement.setString(6, passenger.getDriverUserName());


            int i = preparedStatement.executeUpdate();
            return i;
        } else {
            return 0;
        }
    }
    public String getPassengerByUserName(String userName) throws SQLException {
        Connection connection = SqlConnection.getConnection();

        if (connection != null) {
            taxiSystem.model.Passenger passenger = new Passenger();
            PreparedStatement statement = connection.prepareStatement("select * from passengers where userName = ?");
            statement.setString(1, userName);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
               passenger.setUserName(rs.getString("userName"));
                passenger.setName(rs.getString("name"));
                passenger.setFamily(rs.getString("family"));
                passenger.setNationalCode(rs.getString("nationalCode"));
                passenger.setAccountBalance(rs.getDouble("accountBalance"));
                passenger.setDriverUserName(rs.getString("driverUserName"));
            }
            return passenger.toString();
        } else {
            return null;
        }
    }


    public int updatePassenger(String username, double accountBalance) throws SQLException {
        Connection connection = SqlConnection.getConnection();
        if (connection != null) {
            String sql = "UPDATE passengers SET accountBalance = accountBalance +?  WHERE userName = ?";
            PreparedStatement preparedStmt = connection.prepareStatement(sql);
            preparedStmt.setDouble(1, accountBalance);
            preparedStmt.setString(2, username);


            int i = preparedStmt.executeUpdate();
            return i;
        } else {
            return 0;
        }
    }

    public List<Passenger> getAllPassenger() throws SQLException {
        Connection connection = SqlConnection.getConnection();

        if (connection != null) {
            List<Passenger> passengers = new ArrayList<>();
            Statement statement = connection.createStatement();
            String sqlQuery = "SELECT * FROM passengers";
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                Passenger passenger = new Passenger();
                passenger.setUserName(resultSet.getString("userName"));
                passenger.setName(resultSet.getString("name"));
                passenger.setFamily(resultSet.getString("family"));
                passenger.setNationalCode(resultSet.getString("nationalCode"));
                passenger.setAccountBalance(resultSet.getDouble("accountBalance"));
                passenger.setDriverUserName(resultSet.getString("driverUserName"));

                passengers.add(passenger);
            }

            return passengers;
        } else {
            return Collections.emptyList();
        }
    }
}

package hu.nive.ujratervezes.zarovizsga.housecup;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HouseCup {

    private MariaDbDataSource dataSource;


    public int getPointsOfHouse(String name){
        int points=0;

        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        }
        catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }

        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("SELECT SUM(points_earned) FROM house_points WHERE house_name =?")) {

            stmt.setString(1, name);

           ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
               points = rs.getInt("SUM(points_earned)");

            }

        } catch (SQLException se) {
            throw new IllegalStateException("Cannot select employees", se);
        }


        return points;

    }
    public HouseCup(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }
}

package dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by danawacomputer on 2017-06-26.
 */
public class SimpleConnectionMaker {
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection c = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres", "postgres", "0409"
        );
        return c;
    }

}

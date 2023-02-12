package bank.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * createConnection
 */
public class CreateConnection {

  static Connection conn;
  String url;
  String username;
  String password;

  public CreateConnection(Properties props) {
    url = props.getProperty("url", "jdbc:mariadb://localhost:3306/projecta");
    username = props.getProperty("username", "ritik");
    password = props.getProperty("password", "12345");
  }

  public Connection getConnection() {
    if (conn != null && isConnected()) return conn;
  
    try {
      conn = DriverManager.getConnection(url, username, password);
    } catch (SQLException e) {
      System.err.println("E code " + e.getErrorCode() + "\nE message: " + e.getMessage());
      System.err.println("As Database connection is failed. We are Existing...");

      System.exit(0);
    }
    return conn;
  }

  public boolean isConnected() {
    try {
      return conn.isValid(5);
    } catch (SQLException err) {
      return false;
    }
  }
}

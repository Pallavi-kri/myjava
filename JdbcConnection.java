import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
    public static void main(String[] args) {
        // SQLite database URL (in-memory database for simplicity)
        String url = "jdbc:sqlite:sample.db";  // You can change 'sample.db' to any SQLite database file path

        // Establish connection
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Connection to SQLite has been established.");
            }
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            System.out.println("Error: " + e.getMessage());
        }
    }
}

package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LazyDatabaseSingleton {

    private static volatile LazyDatabaseSingleton instance = null;
    private static volatile Connection conn = null;

    private LazyDatabaseSingleton() {
    }

    public static LazyDatabaseSingleton getInstance() {
        if (instance == null) {
            instance = new LazyDatabaseSingleton();
        }
        return instance;
    }

    public Connection getConnection() {
        if (conn == null) {
            try {
                String url = "jdbc:sqlite::memory:";
                conn = DriverManager.getConnection(url);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
}

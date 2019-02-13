package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum EnumDatabaseSingleton {

    INSTANCE;

    private static volatile Connection conn = null;

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

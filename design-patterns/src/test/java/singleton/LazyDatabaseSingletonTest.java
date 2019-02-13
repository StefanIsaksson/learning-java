package singleton;

import org.junit.Assert;
import org.junit.Test;

import java.sql.*;

public class LazyDatabaseSingletonTest {

    @Test
    public void test() throws SQLException {

        LazyDatabaseSingleton db = LazyDatabaseSingleton.getInstance();
        LazyDatabaseSingleton anotherDb = LazyDatabaseSingleton.getInstance();

        Assert.assertTrue(db == anotherDb);
        Assert.assertTrue(db.getConnection() == anotherDb.getConnection());

        createFruitTable();
        insertFruit("Apple");
        insertFruit("Orange");
        selectAllFruits();
    }

    public void insertFruit(String name) throws SQLException {
        String sql = "INSERT INTO fruits(name) VALUES(?)";

        Connection conn = LazyDatabaseSingleton.getInstance().getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.executeUpdate();
    }

    private void createFruitTable() throws SQLException {
        final String SQL = "CREATE TABLE fruits (id integer PRIMARY KEY, name text NOT NULL);";

        Connection conn = LazyDatabaseSingleton.getInstance().getConnection();
        Statement stmt = conn.createStatement();
        stmt.execute(SQL);
    }

    public void selectAllFruits() throws SQLException {
        final String SQL = "SELECT id, name FROM fruits";

        Connection conn = LazyDatabaseSingleton.getInstance().getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(SQL);

        // loop through the result set
        while (rs.next()) {
            Integer id = rs.getInt("id");
            String name = rs.getString("name");
            System.out.println(id + ". " + name);
        }
    }
}

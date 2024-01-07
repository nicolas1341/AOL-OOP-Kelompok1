package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DatabaseConnector {
	public Connection connect(String databaseName) {
		try {
			String url = "jdbc:mysql://localhost:3306/" + databaseName;
			Properties info = new Properties();

			info.put("user", "root");
			info.put("password", "");
			System.out.println("Successfully connected to MySQL database");
			return DriverManager.getConnection(url, info);

		} catch (Exception e) {
			System.out.println("Fail connect to MySQL database: " + e);
			return null;
		}

	}
}

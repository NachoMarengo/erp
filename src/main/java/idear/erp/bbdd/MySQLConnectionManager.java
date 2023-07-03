package idear.erp.bbdd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionManager {
    private String url;
    private String username;
    private String password;

    public MySQLConnectionManager() {
        this.url = "jdbc:mysql://localhost:3306/PASTER";
        this.username = "root";
        this.password = "españa1215";
    }

    public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}

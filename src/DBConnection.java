import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public Connection get_connection() throws ClassNotFoundException {
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //
            String url = "jdbc:mysql://localhost:3306/message_db";
            String user = "root";
            String password = "";

            // Connect to message_db
            connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Succsessful conection");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return connection;
    }
}

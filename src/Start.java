import java.sql.Connection;

public class Start {
    public static void main(String[] args) {
        DBConnection connection = new DBConnection();
        try (Connection cnt = connection.get_connection()){

        }catch (Exception e){
            System.out.println(e);
        }
    }
}

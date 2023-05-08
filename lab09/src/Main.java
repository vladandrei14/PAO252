import java.sql.*;

//"jdbc:mysql://localhost:3306/pao252", "pao", "Paolab252!"
public class Main {
    public static void main(String[] args) {

        try(Connection mysqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pao252", "pao", "Paolab252!")) {

            PreparedStatement selectQuery = mysqlConnection.prepareStatement("select * from employees");

            PreparedStatement update = mysqlConnection.prepareStatement("update employees set name='Maricica' where id=?");
            update.setInt(1, 2);

            System.out.println(update.executeUpdate());

            ResultSet result = selectQuery.executeQuery();

            while(result.next()){
                System.out.println(result.getInt("id"));
                System.out.println(result.getString(2));
                System.out.println(result.getString("department"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
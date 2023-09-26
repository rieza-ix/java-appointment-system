package Functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class GetUserID {

    public int getUsername(String username, String password) {
        int userID = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/appointment_system", "root", "");

            // Construct the SQL query with the provided username and password
            String sql = "SELECT * FROM user_account WHERE username = '" + username + "' AND password = '" + password + "'";

            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            // If a user with the provided username and password exists, fetch the user id
            if (resultSet.next()) {
                userID = resultSet.getInt(1);
            }

            resultSet.close();
            preparedStatement.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "There was an error retrieving the user id.", "Appointment System", JOptionPane.ERROR_MESSAGE);
        }
        return userID;
    }

}

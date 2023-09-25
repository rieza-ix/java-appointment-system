package Functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class GetUserName {

    static String getUsernameFromUserID(int userID) {
        String firstName = null; // Initialize with a default value (null) in case user is not found
        String lastName = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/appointment_system", "root", "");

            String sql = "SELECT first_name, last_name FROM user_account WHERE user_ID = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, userID);
            ResultSet resultSet = preparedStatement.executeQuery();

            // if a user with the provided user_ID exists, fetch the first name and last name
            if (resultSet.next()) {
                firstName = resultSet.getString(1);
                lastName = resultSet.getString(2);
            }

            resultSet.close();
            preparedStatement.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "There was an error retrieving the user account data.", "Book Appointment", JOptionPane.ERROR_MESSAGE);
        }

        return firstName + " " + lastName;
    }

}

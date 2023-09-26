package Functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Functions.LoginResult;

public class LoginValidation {

    public LoginResult validateLogin(String username, String password) {
        boolean isValid = false; // Initialize isValid
        int userID = 0; // Initialize userID

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/appointment_system", "root", "");

            String sql = "SELECT user_id FROM user_account WHERE username = ? AND password = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            // Check if a matching user is found and retrieve the user_id
            if (resultSet.next()) {
                userID = resultSet.getInt("user_id");
                isValid = true;
            } else {
                isValid = false; // Set isValid to false if no matching user is found
            }

            statement.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error retrieving data from database.", "Login Form", JOptionPane.ERROR_MESSAGE);
        }

        return new LoginResult(isValid, userID);
    }

}

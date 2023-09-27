package Server;

import Server.LoginResult;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class LoginValidation {

    public LoginResult validateLogin(String username, String password) {
        // initialize the variables as empty
        boolean isValid = false;
        int userID = 0;
        String userRole = null;

        try {
            // establish connection to MySQL database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/appointment_system", "root", "");

            // sql query to retrieve the user_id and user role based on the given username and password
            String sql = "SELECT user_id, role FROM user_account WHERE username = ? AND password = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            // check if a matching user is found and retrieve the user_id and user role
            if (resultSet.next()) {
                userID = resultSet.getInt("user_id");
                userRole = resultSet.getString("role");
                isValid = true;
            } else {
                isValid = false;
            }
            statement.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error retrieving data from the database.", "Login Form", JOptionPane.ERROR_MESSAGE);
        }

        // return a new LoginResult object with isValid, userID, and userRole
        return new LoginResult(isValid, userID, userRole);
    }
}

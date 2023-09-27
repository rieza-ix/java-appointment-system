package Server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class UpdateAccount {

    public void update(String lastName, String firstName, String phoneNumber, String emailAddress, String username, String password) {
        // retrive the user_id of the user who logged in
        UserSession userManager = UserSession.getInstance();
        int userID = userManager.getUserID();

        try {
            // establish connection to MySQL database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/" + "appointment_system", "root", "");

            // sql query tp update user account
            String sql = "UPDATE user_account "
                    + "SET last_name = ?, first_name = ?, phone_number = ?, email_address = ?, username = ?, password = ?"
                    + "WHERE user_id = ?";

            PreparedStatement statement = con.prepareStatement(sql);

            statement.setString(1, lastName);
            statement.setString(2, firstName);
            statement.setString(3, phoneNumber);
            statement.setString(4, emailAddress);
            statement.setString(5, username);
            statement.setString(6, password);
            statement.setInt(7, userID);

            int rowsUpdated = statement.executeUpdate();

            // display messgae
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Account updated successfully.", "User Profile", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error updating your account.", "User Profile", JOptionPane.ERROR_MESSAGE);
            }
            statement.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "There was an error updating your account.", "User Profile", JOptionPane.ERROR_MESSAGE);
        }
    }
}

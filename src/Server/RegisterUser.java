package Server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class RegisterUser {

    public void register(String lastName, String firstName, String phoneNumber, String emailAddress, String username, String password) {
        try {
            // establish connection to MySQL database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/" + "appointment_system", "root", "");

            // sql query add the data entered to the database
            String sql = "INSERT INTO user_account(last_name, first_name, phone_number, email_address, username, password, role)" + "VALUES(?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, lastName);
            statement.setString(2, firstName);
            statement.setString(3, phoneNumber);
            statement.setString(4, emailAddress);
            statement.setString(5, username);
            statement.setString(6, password);
            statement.setString(7, "Client");
            statement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Account registered successfully.", "Registration Form", JOptionPane.INFORMATION_MESSAGE);
            statement.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "There was an error with your account registration.", "Registration Form", JOptionPane.ERROR_MESSAGE);
        }
        Frame frame = new Frame();
        frame.viewFrame("Client.LoginForm", "Appointment System");
    }
}

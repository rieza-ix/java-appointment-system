package Server;

import Client.AdminDashboard;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;

public class BookAppointment extends AdminDashboard {

    public void book(int userID, String userRole, String clientName2, Date selectedDate, String timeText, String purposeText) {
        // Return the user full name by passing the user_id received
        GetClientName client = new GetClientName();
        String clientName = client.getClientName(userID);

        try {
            // Establish connection to MySQL database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/appointment_system", "root", "");

            if (client != null) {
                // Check if an appointment with the same date and time already exists and has a status of Approved
                String checkSql = "SELECT * FROM appointment WHERE date = ? AND time = ? AND status = 'Approved'";
                PreparedStatement checkStatement = con.prepareStatement(checkSql);

                // Create pattern for date
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());

                // Create pattern for time
                SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
                java.util.Date parsedTime = timeFormat.parse(timeText);
                java.sql.Time sqlTime = new java.sql.Time(parsedTime.getTime());

                checkStatement.setDate(1, sqlDate);
                checkStatement.setTime(2, sqlTime);

                ResultSet resultSet = checkStatement.executeQuery();

                if (resultSet.next()) {
                    JOptionPane.showMessageDialog(null, "An appointment at the same date and time already exists.", "Book Appointment", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Determine the status based on user role
                    String status = (userRole.equals("Admin")) ? "Approved" : "Pending";
                    String name = (userRole.equals("Admin")) ? clientName2 : clientName;

                    // Insert the new appointment with the determined status
                    String sql = "INSERT INTO appointment(user_id, client, date, time, purpose, status) VALUES (?, ?, ?, ?, ?, ?)";
                    PreparedStatement statement = con.prepareStatement(sql);
                    statement.setInt(1, userID);
                    statement.setString(2, name);
                    statement.setDate(3, sqlDate);
                    statement.setTime(4, sqlTime);
                    statement.setString(5, purposeText);
                    statement.setString(6, status);

                    int rowsInserted = statement.executeUpdate();

                    // Display message
                    if (rowsInserted > 0) {
                        if ("Approved".equals(status)) {
                            JOptionPane.showMessageDialog(null, "Appointment booked successfully.", "Book Appointment", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Your appointment is pending for approval. Please wait until the admin approves your appointment.", "Book Appointment", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "There was an error booking your appointment.", "Book Appointment", JOptionPane.ERROR_MESSAGE);
                    }
                    statement.close();
                }

                checkStatement.close();
            } else {
                JOptionPane.showMessageDialog(null, "There was an error retrieving user record from the database.", "Book Appointment", JOptionPane.ERROR_MESSAGE);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Make sure you enter the correct format for time. For example, H:MM A (8:00 AM).", "Book Appointment", JOptionPane.ERROR_MESSAGE);
        }
    }

}

package Functions;

import Frames.AdminDashboard;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;

public class BookAppointment extends AdminDashboard {

    public void book(int userID, Date selectedDate, String timeText, String purposeText) {
        GetClientName client = new GetClientName();
        String clientName = client.getClientName(userID);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/appointment_system", "root", "");

            if (client != null) {
                // Query to retrieve the user's role based on userID
                String roleQuery = "SELECT role FROM user_account WHERE user_ID = ?";
                PreparedStatement roleStatement = con.prepareStatement(roleQuery);
                roleStatement.setInt(1, userID);

                ResultSet roleResultSet = roleStatement.executeQuery();
                String userRole = ""; // Initialize userRole as empty

                if (roleResultSet.next()) {
                    userRole = roleResultSet.getString("role");
                }

                roleStatement.close();

                // Check if an appointment with the same date and time already exists and has a status of 1
                String checkSql = "SELECT * FROM appointment WHERE date = ? AND time = ? AND status = 'Approved'";
                PreparedStatement checkStatement = con.prepareStatement(checkSql);

                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());

                SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
                java.util.Date parsedTime = timeFormat.parse(timeText);
                java.sql.Time sqlTime = new java.sql.Time(parsedTime.getTime());

                checkStatement.setDate(1, sqlDate);
                checkStatement.setTime(2, sqlTime);

                ResultSet resultSet = checkStatement.executeQuery();

                if (resultSet.next()) {
                    // An appointment with the same date and time already exists with status 1
                    JOptionPane.showMessageDialog(null, "An appointment at the same date and time already exists.", "Book Appointment", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Determine the status based on user role
                    String status = (userRole.equals("Admin")) ? "Approved" : "Pending";

                    // Insert the new appointment with the determined status
                    String sql = "INSERT INTO appointment(client, date, time, purpose, status) VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement statement = con.prepareStatement(sql);

                    statement.setString(1, clientName);
                    statement.setDate(2, sqlDate);
                    statement.setTime(3, sqlTime);
                    statement.setString(4, purposeText);
                    statement.setString(5, status);

                    int rowsInserted = statement.executeUpdate();

                    if (rowsInserted > 0) {
                        if (status == "Approved") {
                            JOptionPane.showMessageDialog(null, "Appointment booked successfully.", "Book Appointment", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Your appointment is pending for approval. Please wait until the admin approves your appointment.", "Book Appointment", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Error occurred. Cannot book appointment.", "Book Appointment", JOptionPane.ERROR_MESSAGE);
                    }
                    statement.close();
                }

                checkStatement.close();
            } else {
                JOptionPane.showMessageDialog(null, "Error occurred. Cannot book appointment.", "Book Appointment", JOptionPane.ERROR_MESSAGE);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "There was an error booking your appointment.", "Book Appointment", JOptionPane.ERROR_MESSAGE);
        }
    }

}

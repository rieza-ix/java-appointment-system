package Functions;

import Frames.AdminDashboard;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
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
                String sql = "INSERT INTO appointment(client, date, time, purpose, status) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement statement = con.prepareStatement(sql);

                // Convert timeText to java.sql.Time with AM/PM format
                SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
                java.util.Date parsedTime = timeFormat.parse(timeText);

                // Convert the parsed time to a java.sql.Time object
                java.sql.Time sqlTime = new java.sql.Time(parsedTime.getTime());

                statement.setString(1, clientName);
                statement.setDate(2, new java.sql.Date(selectedDate.getTime()));
                statement.setTime(3, sqlTime);
                statement.setString(4, purposeText);
                statement.setInt(5, 1);

                statement.executeUpdate();

                JOptionPane.showMessageDialog(null, "Appointment booked successfully.", "Book Appointment", JOptionPane.INFORMATION_MESSAGE);
                statement.close();
            } else {
                JOptionPane.showMessageDialog(null, "Error occured. Cannot book appointment.", "Book Appointment", JOptionPane.ERROR_MESSAGE);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "There was an error booking your appointment.", "Book Appointment", JOptionPane.ERROR_MESSAGE);
        }
    }
}

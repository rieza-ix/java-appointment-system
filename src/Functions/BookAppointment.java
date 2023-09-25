package Functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class BookAppointment {

    public void book(Date selectedDate, String timeText, String purposeText) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/appointment_system", "root", "");

            String sql = "INSERT INTO appointment(date, time, purpose) VALUES (?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);

            // Convert timeText to java.sql.Time with AM/PM format
            SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
            java.util.Date parsedTime = timeFormat.parse(timeText);

            // Convert the parsed time to a java.sql.Time object
            java.sql.Time sqlTime = new java.sql.Time(parsedTime.getTime());

            statement.setDate(1, new java.sql.Date(selectedDate.getTime())); // Use setDate for the date column
            statement.setTime(2, sqlTime); // Use setTime for the time column
            statement.setString(3, purposeText);

            statement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Appointment is pending for approval. Please wait until the Admin approves your appointment.", "Book Appointment", JOptionPane.INFORMATION_MESSAGE);
            statement.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace(); // Print the exception for debugging purposes
            JOptionPane.showMessageDialog(null, "There was an error booking your appointment.", "Registration Form", JOptionPane.ERROR_MESSAGE);
        }
    }

}

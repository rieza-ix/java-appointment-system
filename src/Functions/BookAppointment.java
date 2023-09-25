package Functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class BookAppointment {

    public void book(Date selectedDate, String timeText, String purposeText) {
        GetUserName id = new GetUserName();
        String name = id.getUsernameFromUserID(1); // create a method to get the user session id

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/appointment_system", "root", "");

            String sql = "INSERT INTO appointment(client, date, time, purpose, status) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);

            // Convert timeText to java.sql.Time with AM/PM format
            SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
            java.util.Date parsedTime = timeFormat.parse(timeText);

            // Convert the parsed time to a java.sql.Time object
            java.sql.Time sqlTime = new java.sql.Time(parsedTime.getTime());

            statement.setString(1, name);
            statement.setDate(2, new java.sql.Date(selectedDate.getTime()));
            statement.setTime(3, sqlTime);
            statement.setString(4, purposeText);
            statement.setInt(5, 1);

            statement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Appointment booked successfully.", "Book Appointment", JOptionPane.INFORMATION_MESSAGE);
            statement.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "There was an error booking your appointment.", "Book Appointment", JOptionPane.ERROR_MESSAGE);
        }
    }

}

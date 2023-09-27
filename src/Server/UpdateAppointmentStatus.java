package Server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateAppointmentStatus {

    public void updateAppointment(int appointmentId, String newStatus) {
        try {
            // establish connection to MySQL database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/appointment_system", "root", "");

            // sql query to update the status in the database
            String sql = "UPDATE appointment SET status = ? WHERE appointment_id = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, newStatus);
            statement.setInt(2, appointmentId);
            statement.executeUpdate();
            statement.close();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

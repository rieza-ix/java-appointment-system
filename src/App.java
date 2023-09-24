
import Database.ConnectDatabase;
import Functions.Frame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class App {

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                ConnectDatabase db = new ConnectDatabase();

                db.checkConnection();

                if (db.isConnected == true) {
                    Frame frame = new Frame();
                    frame.viewFrame("Frames.LoginForm", "Appointment System");
                } else {
                    JOptionPane.showMessageDialog(null, "Error connecting to database.", "Connection failed.", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}

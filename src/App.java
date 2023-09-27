
import Server.Frame;
import Database.ConnectDatabase;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class App {

    public static void main(String args[]) {
        // run the program by calling the main form here
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                ConnectDatabase db = new ConnectDatabase();
                db.checkConnection();

                if (db.isConnected == true) {
                    Frame frame = new Frame();
                    frame.viewFrame("Client.LoginForm", "Appointment System");
                } else {
                    JOptionPane.showMessageDialog(null, "Error connecting to database.", "Connection failed.", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}

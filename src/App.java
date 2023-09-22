
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Dimension;
import java.awt.Toolkit;

// @author riezxcvii
public class App {

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Appointment System");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                LoginForm loginPanel = new LoginForm();

                // Set the preferred size of the Login panel
                loginPanel.setPreferredSize(new Dimension(831, 520)); // Adjust to your preferred size

                frame.getContentPane().add(loginPanel);
                frame.pack();

                // Get the screen's dimensions
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                int screenWidth = screenSize.width;
                int screenHeight = screenSize.height;

                // Calculate the X and Y coordinates to center the frame
                int xPos = (screenWidth - frame.getWidth()) / 2;
                int yPos = (screenHeight - frame.getHeight()) / 2;

                // Set the frame's location
                frame.setLocation(xPos, yPos);

                frame.setVisible(true);
            }
        });
    }
}

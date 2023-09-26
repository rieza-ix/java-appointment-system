package Functions;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame {

    public void viewFrame(String className, String title) {
        try {
            JFrame frame = new JFrame(title);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Use reflection to create an instance of the class
            Class<?> clazz = Class.forName(className);
            Object loginPanel = clazz.getDeclaredConstructor().newInstance();

            if (loginPanel instanceof JPanel) {
                JPanel panel = (JPanel) loginPanel;
                panel.setPreferredSize(new Dimension(831, 520));

                frame.getContentPane().add(panel);
                frame.pack();

                /// Get the screen's dimensions
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                int screenWidth = screenSize.width;
                int screenHeight = screenSize.height;

                // Calculate the X and Y coordinates to center the frame
                int xPos = (screenWidth - frame.getWidth()) / 2;
                int yPos = (screenHeight - frame.getHeight()) / 2;

                // Set the frame's location
                frame.setLocation(xPos, yPos);

                frame.setVisible(true);
            } else {
                // Handle the case where the specified class is not a JPanel
                System.out.println("Class specified is not a JPanel.");
            }
        } catch (Exception e) {
            // Handle exceptions (e.g., ClassNotFoundException, NoSuchMethodException, etc.)
            e.printStackTrace();
        }
    }

}

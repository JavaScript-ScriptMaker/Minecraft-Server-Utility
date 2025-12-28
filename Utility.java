import javax.swing.*;
import java.awt.*;

public class Utility {
    
    public static void main(String[] args) {
        System.out.println("Starting...");
        
        // Create a Window
        JFrame frame = new JFrame("Server Utility");
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().width / 2, Toolkit.getDefaultToolkit().getScreenSize().height / 2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        // Create JPanels
        JPanel topBar = new JPanel(); // Top bar
        topBar.setBackground(Color.WHITE);
        topBar.setPreferredSize(new Dimension(frame.getWidth(), 20));
        frame.add(topBar, BorderLayout.NORTH);

        JPanel mainPanel = new JPanel(); // Main panel
        mainPanel.setBackground(Color.WHITE);
        frame.add(mainPanel, BorderLayout.CENTER);

        JPanel bottomBar = new JPanel(); // Bottom bar
        bottomBar.setBackground(Color.LIGHT_GRAY);
        bottomBar.setPreferredSize(new Dimension(frame.getWidth(), 40));
        frame.add(bottomBar, BorderLayout.SOUTH);

        // Add borders
        topBar.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
        bottomBar.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 0, Color.GRAY));
        
        // Make frame visible
        frame.setVisible(true);
    }
}
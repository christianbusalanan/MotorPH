package sample;

import java.awt.*;
import javax.swing.*;

public class Login {
	public static void main(String [] args) {
		 // Create a new JFrame
		JFrame frame = new JFrame("MotorPH");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Get the image from the src folder
        Image image = new ImageIcon(Login.class.getResource("/motorph.png")).getImage();
        Image newImage = image.getScaledInstance(1000, 500, Image.SCALE_DEFAULT);
        // Create a new JLabel with the image
        JLabel label = new JLabel(new ImageIcon(newImage));
        Image logo= new ImageIcon(Login.class.getResource("/logo.png")).getImage();
        
        // Add the JLabel to the JFrame
        frame.add(label);

        // Set the size of the JFrame
        frame.setSize(1000, 500);
        
        // Center the frame
        frame.setLocationRelativeTo(null);

        // Make the JFrame visible
        frame.setVisible(true);
        frame.setIconImage(logo);
	}
	}

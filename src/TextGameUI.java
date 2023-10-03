import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextGameUI {
    private JFrame frame;
    private JTextArea textArea;
    private JTextField inputField;

    public TextGameUI() {
        // Create the main frame
        frame = new JFrame("Text-Based Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Create a text area for displaying game text
        textArea = new JTextArea();
        textArea.setEditable(false);
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Create an input field for player commands
        inputField = new JTextField();
        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the player's input
                String input = inputField.getText();
                // Process the input (e.g., send it to your game logic)
                processInput(input);
                // Clear the input field
                inputField.setText("");
            }
        });
        frame.add(inputField, BorderLayout.SOUTH);

        // Set the frame to be visible
        frame.setVisible(true);
    }

    // Method to display text in the UI
    public void displayText(String text) {
        textArea.append(text + "\n");
    }

    // Method to process player input (you can replace this with your game logic)
    private void processInput(String input) {
        // Example: Display the player's input in the UI
        displayText("Player input: " + input);
    }
}

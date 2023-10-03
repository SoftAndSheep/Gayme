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
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.WHITE);
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Create an input field for player commands
        inputField = new JTextField();
        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the player's input
                String inputF = inputField.getText();
                // Process the input (e.g., send it to your game logic)
                processInput(inputF);
                // Clear the input field
                inputField.setText("");
            }
        });
        inputField.setBackground(Color.BLACK);
        inputField.setForeground(Color.MAGENTA);
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

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public JTextField getInputField() {
		return inputField;
	}

	public void setInputField(JTextField inputField) {
		this.inputField = inputField;
	}
	
}

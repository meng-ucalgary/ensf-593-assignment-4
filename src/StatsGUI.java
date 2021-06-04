import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Class to provide the front end UI for the Stats class
 *
 * @author Bhavyai Gupta
 * @version 1.0
 * @since June 4, 2021
 */
public class StatsGUI extends JFrame implements ActionListener {
    private JLabel prompt = new JLabel("Next Grade (press ENTER)");
    private JTextField inField;
    private JTextArea display;
    private JButton reset, displayStats;
    private Stats statistics;

    public StatsGUI(String title) {
        statistics = new Stats();

        inField = new JTextField(4);
        inField.addActionListener(this);

        display = new JTextArea("", 5, 20);

        reset = new JButton("RESET");
        reset.addActionListener(this);

        displayStats = new JButton("STATS");
        displayStats.addActionListener(this);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(0, 2));
        inputPanel.add(prompt);
        inputPanel.add(inField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(0, 2));
        buttonPanel.add(displayStats);
        buttonPanel.add(reset);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add("North", inputPanel);
        contentPane.add("Center", display);
        contentPane.add("South", buttonPanel);

        setSize(500, 200);
        setTitle(title);
        setVisible(true);
    }

    /**
     * Catches the events by the ActionListener as a result of user interaction with
     * the GUI interface
     *
     * @param e The action caught by the GUI
     */
    public void actionPerformed(ActionEvent e) {
        // if user enters a new integer
        if (e.getSource() == inField) {
            int number = Integer.parseInt(inField.getText());
            statistics.add(number);
            inField.setText("");
            display.append(String.format("%nAdded %d successfully", number));
        }

        // if user presses the STATS button
        else if (e.getSource() == displayStats) {
            display.setText(statistics.toString());
        }

        // if user presses the RESET button
        else if (e.getSource() == reset) {
            display.setText("");
            this.statistics = new Stats();
        }
    }

    public static void main(String[] args) {
        new StatsGUI("Mean and median");
    }
}

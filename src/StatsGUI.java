import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * 
 * Partial implementation of the Stats GUI
 *
 * @author
 */
public class StatsGUI extends JFrame implements ActionListener {
	private JLabel prompt = new JLabel("Next Grade (press ENTER)");
	private JTextField inField;
	private JTextArea display;
	private JButton reset, displayStats;
	// TODO: Add stats instance variable

	public StatsGUI(String title) { 
		
		//TODO: Instantiate stats object
		
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

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == inField) {
			int number = Integer.parseInt(inField.getText());
			// TODO: ADD THE GRADE TO stats
		}
		//TODO: Add handling of display button -  DISPLAY THE RESULTS
		
		// TODO: Add handling of reset button - CREATE A NEW stats

	}

	public static void main(String[] args) {
		new StatsGUI("Mean and median");
	}
}

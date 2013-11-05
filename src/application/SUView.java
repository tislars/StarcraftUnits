package application;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class SUView extends JFrame {

	// Fix the serializable class SUView warning
	private static final long serialVersionUID = 1L;

	SUModel _Model;

	private int _totalSupply;

	// Initialize the elements used in the interface
	private JButton btnMarine = new JButton("Marine");
	private JButton btnGhost = new JButton("Ghost");
	private JButton btnThor = new JButton("Thor");
	private JLabel labelTotalSupply = new JLabel(Integer.toString(_totalSupply));
	private JTextArea textArea = new JTextArea(10, 30);

	// Constructor that passes the Model and adds the elements to the interface
	SUView(SUModel model) {
		this._Model = model;

		JPanel producePanel = new JPanel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 260);

		producePanel.add(btnMarine);
		producePanel.add(btnGhost);
		producePanel.add(btnThor);
		producePanel.add(labelTotalSupply);
		producePanel.add(textArea);

		this.add(producePanel);
	}

	// Setter to update the text in the labelTotalSupply
	public void setTotalSupply(int totalSupply) {
		_totalSupply = _Model.getTotalSupply();
		labelTotalSupply.setText(Integer.toString(_totalSupply));
	}

	// Getter to return the current _totalSupply
	public int getTotalSupply() {
		return _totalSupply;
	}

	/*
	 * The three listeners for the buttons Marine, Ghost and Thor
	 */
	void produceMarineListener(ActionListener listenForMarineButton) {
		btnMarine.addActionListener(listenForMarineButton);
	}

	void produceGhostListener(ActionListener listenForGhostButton) {
		btnGhost.addActionListener(listenForGhostButton);
	}

	void produceThorListener(ActionListener listenForThorButton) {
		btnThor.addActionListener(listenForThorButton);
	}
}

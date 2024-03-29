package BoxOfCards;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Table extends JFrame implements ActionListener {

	Cards deckCards = new Cards();
	Embaralha embaralha = new Embaralha();
	Reorganizar reorganizarCartas = new Reorganizar();
	JPanel panel2 = new JPanel();

	// ACTIONS BUTTONS
	JButton bot�o1 = new JButton("Fila 1");
	JButton bot�o2 = new JButton("Fila 2");
	JButton bot�o3 = new JButton("Fila 3");

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bot�o1) {

			embaralha.embaralha(deckCards.getDeckCards(), 1, getContentPane(), reorganizarCartas);

		} else {
			if (e.getSource() == bot�o2) {

				embaralha.embaralha(deckCards.getDeckCards(), 2, getContentPane(), reorganizarCartas);

			} else {

				if (e.getSource() == bot�o3) {

					embaralha.embaralha(deckCards.getDeckCards(), 3, getContentPane(), reorganizarCartas);

				}
			}
		}

	}

	public Table() {

		// Configure Window

		Container table = getContentPane();
		table.setLayout(null);

		setSize(1000, 850);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		setTitle("Guessing Game GUI");

	

		table.setBounds(0, 0, 1000, 850);

		bot�o1.setBounds(210, 50, 100, 50);
		table.add(bot�o1);
		bot�o1.addActionListener(this);

		bot�o2.setBounds(460, 50, 100, 50);
		table.add(bot�o2);
		bot�o2.addActionListener(this);

		bot�o3.setBounds(710, 50, 100, 50);
		table.add(bot�o3);
		bot�o3.addActionListener(this);
		
		
		
		reorganizarCartas.reorganizar(deckCards.getDeckCards(), table);
		

	}

	public static void main(String args[]) {

		new Table();
	}

}

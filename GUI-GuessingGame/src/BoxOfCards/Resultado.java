package BoxOfCards;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Resultado extends JFrame {

	public void resultado(JLabel deckCards[], Container tela) {

		tela.disable();
		System.out.println("AQUI");
		Container telaResultado = getContentPane();
		telaResultado.setLayout(null);
		setSize(350, 400);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		setTitle("TCHAR√√");

		deckCards[10].setBounds(100, 150, 124, 153);
		telaResultado.add(deckCards[10]);

	}

}

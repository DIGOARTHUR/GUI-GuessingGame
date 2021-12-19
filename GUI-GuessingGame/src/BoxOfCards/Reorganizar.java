package BoxOfCards;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Reorganizar {
	int contReload = 0;
	ImageIcon img = new ImageIcon("src//img_Table//Table.png");
	JLabel backgroundTable = new JLabel(img, JLabel.CENTER);

	public void reorganizar(JLabel deckCards[], Container table) {

		int cont = 0;
		int posY = 150;
		int posX = 200;
		int auxY;
		int linha;

		if (contReload == 0) {
			for (int y = 0; y < 3; y++) {

				for (int x = 0; x < 7; x++) {

					linha = y + (3 * x);
					posY = posY + (50 * cont);
					auxY = posY;

					try {
						Thread.sleep(150);

					} catch (InterruptedException e) {

						e.printStackTrace();
					}

					for (int z = x; z >= 0; z--) {

						deckCards[linha].setBounds(posX, auxY, 124, 153);
						table.add(deckCards[linha]);
						backgroundTable.setBounds(0, 0, 1000, 850);
						table.add(backgroundTable);
						auxY -= 50;
						linha -= 3;

					}

					posY = 150;
					cont++;
					table.revalidate();
					table.repaint();

				}
				cont = 0;
				posX += 250;

			}

		}

	}

}

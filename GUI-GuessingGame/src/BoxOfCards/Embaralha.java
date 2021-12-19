package BoxOfCards;

import java.awt.Container;

import javax.swing.JLabel;

public class Embaralha {
	int contResultado = 0;

	Cards deckCards2 = new Cards();

	public JLabel[] embaralha(JLabel deckCardsEmbaralha[], int fileira, Container table,
			Reorganizar reorganizarCartas) {

		JLabel[] auxDeckCards = new JLabel[21];
		int contColunaDois = 1;
		int contColunaUm = 0;
		int contColunaTres = 2;

		if (fileira == 1) {

			contResultado++;
			System.out.println(contResultado);
			for (int x = 0; x < 7; x++) {

				auxDeckCards[x] = deckCardsEmbaralha[contColunaDois];
				table.revalidate();
				table.repaint();
				contColunaDois += 3;

			}
			for (int x = 7; x < 14; x++) {
				table.revalidate();
				table.repaint();
				auxDeckCards[x] = deckCardsEmbaralha[contColunaUm];
				contColunaUm += 3;

			}
			for (int x = 14; x < 21; x++) {
				table.revalidate();
				table.repaint();
				auxDeckCards[x] = deckCardsEmbaralha[contColunaTres];
				contColunaTres += 3;

			}

			deckCards2.setDeckCards(auxDeckCards);

			if (contResultado > 2) {
				Resultado resultado = new Resultado();
				resultado.resultado(deckCardsEmbaralha, table);
			} else {
				table.revalidate();
				table.repaint();
				reorganizarCartas.reorganizar(deckCardsEmbaralha, table);

			}

		} else {
			if (fileira == 2) {
				contResultado++;
				for (int x = 0; x < 7; x++) {

					auxDeckCards[x] = deckCardsEmbaralha[contColunaUm];
					contColunaUm += 3;
				}
				for (int x = 7; x < 14; x++) {

					auxDeckCards[x] = deckCardsEmbaralha[contColunaDois];
					contColunaDois += 3;
				}
				for (int x = 14; x < 21; x++) {

					auxDeckCards[x] = deckCardsEmbaralha[contColunaTres];
					contColunaTres += 3;
				}

				for (int x = 0; x < 21; x++) {
					deckCardsEmbaralha[x] = auxDeckCards[x];
				}

				if (contResultado > 2) {
					Resultado resultado = new Resultado();
					resultado.resultado(deckCardsEmbaralha, table);
				} else {

					reorganizarCartas.reorganizar(deckCardsEmbaralha, table);

				}

			} else {
				if (fileira == 3) {
					contResultado++;
					for (int x = 0; x < 7; x++) {

						auxDeckCards[x] = deckCardsEmbaralha[contColunaDois];
						contColunaDois += 3;

					}
					for (int x = 7; x < 14; x++) {

						auxDeckCards[x] = deckCardsEmbaralha[contColunaTres];
						contColunaTres += 3;

					}
					for (int x = 14; x < 21; x++) {

						auxDeckCards[x] = deckCardsEmbaralha[contColunaUm];
						contColunaUm += 3;

					}

					for (int x = 0; x < 21; x++) {
						deckCardsEmbaralha[x] = auxDeckCards[x];

					}

					if (contResultado > 2) {
						Resultado resultado = new Resultado();
						resultado.resultado(deckCardsEmbaralha, table);
					} else {

						reorganizarCartas.reorganizar(deckCardsEmbaralha, table);

					}

				}
			}
		}

		return auxDeckCards;
	}

}

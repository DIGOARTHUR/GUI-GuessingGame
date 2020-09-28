package BoxOfCards;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import BoxOfCards.Table;
public class Cards {
	public static JLabel[] deckCards = new JLabel[21];
	Reorganizar cartas = new Reorganizar();
	
	// ADICTIONS CARD IN VARIABLES 

	static JLabel  ouroA= new JLabel(new ImageIcon("src//img_Cards//AOuro.png"));
	static JLabel  ouro2= new JLabel(new ImageIcon("src//img_Cards//2Ouro.png"));
	static JLabel  ouro3= new JLabel(new ImageIcon("src//img_Cards//3Ouro.png"));
	static JLabel  ouro4= new JLabel(new ImageIcon("src//img_Cards//4Ouro.png"));
	static JLabel  ouro5= new JLabel(new ImageIcon("src//img_Cards//5Ouro.png"));
	
	
	static JLabel  copasA= new JLabel(new ImageIcon("src//img_Cards//ACopas.png"));
	static JLabel  copas2= new JLabel(new ImageIcon("src//img_Cards//2Copas.png"));
	static JLabel  copas3= new JLabel(new ImageIcon("src//img_Cards//3Copas.png"));
	static JLabel  copas4= new JLabel(new ImageIcon("src//img_Cards//4Copas.png"));
	static JLabel  copas5= new JLabel(new ImageIcon("src//img_Cards//5Copas.png"));
	
	static JLabel  espK= new JLabel(new ImageIcon("src//img_Cards//KEsp.png"));
	static JLabel  espQ= new JLabel(new ImageIcon("src//img_Cards//QEsp.png"));
	static JLabel  espJ= new JLabel(new ImageIcon("src//img_Cards//JEsp.png"));
	static JLabel  esp10= new JLabel(new ImageIcon("src//img_Cards//10Esp.png"));
	static JLabel  esp9= new JLabel(new ImageIcon("src//img_Cards//9Esp.png"));
	static JLabel  esp8= new JLabel(new ImageIcon("src//img_Cards//8Esp.png"));
	
	
	static JLabel  pausK= new JLabel(new ImageIcon("src//img_Cards//KPaus.png"));
	static JLabel  pausQ= new JLabel(new ImageIcon("src//img_Cards//QPaus.png"));
	static JLabel  pausJ= new JLabel(new ImageIcon("src//img_Cards//JPaus.png"));
	static JLabel  paus10 = new JLabel(new ImageIcon("src//img_Cards//10Paus.png"));
	static JLabel  paus9= new JLabel(new ImageIcon("src//img_Cards//9Paus.png"));
	
public Cards() {
	deckCards[0]= ouroA;
	deckCards[1]= copasA;
	deckCards[2]= espK;
	deckCards[3]= pausK;
	deckCards[4]= ouro2;
	deckCards[5]= copas4;
	deckCards[6]= esp9;
	deckCards[7]= copas3;
	deckCards[8]= esp10;
	deckCards[9]= pausQ;
	deckCards[10]= ouro5;
	deckCards[11]= copas2;
	deckCards[12]= espJ;
	deckCards[13]= pausJ;
	deckCards[14]= ouro3;
	deckCards[15]= copas5;
	deckCards[16]= esp8;
	deckCards[17]= paus9;
	deckCards[18]= ouro4;
	deckCards[19]= espQ;
	deckCards[20]= paus10;
	
	// implementar reoganização aleatoria na mesa
	
}
	
	public static JLabel[] getDeckCards() {

	
		return deckCards;
	}

	public static void setDeckCards(JLabel[] auxDeckCards) {

		
		
		for (int x = 0; x < 21; x++) {
			deckCards[x] = auxDeckCards[x];
			
		}
	
	}











	
}

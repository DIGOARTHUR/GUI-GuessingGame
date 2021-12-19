package BoxOfCards;

import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


import sun.awt.RepaintArea;


public class Table extends JFrame implements ActionListener{
	

	
	Cards deckCards = new Cards();
	Embaralha embaralha = new Embaralha();
	Reorganizar reorganizarCartas = new Reorganizar();
	JPanel panel2 = new JPanel();

	
	//ACTIONS BUTTONS  
	JButton botão1 = new JButton("Fila 1");
	JButton botão2 = new JButton("Fila 2");
	JButton botão3 = new JButton("Fila 3");
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==botão1){
//janela.dispose();
			

			reorganizarCartas.reorganizar(deckCards.getDeckCards(), getContentPane());
		//	embaralha.embaralha(deckCards.getDeckCards(),1, getContentPane(), reorganizarCartas );
			
			//Embaralha embaralha = new Embaralha();
			
		//	embaralha.embaralha(deckCards,1, getContentPane(), cartas );
			
			}else {
				if(e.getSource()==botão2) {
				
					Embaralha embaralha = new Embaralha();
					
				//	embaralha.embaralha(deckCards,2,getContentPane(),cartas );
					
				} else {
					
					if(e.getSource()==botão3) {
						
						Embaralha embaralha = new Embaralha();
					//	embaralha.embaralha(deckCards,3,getContentPane(),cartas );
						
					}
				}
			}
		
	}

	
	public Table() {
		
		
	    //Configure Window 
		
		JPanel panel = new JPanel();
	
		panel2.setOpaque(false);
			 Container table= getContentPane();
				table.setLayout(null);
				
				setSize(1000,850 );
				setVisible(true);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setLocationRelativeTo(null);
				setTitle("Guessing Game GUI");
				
				
				ImageIcon img = new ImageIcon("src//img_Table//Table.png");
				JLabel backgroundTable = new JLabel("",img, JLabel.CENTER);
				backgroundTable.setBounds(0, 0, 1000, 850);
				
			
			backgroundTable.setBounds(0, 0, 1000, 850);
		    panel.add(backgroundTable);
			
		    panel.setBounds(0, 0, 1000, 850);
		    panel2.setBounds(0, 0, 1000, 850);
		    
		    
		    
		    
			botão1.setBounds(210, 50, 100, 50);
			table.add(botão1);
			botão1.addActionListener(this);
		    
			botão2.setBounds(460, 50, 100, 50);
			table.add(botão2);
			botão2.addActionListener(this);
			
			botão3.setBounds(710, 50, 100, 50);
			table.add(botão3);
			botão3.addActionListener(this);
			
			table.add(panel2);
	
		
			
			
			
			reorganizarCartas.reorganizar(deckCards.getDeckCards(), table);
		
			
		
	
		
		
	}
	
	
	
	
	public static void main (String args []) {
		
		new Table();
	}
}

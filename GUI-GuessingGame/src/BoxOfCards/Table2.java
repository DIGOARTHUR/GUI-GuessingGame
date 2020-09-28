package BoxOfCards;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Table2 extends JFrame implements ActionListener {

	
	
	
	
	
	Cards deckCards = new Cards();
	Embaralha embaralha = new Embaralha();
	Reorganizar reorganizarCartas = new Reorganizar();
	

	
	//ACTIONS BUTTONS  
	JButton botão1 = new JButton("Fila 1");
	JButton botão2 = new JButton("Fila 2");
	JButton botão3 = new JButton("Fila 3");
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==botão1){
//janela.dispose();
			
			
			embaralha.embaralha(deckCards.getDeckCards(),1, getContentPane(), reorganizarCartas );
			
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

	
	public Table2() {
		
		
	    //Configure Window 
			 Container table2=  getContentPane();
				table2.setLayout(null);
				
				setSize(1000,850 );
				setVisible(true);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setLocationRelativeTo(null);
				setTitle("JOGO DESCOBRINDO O SEU PENSAMENTO COM CARTAS");
				
				
				ImageIcon img = new ImageIcon("src//img_Table//Table.png");
				JLabel backgroundTable = new JLabel("",img, JLabel.CENTER);
				backgroundTable.setBounds(0, 0, 1000, 850);
				
			
				
	
		    
			botão1.setBounds(210, 50, 100, 50);
			table2.add(botão1);
			botão1.addActionListener(this);
		    
			botão2.setBounds(460, 50, 100, 50);
			table2.add(botão2);
			botão2.addActionListener(this);
			
			botão3.setBounds(710, 50, 100, 50);
			table2.add(botão3);
			botão3.addActionListener(this);
			
	
		
			
			
			
			reorganizarCartas.reorganizar(deckCards.getDeckCards(), table2);
		
			
		
	
		
		
	}
	
	
	
	

		
		
}


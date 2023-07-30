package interfaces;

import coffre.Coffre;
import coffre.ControleurCoffre;
import coffre.I_Strategie;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


	public class FenetreChateauMedieval extends JFrame implements ActionListener,
			WindowListener {

		private JButton btOterLivre;
		private JButton btRemettreLivre;
		private JButton btTournerGauche;
		private JButton btTournerDroite;
		private JButton btFermerCoffre;
		private JButton btQuitter;

		I_Strategie coffre;

		
		public FenetreChateauMedieval(ControleurCoffre controleurCoffre) {

			coffre = controleurCoffre;

			setTitle("exercice Chateau M�di�val (F02)");
			setBounds(500, 100, 400, 200);
			JPanel panBibliotheque = new JPanel();
			JPanel panCentre = new JPanel();
			JPanel panChandelle = new JPanel();
			JPanel panCoffre = new JPanel();
			JPanel panQuitter = new JPanel();
			Container contentPane = getContentPane();
			contentPane.setLayout(new BorderLayout());
			btOterLivre = new JButton("Oter livre UML");
			btRemettreLivre = new JButton("Remettre livre UML");
			btTournerGauche = new JButton("Tourner chandelle gauche");
			btTournerDroite = new JButton("Tourner chandelle droite");
			btFermerCoffre = new JButton("Fermer Coffre");
			btQuitter = new JButton("Quitter");
			panBibliotheque.add(btOterLivre);
			panBibliotheque.add(btRemettreLivre); 
			panChandelle.add(btTournerGauche);
			panChandelle.add(btTournerDroite); 
			panCoffre.add(btFermerCoffre);  
			panQuitter.add(btQuitter);
			
			panCentre.add(panChandelle, "North");
			panCentre.add(panCoffre, "South");			
			contentPane.add(panBibliotheque, "North");
			contentPane.add(panCentre);
			contentPane.add(panQuitter, "South");

			btOterLivre.addActionListener(this);
			btRemettreLivre.addActionListener(this);
			btTournerGauche.addActionListener(this);
			btTournerDroite.addActionListener(this);
			btFermerCoffre.addActionListener(this);
			btQuitter.addActionListener(this);
			
			addWindowListener(this);
			setVisible(true);

			coffre.addObserver(new FenetreChienGentil());
			coffre.addObserver(new FenetreEtat());
			coffre.addObserver(new FenetreLapinTueur());
		}
		
		public void actionPerformed(ActionEvent e) {
						
			if (e.getSource() == btOterLivre) {
				coffre.oterLivre();
				System.out.println("Vous venez d'appuyer sur le bouton Oter Livre UML");
			}
			if (e.getSource() == btRemettreLivre) {
				coffre.remettreLivre();
				System.out.println("Vous venez d'appuyer sur le bouton Remettre Livre UML");
			}
			if (e.getSource() == btTournerGauche) {
				coffre.tournerChandelleVersGauche();
				System.out.println("Vous venez d'appuyer sur le bouton Tourner Chandelle vers la Gauche");
			}
			;
			if (e.getSource() == btTournerDroite) {
				coffre.tournerChandelleVersDroite();
				System.out.println("Vous venez d'appuyer sur le bouton Tourner Chandelle vers la Droite");
			}
			;
			if (e.getSource() == btFermerCoffre) {
				coffre.fermerCoffre();
				System.out.println("Vous venez d'appuyer sur le bouton Fermer Coffre");
			}
			;
			if (e.getSource() == btQuitter)
			{
				System.out.println("Vous venez d'appuyer sur le bouton Quitter");				;
				System.exit(0);
			}	
		}

		public void windowClosing(WindowEvent arg0) {
			System.out.println("terminer");
			System.exit(0);
		}

		public void windowActivated(WindowEvent arg0) {}
		public void windowClosed(WindowEvent arg0) {}
		public void windowDeactivated(WindowEvent arg0) {}
		public void windowDeiconified(WindowEvent arg0) {}
		public void windowIconified(WindowEvent arg0) {}
		public void windowOpened(WindowEvent arg0) {}
		
		public static void main(String[] args) {
			FenetreChateauMedieval c = new FenetreChateauMedieval(new ControleurCoffre());
		}


	}

	



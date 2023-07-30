package interfaces;

import coffre.Coffre;
import coffre.I_Observateur;
import coffre.Observable;

import java.awt.*;
import javax.swing.*;

public class FenetreChienGentil extends JFrame implements I_Observateur {

	private JTextField txtChien;

	public FenetreChienGentil()
	{
		setTitle("Chien du Chateau M�di�val");
		setBounds(300,500,190,130);
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel labChien = new JLabel ("CHIEN");
		contentPane.add(labChien);
		txtChien = new JTextField(15);
		contentPane.add(txtChien);
		setVisible(true);
		afficherChien(false);
	}
	
	public void afficherChien(boolean libre)
	{
		if (libre == true)
			txtChien.setText("Le chien gentil est lib�r�");
		else 
			txtChien.setText("Le chien gentil est enferm�");
	}

	@Override
	public void update(Observable o) {
		Coffre c = (Coffre) o;
		afficherChien(c.chienEstLibere());
	}
}
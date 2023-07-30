package interfaces;

import coffre.Coffre;
import coffre.I_Observateur;
import coffre.Observable;

import java.awt.*;
import javax.swing.*;

public class FenetreEtat extends JFrame implements I_Observateur {

	private JTextField txtEtat;

	public FenetreEtat()
	{
		setTitle("Etat du coffre");
		setBounds(500,500,190,130);
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel labEtat = new JLabel("ETAT");
		contentPane.add(labEtat);
		txtEtat = new JTextField(15);
		contentPane.add(txtEtat);
		setVisible(true);
		afficherEtat("pas d'�tat");
	}
	
	public void afficherEtat(String etat)
	{
		txtEtat.setText(etat);
	}


	@Override
	public void update(Observable o) {
		Coffre c = (Coffre) o;
		afficherEtat(c.nomEtat());
	}
}
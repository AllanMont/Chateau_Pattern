package interfaces;

import coffre.Coffre;
import coffre.I_Observateur;
import coffre.Observable;

import java.awt.*;
import javax.swing.*;

public class FenetreLapinTueur extends JFrame implements I_Observateur {

	private JTextField txtLapin;

	public FenetreLapinTueur()
	{
		setTitle("Lapin du Chateau M�di�val");
		setBounds(700,500,190,130);
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel labLapin = new JLabel ("LAPIN");
		contentPane.add(labLapin);
		txtLapin = new JTextField(15);
		contentPane.add(txtLapin);
		setVisible(true);
		afficherLapin(false);
	}
	
	public void afficherLapin(boolean libre)
	{
		if (libre == true)
			txtLapin.setText("Le lapin tueur est lib�r�");
		else 
			txtLapin.setText("Le lapin tueur est enferm�");
	}

	@Override
	public void update(Observable o) {
		Coffre c = (Coffre) o;
		afficherLapin(c.lapinEstLibere());
	}
}
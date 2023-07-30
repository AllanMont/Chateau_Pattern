package etat;

import coffre.Coffre;

public class PresqueOuvert extends Visible {
    @Override
    public String toString() {
        return "PresqueOuvert";
    }
    public void tournerChandelleVersDroite(Coffre coffre) {
        coffre.setEtat(new Ouvert());
    }
}

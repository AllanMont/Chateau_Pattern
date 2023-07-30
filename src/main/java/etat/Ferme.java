package etat;

import coffre.Coffre;

public class Ferme extends Visible {
    @Override
    public String toString() {
        return "Ferme";
    }

    public void tournerChandelleVersDroite(Coffre coffre) {
        coffre.setEtat(new PresqueOuvert());
        coffre.setChienLibere(true);
    }

}

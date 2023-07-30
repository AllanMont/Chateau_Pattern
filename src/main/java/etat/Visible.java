package etat;

import coffre.Coffre;

public abstract class Visible extends Etat {

    public void tournerChandelleVersGauche(Coffre coffre) {
        coffre.setEtat(new Bloque());
        coffre.setLapinLibere(true);
    }

    public void remettreLivre(Coffre coffre) {
        coffre.setEtat(new Cache());
    }
}

package etat;

import coffre.Coffre;

public class Ouvert extends Etat {
    @Override
    public String toString() {
        return "Ouvert";
    }
    public void fermerCoffre(Coffre coffre) {
        coffre.setEtat(new Ferme());
    }
}

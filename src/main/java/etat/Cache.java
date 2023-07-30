package etat;

import coffre.Coffre;

public class Cache extends Etat {
    @Override
    public String toString() {
        return "CacheParBibliotheque";
    }

    public void oterLivre(Coffre coffre) {
        coffre.setEtat(new Ferme());
    }
}

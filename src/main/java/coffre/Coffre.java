package coffre;

import etat.Cache;
import etat.Etat;
import interfaces.FenetreChienGentil;

public class Coffre extends Observable implements I_CoffreChateau {
    private boolean chienLibere = false;
    private boolean lapinLibere = false;
    private Etat etat;

    public Coffre() {
        etat = new Cache();
    }

    @Override
    public void oterLivre() {
        etat.oterLivre(this);
        notifyObservers();
    }

    @Override
    public void remettreLivre() {
        etat.remettreLivre(this);
        notifyObservers();
    }

    @Override
    public void tournerChandelleVersDroite() {
        etat.tournerChandelleVersDroite(this);
        notifyObservers();
    }

    @Override
    public void tournerChandelleVersGauche() {
        etat.tournerChandelleVersGauche(this);
        notifyObservers();
    }

    @Override
    public void fermerCoffre() {
        etat.fermerCoffre(this);
        notifyObservers();
    }

    @Override
    public String nomEtat() {
        return etat.toString();
    }


    public boolean chienEstLibere() {
        return chienLibere;
    }

    public void setChienLibere(boolean chienLibere) {
        this.chienLibere = chienLibere;
    }

    public boolean lapinEstLibere() {
        return lapinLibere;
    }

    public void setLapinLibere(boolean lapinLibere) {
        this.lapinLibere = lapinLibere;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

}

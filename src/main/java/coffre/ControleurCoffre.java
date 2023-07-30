package coffre;

public class ControleurCoffre implements I_Strategie {

    Coffre coffre = new Coffre();

    @Override
    public void oterLivre() {
        coffre.oterLivre();
    }

    @Override
    public void remettreLivre() {
        coffre.remettreLivre();
    }

    @Override
    public void tournerChandelleVersDroite() {
        coffre.tournerChandelleVersDroite();
    }

    @Override
    public void tournerChandelleVersGauche() {
        coffre.tournerChandelleVersGauche();
    }

    @Override
    public void fermerCoffre() {
        coffre.fermerCoffre();
    }

    @Override
    public void addObserver(I_Observateur o) {
        coffre.addObserver(o);
    }
}

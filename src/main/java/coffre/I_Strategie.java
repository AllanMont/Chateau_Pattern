package coffre;

import coffre.I_Observateur;

public interface I_Strategie {

    public void oterLivre();

    public void remettreLivre();

    public void tournerChandelleVersDroite();

    public void tournerChandelleVersGauche();

    public void fermerCoffre();

    public void addObserver(I_Observateur o);

}

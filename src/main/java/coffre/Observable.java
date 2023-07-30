package coffre;

import java.util.ArrayList;

public class Observable {
    private ArrayList<I_Observateur> observers = new ArrayList<>();

    public void addObserver(I_Observateur o){
        observers.add(o);
    }

    public void notifyObservers() {
        for(I_Observateur o : observers) {
            o.update(this);
        }
    }
}

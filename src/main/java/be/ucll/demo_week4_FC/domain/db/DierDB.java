package be.ucll.demo_week4_FC.domain.db;

import be.ucll.demo_week4_FC.domain.model.Dier;

import java.util.ArrayList;

public class DierDB {
    private ArrayList<Dier> dieren = new ArrayList<Dier>();

    public DierDB() {
        this.voegToe(new Dier("Lex", "hond", 2));
        this.voegToe(new Dier("Nijn", "kat", 5));
        this.voegToe(new Dier("Bruintje", "kip", 1));
    }

    public void voegToe(Dier dier) {
        dieren.add(dier);
    }

    public Dier vind(String naam) {
        if (naam == null || naam.isEmpty())
            throw new IllegalArgumentException("Naam mag niet leeg zijn");
        for (Dier dier : dieren) {
            if (dier.getNaam().equals(naam))
                return dier;
        }
        return null;
    }

    public void verwijder(String naam) {
        dieren.remove(this.vind(naam));
    }

    public ArrayList<Dier> getAlle() {
        return dieren;
    }

    public Dier getMeestHongerigeDier() {
        if (dieren.size() == 0)
            return null;
        Dier meestHongerige = dieren.get(0);
        for (Dier dier : dieren) {
            if (dier.getVoedsel() > meestHongerige.getVoedsel())
                meestHongerige = dier;
        }
        return meestHongerige;
    }

}

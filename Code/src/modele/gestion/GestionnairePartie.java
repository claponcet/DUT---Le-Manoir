package modele.gestion;

public class GestionnairePartie {

    private ChargeurPartie loader = new ChargeurPartie();
    private SauvegardePartie saver = new SauvegardePartie();

    public Partie charger() {
        return this.loader.charger();
    }

    public void sauver(Partie partie) {
        this.saver.sauver(partie);
    }
}

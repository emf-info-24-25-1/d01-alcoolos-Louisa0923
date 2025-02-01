package app;

public class Ami {
    private String nom;
    private int bieresRestantes;

    public Ami(String nom, int bieresRestantes) {
        this.nom = nom;
        this.bieresRestantes = bieresRestantes;
    }

    public String getNom() {
        return nom;
    }

    public int getBieresRestantes() {
        return bieresRestantes;
    }

    public void boitUneBiere() {
        if (bieresRestantes > 0) {
            bieresRestantes--;
            System.out.println(
                    nom + " a bu une bière. Il lui reste " + bieresRestantes + " bières qu'il peut encore boire.");
        } else {
            System.out.println(nom + " est déjà saoul et ne peut plus boire de bières !");
        }
    }

}


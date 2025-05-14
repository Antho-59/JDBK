package org.example.demo01BasesPoo.classes;

public class Compte {

    // Attributs
    private int code;
    protected float solde;

    // constructeur
    public Compte(int code, float solde) {
        this.code = code;
        this.solde = solde;
    }
    // Methodes
    public void verser(float montant){
        solde += montant;
    }
    public void retirer (float montant){
        solde -= montant;
    }

    @Override
    public String toString() {
        return "Compte : code = " + code +
                " solde = " + solde +" .";
    }
}

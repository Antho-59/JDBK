package org.example.exoJoueur;

public class Main {
    public static void main(String[] args) {

        Joueur joueur = new Joueur("mario",1,84);

        System.out.println("quete 1");
        joueur.effectuerUneQuete();

        System.out.println("quete 2");
        joueur.effectuerUneQuete();


    }
}

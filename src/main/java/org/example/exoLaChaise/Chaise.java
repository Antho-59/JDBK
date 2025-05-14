package org.example.exoLaChaise;

//Créer une classe Chaise possédant comme variables d’instance le nombre de pieds, le
//matériaux et la couleur de l’objet
//2. Afficher ses informations en surchargeant une méthode de la classe Object
//3. La classe Chaise pourra être instanciée avec ou sans paramètres (Constructeur par
//défaut)
//4. Afficher toutes les chaises (Possibilité de simplifier avec une méthode ToString)

public class Chaise {
    private int nbPied;
    private String materiaux;
    private  String color;

    // const 1
    public Chaise(int nbPied, String materiaux, String color) {
        this.nbPied = nbPied;
        this.materiaux = materiaux;
        this.color = color;
    }

    // const 2
    public Chaise() {
    }

    // set / get


    public int getNbPied() {
        return nbPied;
    }

    public void setNbPied(int nbPied) {
        this.nbPied = nbPied;
    }

    public String getMateriaux() {
        return materiaux;
    }

    public void setMateriaux(String materiaux) {
        this.materiaux = materiaux;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "La Chaise à " + nbPied + " pieds , elle est faite en  "+ materiaux + " et a pour couleur " + color;
    }

    }


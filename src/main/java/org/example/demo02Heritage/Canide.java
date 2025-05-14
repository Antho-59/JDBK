package org.example.demo02Heritage;

public class Canide {

    protected int age; // accessible librement dans les classes enfants
    protected String nom;

    public Canide(int age, String nom) {
        this.age = age;
        this.nom = nom;
    }

    public void crier(){
        System.out.println("cri du canidé !!!");
    }

// guetter setter

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

// To String
    @Override
    public String toString() {
        return "Canide de nom : " + this.nom + " et d'age : " + this.age;
    }



}

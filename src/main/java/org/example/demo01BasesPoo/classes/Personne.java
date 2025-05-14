package org.example.demo01BasesPoo.classes;

public class Personne {
    private int code;
    private String nom;
    public int age;

    // Constructeur
    public Personne(int code, String nom, int age) {
        this.code = code;
        this.nom = nom;
        this.age = age;
    }

    // 2eme forme du constructeur - il est polymorphe
    public Personne(){
    }

    // 3eme forme du constructeur - signature !=
    public Personne(String nom, int age) {
        this.code = 999;
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom.toLowerCase().startsWith("c")) {
            System.out.println("les prenoms commençant par  C  ne sont pas accepté");
        } else {
            this.nom = nom;
        }
    }

    @Override
    public String toString() {
        return "Personne{" +
                "code = " + code +
                ", nom = '" + nom + '\'' +
                ", age = " + age +
                '}';
    }
}

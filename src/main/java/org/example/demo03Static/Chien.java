package org.example.demo03Static;

public class Chien {

    private String nom;
    private  int age;
    private  String race;

    // Attributs de classes (static)
    private static String espece = "Canis Lupus Familiaris";
    private static  int nombreChien = 0;

    public Chien (String nom,int age, String race){
        this.nom = nom;
        this.age = age;
        this.race = race;
        nombreChien++;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public static String getEspece() {
        return espece;
    }

    public static void setEspece(String espece) {
        Chien.espece = espece;
    }

    public static int getNombreChien() {
        return nombreChien;
    }

    public static void setNombreChien(int nombreChien) {
        Chien.nombreChien = nombreChien;
    }

    public static void lesChiensPeuventVoler(){
        System.out.println("les chiens ne volent pas");
    }

    @Override
    public String toString() {
        return "Chien{ " +
                "nom = '" + nom + '\'' +
                ", age = " + age +
                ", race = '" + race + '\'' +
                '}';
    }
}

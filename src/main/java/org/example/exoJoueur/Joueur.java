package org.example.exoJoueur;

//1. Créer une classe Joueur
//2. Ajouter les attributs suivants : nom, niveau et points d'expérience
//        3. Ajouter un constructeur, des getters et des setters pour ces attributs
//4. Créer une méthode effectuerUneQuete() qui ajoute 10 points d'expérience
//au joueur
//5. Créer qu'une méthode qui augmente le niveau du joueur de +1 si son
//expérience dépasse 100 points et réinitialise son expérience
//6. Tester le programme

public class Joueur {
    private String nom;
    private  int niveau;
    private int XP;

    public Joueur(String nom, int niveau, int XP) {
        this.nom = nom;
        this.niveau = niveau;
        this.XP = XP;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getXP() {
        return XP;
    }

    public void setXP(int XP) {
        this.XP = XP;
    }



    public void effectuerUneQuete(){
        this.XP = this.XP+10;
        System.out.println("Vous avez maintenant : "+this.XP+" XP");
        if (this.XP>= 100){
            this.niveau++;
            this.XP =this.XP-100;
            System.out.println("Lvl up , vous etes lvl: "+this.niveau+ " et "+this.XP+" XP");
        }
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "nom='" + nom + '\'' +
                ", niveau=" + niveau +
                ", XP=" + XP +
                '}';
    }
}

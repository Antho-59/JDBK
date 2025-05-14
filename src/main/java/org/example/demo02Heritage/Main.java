package org.example.demo02Heritage;

public class Main {
    public static void main(String[] args) {

        Chien chien = new Chien(7,"rex","Labrador");
        Chien chien2 = new Chien(8,"rox","Malinois");

        chien.crier();

        Hyenne hyenne = new Hyenne(4,"hyhy");

        hyenne.crier();

        System.out.println(chien);
        System.out.println(hyenne);


        Chien[] chiens = {chien , chien2 };  // impossible de melanger chien et hyenne
        Hyenne[] hyennes = {hyenne};

        Canide[] canides= {chien, hyenne, chien2};   // comme il partahe l'heritage creation possible
        System.out.println(" ");

        for (Canide canide : canides){
            System.out.println("#..............#");
            System.out.println(canide);
            System.out.println("#..............#");
        if (canide instanceof Chien){
            Chien chien3 = (Chien) canide;
            System.out.println(" il s'agit d'un chien");
            canide.crier();
        }
        }

    }
}

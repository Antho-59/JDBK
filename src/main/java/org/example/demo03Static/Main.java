package org.example.demo03Static;

public class Main {
    public static void main(String[] args) {
        System.out.println(Chien.getNombreChien());
        System.out.println(Chien.getEspece());

        Chien chien1 = new Chien("rex",5,"labrador");
        Chien chien2 = new Chien("Poupette",2,"pitbull");

        System.out.println(Chien.getNombreChien());

        Chien.lesChiensPeuventVoler();
    }
}

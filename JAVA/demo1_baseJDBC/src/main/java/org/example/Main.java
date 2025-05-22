package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

      // 1 creation nouveau projet
      //2 Ajout dependencies maven
        // ajout balise dependencies ds pom.xml a la racine
        // 3 ajouter le connector correpondant a ma BDD


        String url = "jdbc:mysql://localhost:3306/demo_jdbc";
        String username = "root";
        String password = "formation";

        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            if (connection != null){
                System.out.println("la connexion est OK");
            }else {
                System.out.println("la connexion a échoué");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }


        // meilleur pratique : mettre la connection ds une classe a aprt
        // voir ConnectionUtils et Demo2



    }
}
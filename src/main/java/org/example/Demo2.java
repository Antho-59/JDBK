package org.example;

import org.example.utils.ConnectionUtils;

import java.sql.*;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        // test de co

//        try {
//            Connection connection = ConnectionUtils.getSQLConnection();
//            if (connection != null){
//                System.out.println("co OK");
//            }else{
//                System.out.println(" no , va verifier classe ConnectionUtils");
//            }
//        }catch (SQLException e){
//            System.out.println();
//        }

        // fin test de co


        // demo de base
        // enregistrer une saisie user en BDD

        Scanner scanner = new Scanner(System.in);
        Connection connection = null;
        try {
            connection = ConnectionUtils.getSQLConnection();
            System.out.println("on vient de se co a la bdd");
            System.out.println("saisir prenom");
            String firstName = scanner.nextLine();
            System.out.println("nom");
            String lastName = scanner.nextLine();
            // une requte pour l'insertion des data

//            String request = "INSERT INTO users (first_name,last_name) values ('"+firstName+"','"+lastName+"')";
//            System.out.println("voici la resuqte que je vais faire "+ request);
//
//            //facon 1 - execution d'une reQuete sans retour
//            Statement statement = connection.createStatement();
//            statement.execute(request);
//            System.out.println("requete executée");


            // facon n2 - rqt préparé
//            String request = "INSERT INTO users (first_name,last_name) values (?,?)";
//            PreparedStatement preparedStatement = connection.prepareStatement(request);
//            preparedStatement.setString(1,firstName);
//            preparedStatement.setString(2,lastName);
//            // preparedStatement.execute(); // retour boolean
//            int nbrRows = preparedStatement.executeUpdate(); // retour qui correspond au nb ligne affecté
//            System.out.println("nb ligne affecté : "+nbrRows);

            // facon 3 , version avec recup id autogénéré
            String request = "INSERT INTO users (first_name,last_name) values (?,?)";
            PreparedStatement preparedStatement =connection.prepareStatement(request,Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,firstName);
            preparedStatement.setString(2,lastName);
            int nbrRows = preparedStatement.executeUpdate(); // retour qui correspond au nb  ligne affecte
            ResultSet resultSet =preparedStatement.getGeneratedKeys();
            System.out.println(" nbre de ligne : "+nbrRows);
            if (resultSet.next()){
                System.out.println("id de la ligne inséré "+resultSet.getInt(1));
            }


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            // fermer la co ds le bloc finally pour garantir sa fermeture
            if (connection != null){
                try {
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }


    }
}

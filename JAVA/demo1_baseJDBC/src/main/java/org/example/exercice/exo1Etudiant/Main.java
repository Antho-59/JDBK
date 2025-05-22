package org.example.exercice.exo1Etudiant;

import org.example.utils.ConnectionUtils;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Connection connection = null;

        try {
            connection = ConnectionUtils.getSQLConnection();
            System.out.println("on vient de se co a la bdd");


//            System.out.println("nom : ");
//            String nom = scanner.nextLine();
//            System.out.println("prenom : ");
//            String prenom = scanner.nextLine();
//            System.out.println("classe : ");
//            int classe = scanner.nextInt();
//            scanner.nextLine();
//            System.out.println("date d'obtention du diplome : ");
//            String dateDiplome = scanner.nextLine();

//            String request = "INSERT INTO student (first_name,last_name,classe,date_diplome) values (?,?,?,?)";
//            PreparedStatement preparedStatement =connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
//            preparedStatement.setString(1,nom);
//            preparedStatement.setString(2,prenom);
//            preparedStatement.setInt(3,classe);
//            // scanner.nextLine();//retour chariot
//            preparedStatement.setString(4,dateDiplome);
//            int nbrRows = preparedStatement.executeUpdate();
//            ResultSet resultSet = preparedStatement.getGeneratedKeys();
//            System.out.println(" nbre de ligne : "+nbrRows);
//            if (resultSet.next()) {
//                System.out.println("id de la ligne inséré " + resultSet.getInt(1));
//            }

//            String rq2 = "SELECT * FROM student"; // GOOD
//            PreparedStatement preparedStatement2 =connection.prepareStatement(rq2);
//            ResultSet resultSet2 = preparedStatement2.executeQuery();
//            while (resultSet2.next()){
//                System.out.println(" la personne avec l'id : "+resultSet2.getInt("id"));
//                System.out.println("son nom "+resultSet2.getString("first_name"));
//                System.out.println("son prenom "+resultSet2.getString("last_name"));
//                System.out.println("sa classe "+resultSet2.getString("classe"));
//                System.out.println("date diplome "+resultSet2.getString("date_diplome"));
//            }
            String rq3 = "SELECT * FROM student WHERE classe = ?";
            PreparedStatement preparedStatement3 =connection.prepareStatement(rq3);
            System.out.println("quel id supr ?");
            int id = scanner.nextInt();
            preparedStatement3.setInt(id,1);
            ResultSet resultSet3 = preparedStatement3.executeQuery();
            if (resultSet3.next()){
                System.out.println(" la personne avec l'id : "+resultSet3.getInt("id"));
                System.out.println("son nom "+resultSet3.getString("first_name"));
                System.out.println("son prenom "+resultSet3.getString("last_name"));
                System.out.println("sa classe "+resultSet3.getString("classe"));
                System.out.println("date diplome "+resultSet3.getString("date_diplome"));
            }

//            String rq4 = "DELETE FROM student WHERE id = ?";


        }catch  (SQLException e){
            System.out.println(e.getMessage());
        }finally {
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

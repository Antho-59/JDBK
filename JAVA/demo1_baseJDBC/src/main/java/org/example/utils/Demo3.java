package org.example.utils;

import java.sql.*;

public class Demo3 {
    public static void main(String[] args) {

        // recup de donnée
        Connection connection = null;
        String request = "SELECT * FROM users";
        try {
            connection = ConnectionUtils.getSQLConnection();
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(request);
//            while ((resultSet.next())) {
//                System.out.print("la colonne id " + resultSet.getInt("id"));
//                System.out.print(" la colonne first name " + resultSet.getString("first_name"));
//                System.out.println(" la colonne last name " + resultSet.getString("last_name"));
//            }

            String request2 = "SELECT * FROM users where id = ?";
            PreparedStatement statement = connection.prepareStatement(request2);
            statement.setInt(1,3);;
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
                System.out.println(" la personne avec l'id numero 3 : ");
                System.out.println("son nom "+resultSet.getString("first_name"));
                System.out.println("son prenom "+resultSet.getString("last_name"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }


        }
    }
}

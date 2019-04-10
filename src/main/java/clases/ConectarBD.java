package clases;

import java.sql.*;

public class ConectarBD {

    public static void insertar(String query) {
        try {
            Statement miStatement = conectarbd();
            miStatement.executeUpdate(query);
            System.out.println("Inserto correctamente al ganador en la BD");
        } catch (SQLException e) {
            System.out.println("No Inserto");
        }
    }

    private static Statement conectarbd() {
        Connection miConexion;
        Statement miStatement = null;
        try {
            miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/vikingosespartanos", "root", "");
            miStatement = miConexion.createStatement();
        } catch (SQLException ex) {
            System.out.println("No conecta");
        }
        return miStatement;
    }

}

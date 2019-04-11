package clases;

import java.sql.*;

public class ConectarBD {

    public static void insertar(String query) {
        try {
            //Capturo la conexion
            Statement miStatement = conectarbd();
            //Ejecuto la query que me llega por parametro
            miStatement.executeUpdate(query);
            //Informo que se inserto correctamente
            System.out.println("Inserto correctamente al ganador en la BD");
        } catch (SQLException e) {
            //Si hay algun problema al insertar, tira un error
            System.out.println("No Inserto");
        }
    }

    private static Statement conectarbd() {
        Connection miConexion;
        Statement miStatement = null;
        try {
            //Creo la conexion con la base de datos
            miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/vikingosespartanos", "root", "");
            //Creo el statement
            miStatement = miConexion.createStatement();
        } catch (SQLException ex) {
            //De no conectar tira un error
            System.out.println("No conecta");
        }
        //Retorno el statement
        return miStatement;
    }

}

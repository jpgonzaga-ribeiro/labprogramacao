/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

/**
 *
 * @author jpgon
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String URL = "jdbc:mysql://localhost:3307/biblioteca";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    
   public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        }catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar com o banco de dados.", e);
        }
    }
}


/*
Usamos DriverManager para obter uma conexão com o banco de dados.
Se ocorrer uma exceção, ela será tratada e lançada como uma RuntimeException.*/


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.Conexaojdbc;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Usuario;



public class UsuarioDAO {
    private Connection con;
    
    public UsuarioDAO(){
        this.con = new Conexaojdbc().getConnection();
    }
    
    public List<Usuario> listarUsuario(){
        try{
           List<Usuario> usuarios = new ArrayList<>();
           String select = "SELECT * FROM usuario";
           PreparedStatement pst = con.prepareStatement(select);
           ResultSet rs = pst.executeQuery();
           
           while(rs.next()){
               Usuario usuario = new Usuario();
               usuario.setId(rs.getInt("id"));
               usuario.setNome(rs.getString("nome"));
               usuario.setEmail(rs.getString("email"));
               usuario.setLogin(rs.getString("login"));
               usuario.setSenha(rs.getString("senha"));
               
               usuarios.add(usuario);
               
               System.out.println("Nome: "+ usuario.getNome() +"\n"+ "Email: "+ usuario.getEmail());
               System.out.println("--------------------------------------------------------------------");
                       
           }
           rs.close();
           pst.close();
                  
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    
    
}

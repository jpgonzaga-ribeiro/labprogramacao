/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.Conexaojdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Funcionario;
import model.Usuario;

/**
 *
 * @author Aluno
 */
public class FuncionarioDAO {
    private Connection con;
    private Funcionario funcionario;
    
    public FuncionarioDAO(){
        this.con = new Conexaojdbc().getConnection();
    }
    
    
    public void inserirFuncionario(Funcionario funcionario) {
    String sql = "INSERT INTO funcionarios (nome, cargo, data_contratacao, salario) VALUES (?, ?, ?, ?)";
    try {
        PreparedStatement pstmt = con.prepareStatement(sql);
        
        pstmt.setString(1, funcionario.getNome());
        pstmt.setString(2, funcionario.getCargo());
        pstmt.setString(3, funcionario.getDataContratacao());
        pstmt.setDouble(4, funcionario.getSalario());
        
        // Use executeUpdate() para uma operação de inserção
        pstmt.executeUpdate();
        System.out.println("Funcionário inserido com sucesso!");
        
        pstmt.close();
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


   public List<Funcionario> listarFuncionario(){
        try{
           List<Funcionario> funcionarios = new ArrayList<>();
           String select = "SELECT * FROM funcionarios";
           PreparedStatement pst = con.prepareStatement(select);
           ResultSet rs = pst.executeQuery();
           
           while(rs.next()){
               Funcionario funcionario = new Funcionario();
               funcionario.setNome(rs.getString("nome"));
               funcionario.setCargo(rs.getString("cargo"));
               funcionario.setDataContratacao(rs.getString("data_contratacao"));
               funcionario.setSalario(rs.getFloat("salario"));
               
               funcionarios.add(funcionario);
               
               System.out.println("Funcionario: \nNome: "+ funcionario.getNome() +"\n"+ "Cargo: "+ funcionario.getCargo());
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

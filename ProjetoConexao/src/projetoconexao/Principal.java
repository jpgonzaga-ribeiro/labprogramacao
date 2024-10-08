/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoconexao;

/**
 *
 * @author Aluno
 */
public class Principal {
    public static void main(String[] args) {
        try{
            Conexaojdbc conn = new Conexaojdbc();
            conn.getConnection();
            System.out.println("Conectado!");
        } catch(Exception e){
            System.out.println("Não Conectado!");            
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conectionfactory;

import dao.FuncionarioDAO;
import dao.UsuarioDAO;
import model.Funcionario;

/**
 *
 * @author Aluno
 */
public class ConectionFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UsuarioDAO usuario = new UsuarioDAO();
        usuario.listarUsuario();
        FuncionarioDAO funcionariodao = new FuncionarioDAO();
        Funcionario funcionario = new Funcionario("jONAS", "garoto de ROÇA", "2012-07-01", 3500.00);
        
        funcionariodao.inserirFuncionario(funcionario);
        funcionariodao.listarFuncionario();
        
    }
    
}

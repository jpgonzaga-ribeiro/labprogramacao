/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoconexao;

import conexao.Conexaojdbc;
import dao.UsuarioDAO;

/**
 *
 * @author Aluno
 */
public class Principal {
    public static void main(String[] args) {
        UsuarioDAO usuario = new UsuarioDAO();
        usuario.listarUsuario();
    }
}

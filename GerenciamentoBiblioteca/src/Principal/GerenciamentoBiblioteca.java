/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import controller.LoginController;
import dao.UsuarioDAO;
import javax.swing.SwingUtilities;
import view.LoginView;

/**
 *
 * @author jpgon
 */
public class GerenciamentoBiblioteca {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            LoginView loginView = new LoginView();
            LoginController loginController = new LoginController(usuarioDAO, loginView);
            loginView.setVisible(true);
        });
    }
    
}

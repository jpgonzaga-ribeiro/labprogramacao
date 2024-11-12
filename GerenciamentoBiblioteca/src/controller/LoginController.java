/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.UsuarioDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author jpgon
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.LoginView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {
    private UsuarioDAO usuarioDAO;
    private LoginView loginView;

    public LoginController(UsuarioDAO usuarioDAO, LoginView loginView) {
        this.usuarioDAO = usuarioDAO;
        this.loginView = loginView;

        // Listener para o botão de login
        this.loginView.addLoginListener(new LoginButtonListener());
    }

    private class LoginButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String email = loginView.getEmail();
            String senha = loginView.getSenha();

            if (usuarioDAO.autenticar(email, senha)) {
                loginView.showSuccess("Login bem-sucedido.");
            } else {
                loginView.showError("Credenciais inválidas.");
            }
        }
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JFrame;

/**
 *
 * @author jpgon
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    private JTextField tfEmail;
    private JPasswordField pfSenha;
    private JButton btnLogin;
    private JLabel lblMessage;

    public LoginView() {
        setTitle("Login");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Criação dos componentes
        tfEmail = new JTextField(20);
        pfSenha = new JPasswordField(20);
        btnLogin = new JButton("Login");
        lblMessage = new JLabel("");
        lblMessage.setForeground(Color.RED);

        // Configuração do layout e posicionamento dos componentes
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(new JLabel("Email:"), gbc);

        gbc.gridy = 1;
        add(tfEmail, gbc);

        gbc.gridy = 2;
        add(new JLabel("Senha:"), gbc);

        gbc.gridy = 3;
        add(pfSenha, gbc);

        gbc.gridy = 4;
        gbc.gridwidth = 1;
        add(btnLogin, gbc);

        gbc.gridy = 5;
        gbc.gridwidth = 2;
        add(lblMessage, gbc);

        setResizable(false);
    }

    public String getEmail() {
        return tfEmail.getText();
    }

    public String getSenha() {
        return new String(pfSenha.getPassword());
    }

    public void showError(String message) {
        lblMessage.setForeground(Color.RED);
        lblMessage.setText(message);
    }

    public void showSuccess(String message) {
        lblMessage.setForeground(Color.GREEN);
        lblMessage.setText(message);
    }

    public void addLoginListener(ActionListener listener) {
        btnLogin.addActionListener(listener);
    }
}

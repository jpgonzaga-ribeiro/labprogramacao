package view;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {
    private JTextField tfUsername;
    private JPasswordField pfPassword;
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

        tfUsername = new JTextField(20);
        pfPassword = new JPasswordField(20);
        btnLogin = new JButton("Login");
        lblMessage = new JLabel("");
        lblMessage.setForeground(Color.RED);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(new JLabel("Usuário:"), gbc);
        
        gbc.gridy = 1;
        add(tfUsername, gbc);

        gbc.gridy = 2;
        add(new JLabel("Senha:"), gbc);
        
        gbc.gridy = 3;
        add(pfPassword, gbc);
        
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        add(btnLogin, gbc);
        
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        add(lblMessage, gbc);

        setResizable(false);
    }

    public String getUsername() {
        return tfUsername.getText();
    }

    public String getPassword() {
        return new String(pfPassword.getPassword());
    }

    public void setMessage(String message) {
        lblMessage.setText(message);
    }

    public void addLoginListener(java.awt.event.ActionListener listener) {
        btnLogin.addActionListener(listener);
    }
}

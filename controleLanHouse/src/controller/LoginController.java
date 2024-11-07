package controller;

import dao.UserDAO;
import model.User;
import view.LoginView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {
    private LoginView view;
    private UserDAO userDAO;

    public LoginController(LoginView view) {
        this.view = view;
        this.userDAO = new UserDAO();

        this.view.addLoginListener(new LoginActionListener());
    }

    private class LoginActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = view.getUsername();
            String password = view.getPassword();
            User user = new User(username, password);

            if (userDAO.validateUser(user)) {
                view.setMessage("Login bem-sucedido!");
                
            } else {
                view.setMessage("Usuário ou senha inválidos!");
            }
        }
    }
}

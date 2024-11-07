/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import controller.LoginController;
import view.LoginView;

public class Main {
    public static void main(String[] args) {
        LoginView view = new LoginView();
        new LoginController(view);
        view.setVisible(true);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastropessoa;

import javax.swing.JFrame;
import view.jfrCadPessoa;

/**
 *
 * @author jpgon
 */

public class CadastroPessoa {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new jfrCadPessoa().setVisible(true);
        });
    }
}

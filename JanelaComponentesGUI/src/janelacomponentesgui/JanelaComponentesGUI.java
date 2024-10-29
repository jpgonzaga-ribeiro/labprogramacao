/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package janelacomponentesgui;

import javax.swing.SwingUtilities;
import view.Janela;


/**
 *
 * @author Aluno
 */
public class JanelaComponentesGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Janela janela = new Janela();
            janela.setVisible(true);
        });
    }


    
}

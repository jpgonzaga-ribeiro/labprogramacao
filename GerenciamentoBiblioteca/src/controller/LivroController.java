/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.LivroDAO;
import javax.swing.JOptionPane;
import model.Livro;

/**
 *
 * @author jpgon
 */
public class LivroController {
    private LivroDAO livroDAO;

    public LivroController(LivroDAO livroDAO) {
        this.livroDAO = livroDAO;
    }

    public void cadastrarLivro(Livro livro) {
        livroDAO.inserirLivro(livro);
        JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso.");
    }
}


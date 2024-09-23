/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardotp2;

import javax.swing.JOptionPane;

/**
 * @author Aluno
 */
public class LivroFisico extends Livro {

    private Double peso;

    public LivroFisico(String titulo, String autor, Integer numeroPaginas, Double peso) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.peso = peso;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public void Descricao() {
        JOptionPane.showMessageDialog(null, "Livro Físico de peso: " + this.peso);
    }

}

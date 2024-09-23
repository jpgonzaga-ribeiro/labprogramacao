/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardotp2;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Ebook extends Livro{
    
    private Double TamanhoArquivo;
    
     public Ebook(String titulo, String autor, Integer numeroPaginas,Double TamanhoArquivo) {
         this.titulo = titulo;
         this.autor = autor;
         this.numeroPaginas  = numeroPaginas;
         this.TamanhoArquivo = this.TamanhoArquivo;
    }

    public Double getTamanhoArquivo() {
        return TamanhoArquivo;
    }

    public void setTamanhoArquivo(Double TamanhoArquivo) {
        this.TamanhoArquivo = TamanhoArquivo;
    }
    
    @Override
    public void Descricao(){
        JOptionPane.showMessageDialog(null,"Livro Digital de peso: " + this.TamanhoArquivo);
    }
}

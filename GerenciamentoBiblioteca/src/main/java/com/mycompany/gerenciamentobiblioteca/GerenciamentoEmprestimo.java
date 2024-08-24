/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentobiblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Aluno
 */
public class GerenciamentoEmprestimo {
    //Hashmap que realiza o mapeamento//associação de chave e valor
    // que no caso a chave é Integer que referencia ID do livro e o valor referencia a String do Nome do membro
    private Map<Integer, String> emprestimosList;
    private ArrayList<GerenciamentoLivro>  livro;
    private ArrayList<GerenciamentoMembro>  membro;
    
    public GerenciamentoEmprestimo() {
        this.emprestimosList = new HashMap<>();
        this.livro = new ArrayList<>();
        this.membro = new ArrayList<>();
    }


    public void RealizarEmprestimo (GerenciamentoLivro livro, GerenciamentoMembro membro){
        //.put seria basicamente um .add de um Arraylist, mas como é um Map, ele requer uma chave e um valor
        //para a associação ou mapeamento entre dois tipos
        emprestimosList.put(livro.getId(), membro.getNome());

    }

    public void ListarEmprestimos(){
        emprestimosList.forEach((idLivro, nomeMembro) ->
                System.out.println("Número do Livro que foi emprestado: " + idLivro + " - Membro que o pegou: " + nomeMembro ));
    }

    public void EncerrarEmprestimo(Integer idLivro, String nomeMembro){
        //remoçao atraves do idLivro e do nomeMembro, para a exclusao da chave e valor do HashMap
        emprestimosList.remove(idLivro, nomeMembro);
        System.out.println("ATENÇÃO! O livro de número: " + idLivro + " - Foi entregue pelo - Membro: " + nomeMembro);

    }
   
    
}

package com.mycompany.gerenciamentobiblioteca;

import java.util.Scanner;

public class GerenciamentoBiblioteca {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criação de livros
        GerenciamentoLivro livro1 = new GerenciamentoLivro(1, "Livro 1");
        GerenciamentoLivro livro2 = new GerenciamentoLivro(2, "Livro 2");
        GerenciamentoLivro livro3 = new GerenciamentoLivro(3, "Livro 3");
        GerenciamentoLivro livro4 = new GerenciamentoLivro(4, "Livro 4");
        GerenciamentoLivro livro5 = new GerenciamentoLivro(5, "Livro 5");
        GerenciamentoLivro livro6 = new GerenciamentoLivro(6, "Livro 6");

        // Inclusão de livros
        livro1.Cadastrar();
        livro2.Cadastrar();
        livro3.Cadastrar();
        livro4.Cadastrar();
        livro5.Cadastrar();
        livro6.Cadastrar();
        GerenciamentoLivro.listarGerenciamentoLivro();

        // Edição de livros
        System.out.println("Insira o nome do livro que queira editar");
        String nomeLivro = sc.nextLine();
        System.out.println("Insira o novo nome do livro");
        String nomeNovoLivro = sc.nextLine();
        GerenciamentoLivro.editarLivroPorTitulo(nomeLivro, nomeNovoLivro);

        // Exclusão de livros
        livro6.Remover(); // Devido à exclusão deste, logo não será printado

        // Listar livros
        System.out.println("Listar livros: ");
        GerenciamentoLivro.listarGerenciamentoLivro();
        System.out.println("____________________________________________________________________________\n\n");
        /*---------------------------------------------------------------------------------------------*/
        // Criação de membros
        GerenciamentoMembro membro1 = new GerenciamentoMembro(1, "Membro 1");
        GerenciamentoMembro membro2 = new GerenciamentoMembro(2, "Membro 2");
        GerenciamentoMembro membro3 = new GerenciamentoMembro(3, "Membro 3");
        GerenciamentoMembro membro4 = new GerenciamentoMembro(4, "Membro 4");
        GerenciamentoMembro membro5 = new GerenciamentoMembro(5, "Membro 5");
        GerenciamentoMembro membro6 = new GerenciamentoMembro(6, "Membro 6");

        //Cadastro de membros
        System.out.println("\nInsira o ID do membro: ");
        Integer id = sc.nextInt();
        sc.nextLine();
        System.out.println("\nInsira o nome do membro: ");
        String nomedoMembro = sc.nextLine();
        GerenciamentoMembro membro = new GerenciamentoMembro(id, nomedoMembro);
        membro.Cadastrar();

        // Inclusão de membros, quantidade adicionada para a associação de empréstimos
        membro1.Cadastrar();
        membro2.Cadastrar();
        membro3.Cadastrar();
        membro4.Cadastrar();
        membro5.Cadastrar();
        membro6.Cadastrar();

        // Edição de membros
        System.out.println("\nInsira o nome do membro que queira editar");
        String nomeMembro = sc.nextLine();
        System.out.println("\nInsira o novo nome do membro");
        String nomeMembroNovo = sc.nextLine();
        GerenciamentoMembro.editarMembroPorNome(nomeMembro, nomeMembroNovo);


        // Exclusão de membros
        membro6.Remover(); // Devido à exclusão deste, logo não será printado

        // Listar membros
        System.out.println("\nLista final dos membros: ");
        GerenciamentoMembro.listarGerenciamentoMembro();
        System.out.println("\n\n____________________________________________________________________________");
        /*---------------------------------------------------------------------------------------------*/
        GerenciamentoEmprestimo emprestimo = new GerenciamentoEmprestimo();

        emprestimo.RealizarEmprestimo(livro1, membro1);
        emprestimo.RealizarEmprestimo(livro2, membro2);
        emprestimo.RealizarEmprestimo(livro3, membro3);
        emprestimo.RealizarEmprestimo(livro4, membro4);
        emprestimo.RealizarEmprestimo(livro5, membro5);

        System.out.println("\nListar empréstimos: ");
        emprestimo.ListarEmprestimos();
        System.out.println("\n");

        emprestimo.EncerrarEmprestimo(livro4.getId(), membro4.getNome());
        emprestimo.EncerrarEmprestimo(livro5.getId(), membro5.getNome());
        System.out.println("\nLista final dos empréstimos: ");
        emprestimo.ListarEmprestimos();
        System.out.println("____________________________________________________________________________\n\n");
    }
}

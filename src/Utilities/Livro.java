package Utilities;

import javax.swing.*;

public class Livro extends Produto {

    private String autor = "";
    private long isbn = 0;

    public Livro(String nome, int codigo, double preco, String autor, long isbn) {
        super(nome, codigo, preco);
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void exibirLivro(){
        JOptionPane.showMessageDialog(null, "Codigo do Livro: " + getCodigo() + "\n" +
                                                                    "Nome: " + getNome()  + "\n" +
                                                                    "Autor: " + getAutor() + "\n" +
                                                                    "ISBN: " + getIsbn() + "\n" +
                                                                    "Preço: R$ " + getPreco());
    }
}

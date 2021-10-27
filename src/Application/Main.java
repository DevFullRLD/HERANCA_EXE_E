package Application;

import Utilities.CompactDisc;
import Utilities.Livro;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int opera = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opção que deseja Cadastras" + "\n" +
                                                                "1 - Cadastro de CD's " + "\n" +
                                                                "2 - Cadastro de Livro"));

        switch (opera){

            case 1:{
                //ENTRADA DE DADOS
                int     cod    = Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo do CD:"));
                String nome    = JOptionPane.showInputDialog("Digite o nome do Banda/Album:");
                String artista = JOptionPane.showInputDialog("Digite o nome do Artista:");
                String gravadora = JOptionPane.showInputDialog("Digite a gravadora:");
                double preco   = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do CD:"));
                CompactDisc comp = new CompactDisc(nome,cod ,preco , artista, gravadora);

                //ATRIBUIR OS DADOS
                comp.setNome(nome);
                comp.setArtista(artista);
                comp.setGravadora(gravadora);
                comp.setPreco(preco);
                comp.setCodigo(cod);

                //EXIBIR OS DADOS
                comp.exibirDisco();
                break;
            }
            case 2:{
                //ENTRADA DE DADOS
                int    cod   = Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo do Livro:"));
                String nome  = JOptionPane.showInputDialog("Digite o nome do Livro:");
                String autor = JOptionPane.showInputDialog("Digite o nome do Autor:");
                long   isbn  = Long.parseLong(JOptionPane.showInputDialog("Digite o ISBN do Livro:"));
                double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do Livro:"));
                Livro livro = new Livro(nome, cod, preco, autor, isbn);

                //ATRIBUIR OS DADOS
                livro.setNome(nome);
                livro.setCodigo(cod);
                livro.setAutor(autor);
                livro.setIsbn(isbn);
                livro.setPreco(preco);

                //EXIBIR OS DADOS
                livro.exibirLivro();
                break;
            }
            default:{

                break;
            }
        }
    }
}

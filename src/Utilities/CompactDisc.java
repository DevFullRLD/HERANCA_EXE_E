package Utilities;

import javax.swing.*;

public class CompactDisc extends Produto{

    private String artista, gravadora = "";

    public CompactDisc(String nome, int codigo, double preco, String artista, String gravadora) {
        super(nome, codigo, preco);
        this.artista = artista;
        this.gravadora = gravadora;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public void exibirDisco(){
        JOptionPane.showMessageDialog(null, "Codigo do Disco: " + getCodigo() + "\n" +
                                                                    "Nome: " + getNome()  + "\n" +
                                                                    "Artista: " + getArtista() + "\n" +
                                                                    "Gravadora: " + getGravadora() + "\n" +
                                                                    "Preço: R$ " + getPreco());
    }
}

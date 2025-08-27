/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlayListMusicas;

/**
 *
 * @author rafaelamoreira
 */
public class Musica {
    private final String titulo;
    private final String artista;
    private final double duracao;

    public Musica(String titulo, String artista, double duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "🎵 " + titulo + " - " + artista + " (" + duracao + " min)";
    }
}


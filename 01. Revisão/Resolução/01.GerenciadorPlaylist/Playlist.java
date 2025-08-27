/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlayListMusicas;

import java.util.ArrayList;

/**
 *
 * @author rafaelamoreira
 */
public class Playlist {

    private final ArrayList<Musica> playlist;

    public Playlist() {
        this.playlist = new ArrayList();
    }

    public void adicionarMusica(String titulo, String artista, double duracao) {
        playlist.add(new Musica(titulo, artista, duracao));
        System.out.println("✅ Música adicionada à playlist!");
    }

    public void removerMusica(String titulo) {
        boolean removido = false;
        for (int i = 0; i < playlist.size(); i++) {
            if (playlist.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                playlist.remove(i);
                removido = true;
                System.out.println("🚫 Música removida da playlist.");
                break;
            }
        }
        if (!removido) {
            System.out.println("⚠️ Música não encontrada!");
        }
    }

    public void listarMusicas() {
        if (playlist.isEmpty()) {
            System.out.println("🎧 Sua playlist está vazia!");
        } else {
            System.out.println("\n🎶 Sua Playlist 🎶");
            for (Musica musica : playlist) {
                System.out.println(musica);
            }
        }
    }

    public double calcularDuracaoTotal() {
        double soma = 0.0;
        for (Musica musica : playlist) {
            soma += musica.getDuracao();
        }
        return soma;
    }

    public void exibirDuracaoTotal() {
        if (playlist.isEmpty()) {
            System.out.println("🎧 Sua playlist está vazia!");
        } else {
            System.out.println("📊 Duração total da playlist: " + calcularDuracaoTotal() + " minutos");
        }
    }
}

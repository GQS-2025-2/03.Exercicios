/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlayListMusicas;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Principal {
    public static void main(String[] args) {

        Playlist gerenciador = new Playlist();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("\n🎵 Gerenciador de Playlist 🎵");
            System.out.println("1 - Adicionar Música");
            System.out.println("2 - Remover Música");
            System.out.println("3 - Listar Playlist");
            System.out.println("4 - Exiba a duração total");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1 -> {
                    System.out.print("🎼 Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("🎤 Artista: ");
                    String artista = scanner.nextLine();
                    System.out.print("⏳ Duração (min): ");
                    double duracao = scanner.nextDouble();
                    gerenciador.adicionarMusica(titulo, artista, duracao);
                }
                
               case 2 -> {
                    System.out.print("🗑️ Digite o título da música a remover: ");
                    String tituloRemover = scanner.nextLine();
                    gerenciador.removerMusica(tituloRemover);
                }
                case 3 -> gerenciador.listarMusicas();
                
                case 4 -> gerenciador.exibirDuracaoTotal();
                case 5 -> {
                    System.out.println("🚀 Encerrando o aplicativo...");
                    scanner.close();
                }
                default -> System.out.println("⚠️ Opção inválida! Tente novamente.");
            }
        }
    }    
}

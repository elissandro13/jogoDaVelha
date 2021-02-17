/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogadores;

import java.util.Random;
import jogodavelha.Jogada;
import jogodavelha.Jogador;
import jogodavelha.Tabuleiro;

/**
 *
 * @author Aluno
 */
public class ComputadorAleatorio extends Jogador {
    private Random random = new Random();
    public ComputadorAleatorio(int jogador) {
        super(jogador);
        System.out.println("Jogador 'ComputadorAleatorio' criado!");
    }

    @Override
    public Jogada getJogada(Tabuleiro tabuleiro) {
        for (int i = 0; !this.checaTentativa(ultimaJogada, tabuleiro); i++) {
            ultimaJogada.setLinha(this.random.nextInt(3));
            ultimaJogada.setColuna(this.random.nextInt(3));
        }       

        return ultimaJogada;
    }
}
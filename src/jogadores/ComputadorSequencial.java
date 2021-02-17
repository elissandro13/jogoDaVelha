/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogadores;

import jogodavelha.Jogada;
import jogodavelha.Jogador;
import jogodavelha.Tabuleiro;

/**
 *
 * @author Aluno
 */
public class ComputadorSequencial extends Jogador {

    public ComputadorSequencial(int jogador) {
        super(jogador);
        System.out.println("Jogador 'Computador' criado!");
    }


    @Override
    public Jogada getJogada(Tabuleiro tabuleiro) {
       for (int i = 0; i < 3 && !this.checaTentativa(ultimaJogada, tabuleiro); i++) {
            ultimaJogada.setLinha(i);
            for (int j = 0; j < 3 && !this.checaTentativa(ultimaJogada, tabuleiro); j++) {
                ultimaJogada.setColuna(j);
            } 
        }
       
       return ultimaJogada;
    }
}
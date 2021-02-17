package jogadores;

import jogodavelha.Jogada;
import jogodavelha.Jogador;
import jogodavelha.Tabuleiro;

public class Elissandro extends Jogador{

    

    public Elissandro(int jogador) {
        super(jogador);
        System.out.println("Elissandro Criado!");

    }

    public Jogada getJogada(Tabuleiro tabuleiro) {
        //ataque
        if(this.getNumeroJogador() == 1){
            ultimaJogada.setColuna(1);
            ultimaJogada.setLinha(1);
        }
        //defesa
        else if(this.getNumeroJogador() == 2){

        } 
       
       return ultimaJogada;

    }
}
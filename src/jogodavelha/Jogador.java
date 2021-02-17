package jogodavelha;

public abstract class Jogador {    
    protected Jogada ultimaJogada = new Jogada();
    protected int numeroJogador;
    
    public Jogador(int numeroJogador){
        this.numeroJogador = numeroJogador;
    }

    public int getNumeroJogador() {
        return numeroJogador;
    }
        
    public abstract Jogada getJogada(Tabuleiro tabuleiro);

    public boolean checaTentativa(Jogada tentativa, Tabuleiro tabuleiro){
        if(tabuleiro.getPosicao(tentativa) == 0)
            return true;
        else
            return false;
            
    }
    
}

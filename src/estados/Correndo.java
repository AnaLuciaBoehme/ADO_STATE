package estados;

import modelo.Personagem;

public class Correndo implements EstadoPersonagem {
    private Personagem personagem;

    public Correndo(Personagem personagem) {
        this.personagem = personagem;
    }

    @Override
    public void esperar() {
        personagem.setEstado(new Esperando(personagem));
        System.out.println("O personagem para para esperar.");
    }

    @Override
    public void correr() {
        System.out.println("O personagem já está correndo.");
    }

    @Override
    public void pular() {
        personagem.setEstado(new Pulando(personagem));
        System.out.println("O personagem pula.");
    }

    @Override
    public void abaixar() {
        System.out.println("Não há transição para abaixar a partir de correndo.");
    }
}

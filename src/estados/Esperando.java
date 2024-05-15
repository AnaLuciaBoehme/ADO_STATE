package estados;

import modelo.Personagem;

public class Esperando implements EstadoPersonagem {
    private Personagem personagem;

    public Esperando(Personagem personagem) {
        this.personagem = personagem;
    }

    @Override
    public void esperar() {
        System.out.println("O personagem já está esperando.");
    }

    @Override
    public void correr() {
        personagem.setEstado(new Correndo(personagem));
        System.out.println("O personagem começa a correr.");
    }

    @Override
    public void pular() {
        personagem.setEstado(new Pulando(personagem));
        System.out.println("O personagem pula.");
    }

    @Override
    public void abaixar() {
        System.out.println("Não há transição para abaixar a partir de esperando.");
    }
}

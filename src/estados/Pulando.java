package estados;

import modelo.Personagem;

public class Pulando implements EstadoPersonagem {
    @SuppressWarnings("unused")
	private Personagem personagem;

    public Pulando(Personagem personagem) {
        this.personagem = personagem;
    }

    @Override
    public void esperar() {
        System.out.println("O personagem não pode esperar no ar.");
    }

    @Override
    public void correr() {
        System.out.println("O personagem não pode começar a correr no ar.");
    }

    @Override
    public void pular() {
        System.out.println("O personagem já está pulando.");
    }

    @Override
    public void abaixar() {
        System.out.println("O personagem não pode abaixar no ar.");
    }
}

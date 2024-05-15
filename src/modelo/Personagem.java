package modelo;

import estados.*;

public class Personagem {
    private EstadoPersonagem estado;
    private boolean estaVivo;

    public Personagem() {
        this.estado = new Esperando(this); // Estado inicial
        this.estaVivo = true;
    }

    public void setEstado(EstadoPersonagem estado) {
        this.estado = estado;
    }

    public void esperar() {
        estado.esperar();
    }

    public void correr() {
        estado.correr();
    }

    public void pular() {
        estado.pular();
    }

    public void abaixar() {
        estado.abaixar();
    }

    public void morrer() {
        estaVivo = false;
        System.out.println("O personagem foi atingido e morreu.");
    }

    public boolean estaVivo() {
        return estaVivo;
    }

    public void verificarMorte() {
        if (!estaVivo) {
            System.out.println("O personagem está morto.");
        }
    }
}

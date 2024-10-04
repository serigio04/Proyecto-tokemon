package main.java.TipoPokemon;

/**
 * Pokemon
 */
public abstract class Pokemon {
    public int numPokedex;
    protected String nombre;
    protected double vida;
    protected double experiencia;
    protected int nivel;

    public Pokemon (int numPokedex, String nombre, double vida, double experiencia, int nivel){
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.vida = vida;
        this.experiencia = experiencia;
        this.vida = vida;
    }

// Métodos get
    public int getNumPokedex() {
        return numPokedex;
    }

    public String getNombre() {
        return nombre;
    }

    public double getVida() {
        return vida;
    }

    public double getExperiencia() {
        return experiencia;
    }

    public int getNivel() {
        return nivel;
    }

    // Métodos set
    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

}
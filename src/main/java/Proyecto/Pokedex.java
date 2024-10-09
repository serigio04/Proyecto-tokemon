package main.java.Proyecto;

public class Pokedex {
    private int numeroPokedex;
    private String nombre;
    private String descripcion;

    public Pokedex(int numeroPokedex, String nombre, String descripcion){
        this.numeroPokedex = numeroPokedex;
        this.nombre =  nombre;
        this.descripcion = descripcion;
    }

    public int getNumPokedex(){
        return numeroPokedex;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setNumPokedex(int numeroPokedex){
        this.numeroPokedex = numeroPokedex;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
}

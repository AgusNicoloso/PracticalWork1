package clases;

import interfaces.Beber;
import interfaces.Orinar;

public class Humano {

    private String Nombre;
    private Integer Edad;
    private Integer Peso;
    private Orinar Orinar;
    private Beber Beber;

    //Constructor del humano
    public Humano(String Nombre, Integer Edad, Integer Peso, Orinar Orinar, Beber Beber) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Peso = Peso;
        this.Orinar = Orinar;
        this.Beber = Beber;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    public Integer getPeso() {
        return Peso;
    }

    public void setPeso(Integer Peso) {
        this.Peso = Peso;
    }

    public String Orinar() {
        return this.Orinar.orinar();
    }

    public String Beber() {
        return this.Beber.beber();
    }

    //Muestro los datos del humano
    @Override
    public String toString() {
        return "\nNombre: " + Nombre + "\nEdad: " + Edad + "\nPeso: " + Peso;
    }

}

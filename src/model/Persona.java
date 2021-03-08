package model;

public class Persona implements Precedable<Persona> {
    String nombre;
    int dni;

    public Persona(int dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public int precedeA(Persona persona) {
        return (this.dni < persona.getDni()) ? 1 : 0;
    }

    public int getDni(){
        return dni;
    }

    public String getNombre(){
        return nombre;
    }
}

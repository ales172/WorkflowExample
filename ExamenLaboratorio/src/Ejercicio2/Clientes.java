package Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

final public class Clientes {

    private static int id;
    private int myId;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private List<Videojuego> listaJuegos = new ArrayList<>();

    public Clientes(){}

    public Clientes(String nombre, String apellido, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.myId = generarId();
    }

//region GETTERS AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Videojuego> getListaJuegos() {
        return listaJuegos;
    }

    public int getMyId() {
        return myId;
    }
    //endregion

    //region EQUALS

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clientes clientes = (Clientes) o;
        return myId == clientes.myId &&
                Objects.equals(nombre, clientes.nombre) &&
                Objects.equals(apellido, clientes.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myId, nombre, apellido);
    }


    //endregion

    private int generarId(){

        return ++id;
    }
    public void agregarJuego (Videojuego juego){

        listaJuegos.add(juego);
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }



}

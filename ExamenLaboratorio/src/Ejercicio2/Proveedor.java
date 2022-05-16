package Ejercicio2;

import java.time.LocalDateTime;
import java.util.Objects;

final public class Proveedor {

    private String nombre;
    private String apellido;
    private String horarioLlegada;

    public Proveedor(){}

    public Proveedor(String nombre, String apellido, String horarioLlegada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.horarioLlegada = horarioLlegada;
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

    public String getHorarioLlegada() {
        return horarioLlegada;
    }

    public void setHorarioLlegada(String horarioLlegada) {
        this.horarioLlegada = horarioLlegada;
    }

    //endregion

    //region EQUALS

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proveedor proveedor = (Proveedor) o;
        return Objects.equals(nombre, proveedor.nombre) &&
                Objects.equals(apellido, proveedor.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }

    //endregion

    @Override
    public String toString() {
        return "Proveedor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", horarioLlegada='" + horarioLlegada + '\'' +
                '}';
    }
}

package Ejercicio2;

import java.util.Objects;

final public class Videojuego implements Comparable<Videojuego>{

    private String nombre;
    private float precio;
    private String categoria;
    private int contador = 0;

    public Videojuego(String nombre, float precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    //region SETTERS AND GETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    //endregion


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Videojuego that = (Videojuego) o;
        return Float.compare(that.precio, precio) == 0 &&
                contador == that.contador &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(categoria, that.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio, categoria, contador);
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    @Override
    public int compareTo(Videojuego o) {
        return Integer.compare(this.contador, o.contador);
    }
}

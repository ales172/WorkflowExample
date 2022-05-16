package Ejercicio1;

final public class Empleado extends Persona {

    private int numeroDeEmpleado;

    public Empleado(String nombre, String apellido, String fechaNacimiento, int numeroDeEmpleado){

        super(nombre, apellido, fechaNacimiento);
        this.numeroDeEmpleado=numeroDeEmpleado;
    }

    //region SETTERS AND GETTERS

    public int getNumeroDeEmpleado() {
        return numeroDeEmpleado;
    }

    public void setNumeroDeEmpleado(int numeroDeEmpleado) {
        this.numeroDeEmpleado = numeroDeEmpleado;
    }

    //endregion

    @Override
    public String toString() {
        return "Empleado{" +
                "numeroDeEmpleado=" + numeroDeEmpleado +
                ", myId=" + myId +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}

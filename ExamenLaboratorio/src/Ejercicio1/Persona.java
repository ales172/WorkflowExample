package Ejercicio1;

abstract public class Persona {

    private static int id =0;
    protected int myId;
    protected String nombre;
    protected String apellido;
    protected String fechaNacimiento;

    public Persona(String nombre, String apellido, String fechaNacimiento) {

        this.myId = generateId();
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    //region SETTERS AND GETTERS

    public int getMyId() {
        return myId;
    }

    public void setMyId(int myId) {
        this.myId = myId;
    }

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


    //endregion

    private int generateId(){

        return ++id;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "myId=" + myId +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}

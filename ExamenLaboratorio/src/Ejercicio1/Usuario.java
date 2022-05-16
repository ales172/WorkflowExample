package Ejercicio1;

final public class Usuario extends Persona{

    private String email;

    public Usuario(String nombre, String apellido, String fechaNacimiento, String email) {
        super(nombre, apellido, fechaNacimiento);
        this.email = email;
    }

    //region SETTERS AND GETTERS

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //endregion



    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", myId=" + myId +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}

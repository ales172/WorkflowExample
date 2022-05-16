package Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

final public class Local implements CargaPersonas{

    private List<Clientes> listaClientes;
    private List<Proveedor> listaProveedores;
    private List<Videojuego> listaVideojuegos;

    public Local (List<Clientes> listaClientes, List<Proveedor> listaProveedores, List<Videojuego> listaVideojuegos){

        this.listaClientes =listaClientes;
        this.listaProveedores =listaProveedores;
        this.listaVideojuegos =listaVideojuegos;
    }

    @Override
    public Clientes crearCliente(){

        Scanner scn =new Scanner(System.in);
        Clientes clienteAux = new Clientes();

        System.out.println("Ingrese el nombre del cliente: ");
        scn.next(clienteAux.getNombre());
        System.out.println("Ingrese el apellido del cliente: ");
        scn.next(clienteAux.getApellido());
        System.out.println("Ingrese la fecha de nacimiento: ");
        scn.next(clienteAux.getFechaNacimiento());

        scn.close();

        return clienteAux;
    }

    @Override
    public Proveedor crearProveedor(){

        Scanner scn =new Scanner(System.in);
        Proveedor proveedorAux = new Proveedor();

        System.out.println("Ingrese el nombre del Proveedor: ");
        scn.next(proveedorAux.getNombre());
        System.out.println("Ingrese el apellido del Proveedor: ");
        scn.next(proveedorAux.getApellido());
        System.out.println("Ingrese el horario de llegada del Proveedor: ");
        scn.next(proveedorAux.getHorarioLlegada());

        scn.close();

        return proveedorAux;
    }

    @Override
    public void agregarCliente (){

        Clientes clienteAux = crearCliente();

        listaClientes.add(clienteAux);
    } //Esto es por consola

    @Override
    public void agregarProveedor(){

        Proveedor proveedorAux = crearProveedor();

        listaProveedores.add(proveedorAux);
    } //Esto es por consola

    @Override
    public void agregarClienteSimple(Clientes cliente){

        listaClientes.add(cliente);
        System.out.println("Su id es: " + cliente.getMyId());
    }

    @Override
    public void agregarProveedorSimple(Proveedor proveedor){

        listaProveedores.add(proveedor);
    }

    @Override
    public void agregarVideojuegosSimple(Videojuego videojuego){

        listaVideojuegos.add(videojuego);
    }


    public void mostrarVideojuegos(){

        for (Videojuego iterador : listaVideojuegos){

            System.out.println(iterador);
        }
    }

    public void mostrarClientes(){

        for (Clientes iterador : listaClientes){

            System.out.println(iterador);
        }
    }

    public void mostrarProveedores(){

        for (Proveedor iterador : listaProveedores){

            System.out.println(iterador);
        }
    }

    public void comprarJuego (Videojuego juego, Clientes cliente){

        if (consultoCliente(cliente)){

            cliente.agregarJuego(juego);
            juego.setContador(juego.getContador()+1);
        }
    }

    public Boolean consultoCliente (Clientes cliente){


        for (Clientes iterator : listaClientes){

            if (iterator.equals(cliente)){

                return true;
            }

        }

        return false;
    }

    public void ultimosJuegosComprados(Clientes clientes){

        List<Videojuego> listaJuegos = clientes.getListaJuegos();

        for (int i = 0; i<10; i++){

            System.out.println(listaJuegos.get(i));
        }
    }

    private Clientes encontrarClientePorID (int idCliente){

        Clientes cliente = null;

        for(Clientes iterator: listaClientes){

            if (idCliente == iterator.getMyId()){

                return iterator;
            }
        }

        return cliente;
    }



    public void mostrarClientePorId (int idCliente){

        System.out.println(encontrarClientePorID(idCliente));
    }

    public void mostrarListaVideojuegos(){
        Collections.sort(listaVideojuegos);
        System.out.println(listaVideojuegos);
    }

}

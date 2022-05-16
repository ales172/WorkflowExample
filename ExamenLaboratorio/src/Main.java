import Ejercicio1.*;
import Ejercicio2.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //EJERCICIO1
       ejercicio1();
        //EJERCICIO2
        ejercicio2();
    }

    public static void ejercicio1(){
        List<Persona> listaMixta = new ArrayList<>();

        Empleado empleado1 = new Empleado("Jose", "Lopez", "18/12/1997", 1111);
        Empleado empleado2 = new Empleado("Carlos", "Perez", "5/10/2000", 222);
        Empleado empleado3 = new Empleado("Juan", "Sanchez", "1/1/1980", 333);

        Usuario usuario1 =new Usuario("Michael", "Jackson", "7/8/1975", "michi75@gmail.com");
        Usuario usuario2 =new Usuario("Jonhy", "Bravo", "4/5/1960", "bravojon11@gmail.com");
        Usuario usuario3 =new Usuario("Bruno", "Diaz", "1/2/2000", "brunitod5@gmail.com");

        listaMixta.add(empleado1);
        listaMixta.add(empleado2);
        listaMixta.add(empleado3);

        listaMixta.add(usuario1);
        listaMixta.add(usuario2);
        listaMixta.add(usuario3);

        for (Persona iterator : listaMixta){
            System.out.println(iterator);
        }
    }

    public static void ejercicio2(){
        List<Clientes> listaClientes = new ArrayList<>();
        List<Proveedor> listaProveedores = new ArrayList<>();
        List<Videojuego> listaVideojuegos = new ArrayList<>();

        Local local = new Local(listaClientes, listaProveedores, listaVideojuegos);

        ///b) Agregar
        local.agregarClienteSimple(new Clientes("Agustin", "Battisti", "18/12/1997"));
        local.agregarClienteSimple(new Clientes("Carlos", "Perez", "5/10/2000"));
        Clientes cliente1 = new Clientes ("Juan", "Sanchez", "1/1/1980");
        local.agregarClienteSimple(cliente1);

        local.agregarProveedorSimple(new Proveedor("Michael", "Jackson", "13:45"));
        local.agregarProveedorSimple(new Proveedor("Jonhy", "Bravo", "15:00"));
        local.agregarProveedorSimple(new Proveedor("Bruno", "Diaz", "18:30"));

        local.agregarVideojuegosSimple(new Videojuego("Elder Ring", 6000, Categorias.AV));
        local.agregarVideojuegosSimple(new Videojuego("GTAV", 500, Categorias.ACC));
        local.agregarVideojuegosSimple(new Videojuego("FIFA", 5000, Categorias.DE));

        ///c) mostrar las listas
        local.mostrarClientes();
        local.mostrarProveedores();
        local.mostrarVideojuegos();

        ///d) mostarar ultimos 10 juegos
        local.ultimosJuegosComprados(cliente1);

        ///e) encontrar cliente por codigo unico
        local.mostrarClientePorId(1);

        ///f) Ordeno por cantidad de compras la lista de videojuegos
        local.mostrarListaVideojuegos();
    }
}

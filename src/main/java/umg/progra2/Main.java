package umg.progra2;

import umg.progra2.Arbol.Arbol;
import umg.progra2.ArbolCadena.ArbolCadena;
import umg.progra2.ArbolContacto.ArbolContacto;
import umg.progra2.Datos.Persona;

public class Main {
    public static void main(String[] args) {
//        ArbolCadena cadena = new ArbolCadena();
//        cadena.insertar("Lilo");
//        cadena.insertar("Lalo");
//        cadena.insertar("Lelo");
//        cadena.insertar("Lolo");
//        cadena.insertar("Lulo");
//        System.out.println("FIN!");

        ArbolContacto arbol = new ArbolContacto();

        //creear los contactos
        Persona p1 = new Persona();
        p1.setNombre("Carlos");
        p1.setNumeroTelefono(5551234);
        p1.setDireccion("Zona 1");

        Persona p2 = new Persona();
        p2.setNombre("Ana");
        p2.setNumeroTelefono(5555678);
        p2.setDireccion("Zona 2");

        Persona p3 = new Persona();
        p3.setNombre("Aaa");
        p3.setNumeroTelefono(5558765);
        p3.setDireccion("Zona 3");

        //insetar cointactos al arbol
        arbol.insertar(p1);
        arbol.insertar(p2);
        arbol.insertar(p3);

        System.out.println("Contactos ordenados por nombre:");
        arbol.inOrden();
    }
}
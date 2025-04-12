package Punto1;
/*
Juan Sebastián Londoño Ramírez
Sara Carolina Varón Correa
Estructura de Datos
Preparcial II
*/
public class Main {

    public static void main(String[] args) {
        ListaSimpleEnlazada<Integer> pila = new ListaSimpleEnlazada<>();

        pila.insertarNodo(0);
        pila.insertarNodo(117);
        pila.insertarNodo(7);
        pila.insertarNodo(3);

        System.out.println("\nLista inicial:");
        pila.mostrarLista();

        pila.eliminarNodo();

        System.out.println("Lista eliminando el primero:");
        pila.mostrarLista();

        pila = pila.invertirLista(pila);
        System.out.println("Lista invertida:");
        pila.mostrarLista();
    }
}

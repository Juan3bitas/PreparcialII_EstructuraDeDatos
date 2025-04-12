package Punto3;
/*
Juan Sebastián Londoño Ramírez
Sara Carolina Varón Correa
Estructura de Datos
Preparcial II
*/
import Punto1.NodoSimple;

public class ColaSimpleEnlazada<T extends Persona> {

    private NodoSimple<T> inicio;
    private int tamano;

    public ColaSimpleEnlazada() {
        this.inicio = null;
        this.tamano = 0;
    }

    public NodoSimple<T> getInicio() {
        return inicio;
    }

    public void setInicio(NodoSimple<T> inicio) {
        this.inicio = inicio;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public void insertarNodo(T valor) {
        //La inserción del nodo se hace al final, el nuevo nodo va hasta el final de la cola
        NodoSimple<T> nuevo = new NodoSimple<>(valor);
        if(inicio == null) {
            inicio = nuevo;
        } else {
            NodoSimple<T> actual = inicio;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
        tamano++;
    }

    public void eliminarNodo() {
        //Verifica que la cola tenga elementos y elimina la conexión con el primer nodo
        if (inicio != null) {
            inicio = inicio.getSiguiente();
            tamano--;
        }
    }

    public ColaSimpleEnlazada<Persona> colaFiltradora(ColaSimpleEnlazada<T> cola) {

        ColaSimpleEnlazada<Persona> nuevaCola = new ColaSimpleEnlazada<>();

        while (cola.getTamano() > 0) {
            Persona actual = cola.getInicio().getValor();
            cola.eliminarNodo();

            if (!(actual.getSexo().equalsIgnoreCase("hombre") && actual.getEdad() >= 30
                                                                            && actual.getEdad() <= 50)) {
                nuevaCola.insertarNodo(actual);
            }
        }

        while (nuevaCola.getTamano() > 0) {
            cola.insertarNodo((T) nuevaCola.getInicio().getValor());
            nuevaCola.eliminarNodo();
        }

        return nuevaCola;
    }

    public void mostrarLista() {
        NodoSimple<T> nodoRecorrer = inicio;
        String cadena = "";
        while (nodoRecorrer != null && nodoRecorrer.getSiguiente() != null) {
            cadena += nodoRecorrer.getValor() + " -> ";
            nodoRecorrer = nodoRecorrer.getSiguiente();
        }
        cadena += nodoRecorrer.getValor();
        System.out.println(cadena + "\n");
    }
}
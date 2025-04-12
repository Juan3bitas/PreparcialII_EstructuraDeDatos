package Punto1;
/*
Juan Sebastián Londoño Ramírez
Sara Carolina Varón Correa
Estructura de Datos
Preparcial II
*/
public class ListaSimpleEnlazada<T> {

    private NodoSimple<T> inicio;
    private int tamano;

    public ListaSimpleEnlazada() {
        this.inicio = null;
        this.tamano = 0;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public NodoSimple<T> getInicio() {
        return inicio;
    }

    public void setInicio(NodoSimple<T> inicio) {
        this.inicio = inicio;
    }

    public void insertarNodo(T valor) {
        //La lista enlazada es LIFO
        NodoSimple<T> nuevo = new NodoSimple<>(valor);
        if(inicio == null) {
            inicio = nuevo;
            tamano++;
            return;
        }
        nuevo.setSiguiente(inicio);
        inicio = nuevo;
        tamano++;
    }

    public void eliminarNodo() {

        if(inicio != null) {
            inicio = inicio.getSiguiente();
            tamano--;
        }
    }

    public ListaSimpleEnlazada<T> invertirLista(ListaSimpleEnlazada<T> lista) {
        ListaSimpleEnlazada<T> listaInvertida = new ListaSimpleEnlazada<>();
        NodoSimple<T> actual = lista.getInicio();

        while (actual != null) {
            listaInvertida.insertarNodo(actual.getValor());
            actual = actual.getSiguiente();
        }
        return listaInvertida;
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
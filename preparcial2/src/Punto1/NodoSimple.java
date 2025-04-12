package Punto1;
/*
Juan Sebastián Londoño Ramírez
Sara Carolina Varón Correa
Estructura de Datos
Preparcial II
*/
public class NodoSimple<T> {

    private T valor;
    private NodoSimple<T> siguiente;

    public NodoSimple(T valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public NodoSimple<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimple<T> siguiente) {
        this.siguiente = siguiente;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
}
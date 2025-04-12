package Punto7;
/*
Juan Sebastián Londoño Ramírez
Sara Carolina Varón Correa
Estructura de Datos
Preparcial II
*/
public class NodoGenerico<T> {
    private T valor;
    private NodoGenerico siguiente;


    public NodoGenerico(T valor) {
        this.valor = valor;
        this.siguiente = null;
    }


    public T getValor() {
        return valor;
    }


    public NodoGenerico getSiguiente() {
        return siguiente;
    }


    public void setValor(T valor) {
        this.valor = valor;
    }


    public void setSiguiente(NodoGenerico siguiente) {
        this.siguiente = siguiente;
    }
}


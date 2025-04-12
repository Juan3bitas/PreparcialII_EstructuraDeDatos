package Punto2;
/*
Juan Sebastián Londoño Ramírez
Sara Carolina Varón Correa
Estructura de Datos
Preparcial II
*/
public class NodoCola<T> {
    private T valor;
    private NodoCola<T> siguiente;


    public NodoCola(T valor) {
        this.valor = valor;
        this.siguiente = null;
    }


    public T getValor() {
        return valor;
    }


    public void setValor(T valor) {
        this.valor = valor;
    }


    public NodoCola<T> getSiguiente() {
        return siguiente;
    }


    public void setSiguiente(NodoCola<T> siguiente) {
        this.siguiente = siguiente;
    }


    @Override
    public String toString() {
        return "NodoGenericoCola{" +
                "valor=" + valor +
                ", siguiente=" + siguiente +
                '}';
    }
}
package Punto2;
/*
Juan Sebastián Londoño Ramírez
Sara Carolina Varón Correa
Estructura de Datos
Preparcial II
*/
public class NodoPila<T> {
    private T valor;
    private NodoPila<T> siguiente;


    public NodoPila(T valor) {
        this.valor = valor;
        this.siguiente = null;
    }
    public T getValor(){
        return valor;
    }
    public void setValor(T valor) {
        this.valor = valor;
    }


    public NodoPila<T> getSiguiente() {
        return siguiente;
    }


    public void setSiguiente(NodoPila<T> siguiente) {
        this.siguiente = siguiente;
    }


    @Override
    public String toString() {
        return "NodoGenericoPila{" +
                "valor=" + valor +
                ", siguiente=" + siguiente +
                '}';
    }
}
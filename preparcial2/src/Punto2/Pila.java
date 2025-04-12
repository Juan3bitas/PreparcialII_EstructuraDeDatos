package Punto2;

public class Pila<T> {
    private NodoPila<T> cima;
    private int tamano;


    public Pila(){
        this.cima = null;
        this.tamano = 0;
    }


    public boolean estaVacia() {
        return cima==null;
    }


    public void push (T dato) {
        NodoPila<T> nodo = new NodoPila<>(dato);
        nodo.setSiguiente(cima);
        cima = nodo;


        tamano++;
    }
    public T pop() {


        if(estaVacia()) {
            throw new RuntimeException("La Pila est� vac�a");
        }


        T dato = cima.getValor();
        cima = cima.getSiguiente();
        tamano--;


        return dato;
    }
    public NodoPila<T> getCima() {
        return cima;
    }
    public int getTamano() {
        return tamano;
    }
    public void imprimir() {
        NodoPila<T> aux = cima;
        while(aux!=null) {
            System.out.print(aux.getValor()+"\t");
            aux = aux.getSiguiente();
        }
        System.out.println();
    }
}
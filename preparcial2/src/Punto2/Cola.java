package Punto2;
/*
Juan Sebastián Londoño Ramírez
Sara Carolina Varón Correa
Estructura de Datos
Preparcial II
*/
public class Cola <T>{
    protected NodoCola<T> inicial;
    protected NodoCola<T>fin;
    protected int tamanio;


    public Cola() {
        inicial = fin = null;
        tamanio = 0;
    }


    public void encolar(T valor) {
        NodoCola<T> newNodo = new NodoCola<>(valor);


        if (isVacia()) {
            inicial = newNodo;
            fin = newNodo;
        } else {
            fin.setSiguiente(newNodo);
            fin = newNodo;
        }
        tamanio++;
    }


    public void desencolar() {


        if(!isVacia()) {
            inicial = inicial.getSiguiente();
            tamanio--;
        }
    }
    public T getFrenteyDesencolar() {
        if (isVacia()) {
            return null;
        } else {
            T valor = inicial.getValor();
            desencolar();
            return valor;
        }
    }




    public boolean isVacia(){
        return inicial == null;
    }


    public NodoCola<T> getInicial() {
        return inicial;
    }


    public void setInicial(NodoCola<T> inicial) {
        this.inicial = inicial;
    }


    public NodoCola<T> getFin() {
        return fin;
    }


    public void setFin(NodoCola<T> fin) {
        this.fin = fin;
    }


    public int getTamanio() {
        return tamanio;
    }


    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
}
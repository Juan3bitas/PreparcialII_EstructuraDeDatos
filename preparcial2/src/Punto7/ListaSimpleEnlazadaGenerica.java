package Punto7;
/*
Juan Sebastián Londoño Ramírez
Sara Carolina Varón Correa
Estructura de Datos
Preparcial II
*/
public class ListaSimpleEnlazadaGenerica<T>{
    private NodoGenerico<T> inicial;
    private int tamano;


    public ListaSimpleEnlazadaGenerica() {
        this.inicial = null;
        this.tamano = 0;
    }


    public void insertarFinal( T valor){
        NodoGenerico<T> nuevoNodo = new NodoGenerico<T>(valor);
        if(inicial == null){
            inicial = nuevoNodo;
            tamano++;
            return;
        }
        NodoGenerico<T> nodoRecorrer = inicial;
        while(nodoRecorrer.getSiguiente()!= null){
            nodoRecorrer = nodoRecorrer.getSiguiente();
        }
        nodoRecorrer.setSiguiente(nuevoNodo);
        tamano++;
    }


    public void mostrar(){
        NodoGenerico<T> nodoRecorrer = inicial;
        String cadena = "";
        while(nodoRecorrer!=null){
            if(nodoRecorrer.getSiguiente()!=null){
                cadena += nodoRecorrer.getValor() + " -> ";
                nodoRecorrer = nodoRecorrer.getSiguiente();
            }else{
                cadena += nodoRecorrer.getValor();
                nodoRecorrer = nodoRecorrer.getSiguiente();
            }
        }
        System.out.println(cadena);
    }


    public int calcularSuma(NodoGenerico nodo){
        if(nodo==null){
            return 0;
        }
        return (int) nodo.getValor()+calcularSuma(nodo.getSiguiente());
    }


    public void insertarDespuesDeSuma(NodoGenerico nodo, int suma){
        if(nodo==null){
            return;
        }
        if(nodo.getValor().equals(suma)){
            NodoGenerico nuevoNodo = new NodoGenerico(2);
            nuevoNodo.setSiguiente(nodo.getSiguiente());
            nodo.setSiguiente(nuevoNodo);
            tamano++;
            insertarDespuesDeSuma(nuevoNodo.getSiguiente(), suma);
        } else {
            insertarDespuesDeSuma(nodo.getSiguiente(), suma);
        }
    }


    public int getTamano() {
        return tamano;
    }


    public static void main (String[] args){
        ListaSimpleEnlazadaGenerica<Integer> lista = new ListaSimpleEnlazadaGenerica<>();
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        lista.insertarFinal(2);
        lista.insertarFinal(-6);
        lista.mostrar();


        int suma = lista.calcularSuma(lista.inicial);


        lista.insertarDespuesDeSuma(lista.inicial, suma);
        lista.mostrar();
    }


}
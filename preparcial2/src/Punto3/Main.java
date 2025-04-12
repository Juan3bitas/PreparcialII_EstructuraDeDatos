package Punto3;
/*
Juan Sebastián Londoño Ramírez
Sara Carolina Varón Correa
Estructura de Datos
Preparcial II
*/
public class Main {

    public static void main(String[] args) {
        ColaSimpleEnlazada<Persona> cola = new ColaSimpleEnlazada<>();

        Persona persona1 = new Persona("Julián",37,"hombre");
        Persona persona2 = new Persona("Adrián",29, "hombre");
        Persona persona3 = new Persona("Celeste", 17, "mujer");
        Persona persona4 = new Persona("Juan Diego", 19, "hombre");
        Persona persona5 = new Persona("Rigoberto", 50, "hombre");
        Persona persona6 = new Persona("Pilar", 48,"mujer");

        cola.insertarNodo(persona1);
        cola.insertarNodo(persona2);
        cola.insertarNodo(persona3);
        cola.insertarNodo(persona4);
        cola.insertarNodo(persona5);
        cola.insertarNodo(persona6);

        System.out.println("Lista con todas las personas");
        cola.mostrarLista();

        //Filtrar a los onvres entre 30 y 50 años
        cola.colaFiltradora(cola);

        System.out.println("Lista luego de quitar a los hombres entre 30 y 50 años");
        cola.mostrarLista();
    }
}
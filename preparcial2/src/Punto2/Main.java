package Punto2;
/*
Juan Sebastián Londoño Ramírez
Sara Carolina Varón Correa
Estructura de Datos
Preparcial II
*/
public class Main {
    public static Cola colaConPrimos(Pila pila) {
        Cola<Integer> cola = new Cola<>();
        while (!pila.estaVacia()) {
            int numero = (int) pila.pop();
            if (esPrimo(numero)) {
                cola.encolar(numero);
            }
        }
        return cola;
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        // Verifica si el número es divisible por cualquier número entre 2 y la raíz cuadrada del número
        // Si es divisible, no es primo
        // Si no es divisible por ninguno, es primo
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Pila<Integer> pila = new Pila<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        pila.push(6);
        pila.push(1);
        System.out.println("Pila:");
        pila.imprimir();
        Cola colaPrimos = colaConPrimos(pila);
        System.out.println("\nCola:");
        System.out.println(colaPrimos.isVacia());
        while(!colaPrimos.isVacia()){
            System.out.print(colaPrimos.getFrenteyDesencolar() + "\t");
        }
    }
}


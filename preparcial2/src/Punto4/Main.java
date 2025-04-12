package Punto4;
/*
Juan Sebastián Londoño Ramírez
Sara Carolina Varón Correa
Estructura de Datos
Preparcial II
*/
public class Main {
    static Pila representacionBinaria(int numero){
        Pila<Integer> pilaBinarios = new Pila<>();
        while (numero!= 0){
            pilaBinarios.push(numero%2);
            System.out.println("Numero para binario: " +numero%2);
            numero=numero/2;
            System.out.println("Numero: "+numero);
        }
        return pilaBinarios;
    }
    public static void main(String[] args) {
        Pila<Integer> pila = representacionBinaria(61);
        System.out.println("Representacion binaria:");
        pila.imprimir();
    }
}


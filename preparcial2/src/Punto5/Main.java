package Punto5;

/*
Juan Sebastián Londoño Ramírez
Sara Carolina Varón Correa
Estructura de Datos
Preparcial II
*/
public class Main {

    public static void main(String[] args) {
        VerificarBalance verificar = new VerificarBalance();
        String cadena1 = "(6-7)/]"; //Es tamal
        String cadena2 = "[(1+2)*4]+5"; //Es tamaln't | Está bien

        System.out.println("¿La cadena1 está balanceada? " + verificar.estaBalanceado(cadena1));
        System.out.println("¿La cadena2 está balanceada? " + verificar.estaBalanceado(cadena2));
    }
}
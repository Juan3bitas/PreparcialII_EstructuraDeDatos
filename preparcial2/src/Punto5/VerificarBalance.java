package Punto5;
/*
Juan Sebastián Londoño Ramírez
Sara Carolina Varón Correa
Estructura de Datos
Preparcial II
*/
import Punto1.ListaSimpleEnlazada;

public class VerificarBalance {

    public boolean estaBalanceado(String cadena) {

        ListaSimpleEnlazada<Character> pila = new ListaSimpleEnlazada<>();

        for (char c: cadena.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pila.insertarNodo(c);
            } else if (c == ')' || c == ']' || c == '}') {
                //Verifica si la pila está vacía, es decir, no tiene paréntesis, corchetes o llaves abiertas
                if (pila.getTamano() == 0) {
                    return false;
                }

                char inicio = pila.getInicio().getValor();
                pila.eliminarNodo();

                if (c == ')' && inicio != '(' || c == ']' && inicio != '[' || c == '}' && inicio != '{') {
                    return false;
                }
            }
        }
        return pila.getTamano() == 0;
    }
}
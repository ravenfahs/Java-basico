/*
* En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
* Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
* String[] nombres = {"", "", "", ""}
*/

import java.util.Arrays;

public class Cadena {
    public static void main(String[] args) {
        String [] cadena= {"hola "+"esto "+"es una cadena"};
        for (int i = 0; i < cadena.length; i++) {
            System.out.println(cadena[i]);
        }
        int i = 0;
        while (i < cadena.length) {
            System.out.println(cadena[i]);
            i++;
        }
        Arrays.stream(cadena).forEach(System.out::println);
    }
}

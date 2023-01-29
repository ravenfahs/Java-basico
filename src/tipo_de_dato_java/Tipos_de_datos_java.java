package tipo_de_dato_java;/*
Crea un proyecto de Java desde 0 Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.
Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.
*/

public class Tipos_de_datos_java {
    public static void main(String[] args) {

        //Tipos de datos
        byte dato1 = 127;
        short dato2 = 32767;
        int dato3 = 2147483647;
        long dato4 = 922337203;
        float dato5 = 0.9223372036854775808f;
        double dato6 = 0.92233720368547758089223372036854775808f;
        char dato7= 'A';
        boolean dato9 = true;
        String dato8 = "...Hola mundo, Java...";

        //Vectores
        int[] impares = new int[] {1,3,5,7,9,11};

        int[] pares;
        pares = new int[] {2,4,6,8,9,10};

        //Matriz
        int[][] matriz = new int[][] {{1,3,5},{2,4,6},{7,8,9}};

        imprimir(dato1,dato2,dato3,dato4,dato5,dato6,dato7,dato8,dato9);
        imprimirPares(pares);
        imprimaturimparts(impares);
        imprimir(matriz);
    }

    public static void imprimir(byte dato1,short dato2,int dato3,long dato4,float dato5,double dato6,char dato7,String dato8,boolean dato9) {
        System.out.println("...Tipos de Datos Primitivos...");
        System.out.println("   Tipos de Datos Numéricos y punto flotante   ");
        System.out.println("Es un Byte: "+dato1+"\n"+"Es un Short: "+dato2+"\n"+"Es un Int: "+dato3+"\n"+"Es un Long: "+dato4+"\n"+
                "Es un Float: "+dato5+"\n"+"Es un Double: "+dato6);
        System.out.println("   Tipos de Datos Caracteres   ");
        System.out.println("Es un Char: "+dato7);
        System.out.println("   Tipos de Datos boolean   ");
        System.out.println("Es un boolean: "+ dato9);
        System.out.println("...Tipos de Datos Estructurados...");
        System.out.println("Es un String: "+dato8);

    }

    public static void imprimirPares(int[] pares) {
        System.out.println("...Tipos de Datos Estructurados Array...");
        System.out.println("Números pares:");
        for (int pare : pares) {
            System.out.println(pare);
        }
    }

    public static void imprimaturimparts(int[] impares) {
        System.out.println("...Tipos de Datos Estructurados Array...");
        System.out.println("Numeros impares:");
        for (int impire : impares) {
            System.out.println(impire);
        }
    }

    public static void imprimir(int[][] matriz) {
        System.out.println("...Tipos de Datos Estructurados Matriz...");
        System.out.println("Matriz:");
        for (int[] ints : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println(ints[j]);
            }
        }
    }
}

/*
 * Para este ejercicio se crea una función que reciba los valores del precio y el IVA para su cálculo,
 * devuelve un resumen con los datos pedidos.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Iva_productos {

    static double iva;
    static double productoSinIva;

    static double productoConIva;
    /*
    * Se invocan a los métodos para leer e imprimir los datos
    * */
    public static void main(String[] args) {
        leerDatos();
        imprimir();
    }
    /*
    * Desarrollo del método para leer los datos desde teclado, sé instancia los objetos isr y br, sé maneja posibles errores
    * al ingresar los datos como letras, comas.
    * */
    private static void leerDatos() {

        System.out.println("Para calcular el Iva se puede utilizar la nomenclatura con la parte entera 30,10,12 porciento \n "
                + "o la forma decimal 0.3,0.1,0.12 estos dos valores son lo mismo en cuando a representar el valor del Iva.");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        try
        {
            System.out.println("Ingresar el valor del Producto sin IVA: ");
            productoSinIva = Double.parseDouble(br.readLine());
            System.out.print("Ingresar el valor del IVA (se puede utilizar el 19 o 0.19): ");
            iva = Double.parseDouble(br.readLine());
        }
        catch (Exception e)
        {
            System.out.println("Ops... Los datos deben ser numéricos y/o utilizar el punto (2.2)... " + e);
        }
    }
    /*
    * Método para imprimir y llamar a la función calcularIva para hacer los cálculos con dos valores de entrada para dicha
    * función y retornar el valor del producto con Iva,
    * */
    private static void imprimir() {
        System.out.println("...Resumen del Calculo del IVA...");
        if (!(iva < 1)) {
            iva=iva/100;
        }
        productoConIva = calcularIva(productoSinIva, iva);
        System.out.println("Valor del porcentaje del IVA calculado con el: "+iva*100+"%");
        System.out.println("Valor de producto con IVA: "+ productoConIva +"\n"+"Valor del producto sin IVA: "+ productoSinIva +"\n"
                +"Valor del IVA cobrado: "+(productoConIva - productoSinIva));
    }

    /*
    * Método para realizar los cálculos con iva
    * */
    private static double calcularIva(double valorProducto,double valorIva) {
        return productoConIva =valorProducto+valorProducto*valorIva;
    }
}

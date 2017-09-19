/*
 * 
 */
package guiabasica;

import java.util.*;

/**
 *
 * @author Usuario
 */
public class GuiaBasica {

    private static Scanner teclado;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        //suma();
        System.out.println("Ejercicio 14");
        ejercicio14();
        System.out.println("Ejercicio 14 bis");
        ejercicio14Bis();
        System.out.println("Ejercicio 14 bis 2");
        ejercicio14Bis2();
    }

    /**
     * 
     */
    public static void suma() {
        System.out.print("Ingrese un número: ");
        double num1 = teclado.nextDouble();
        System.out.print("Ingrese otro número: ");
        double num2 = teclado.nextDouble();
        System.out.println("La suma de los dos números es: " + (num1 + num2));
    }

    /**
     * Declara un String que contenga tu nombre, después muestra un mensaje de
     * bienvenida por consola. Por ejemplo: si introduzco “Fernando”, me
     * aparezca “Bienvenido Fernando”.
     */
    public static void ejercicio5() {
        String nombre = "Andrea";
        System.out.println("Bienvenida " + nombre);
    }

    /**
     * Modifica la aplicación anterior, para que nos pida el nombre que queremos
     * introducir por teclado.
     */
    public static void ejercicio6() {
        System.out.print("Ingresa tu nombre: ");
        String nombre = teclado.next(); // next() permite capturar String
        System.out.println("Bienvenido/a " + nombre);
    }

    /**
     * Haz una aplicación que calcule el área de un círculo (pi*R2). El radio se
     * pedirá por teclado.
     */
    public static void ejercicio7() {
        System.out.print("Ingrese el valor del radio: ");
        double radio = teclado.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);
    }

    /**
     * Lee un número por teclado y muestra por consola, el carácter al que
     * pertenece en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre
     * una a.
     */
    public static void ejercicio9() {
        System.out.print("Ingrese un número entre 0 y 127: ");
        int codigo = teclado.nextByte();
        char charCodigo = (char) codigo;
        System.out.println("El caracter correspondiente es: " + charCodigo);
    }
    
    /**
     *Modifica el ejercicio anterior, para que en lugar de pedir un número, pida 
     * un carácter (char) y muestre su código en la tabla ASCII.
     */
    public static void ejercicio10() {
        System.out.print("Ingrese un caracter: ");
        char caracter = teclado.next().charAt(0);
        int intCodigo = (int) caracter;
        System.out.println("El caracter correspondiente es: " + intCodigo);
        
    }
    
    /**
     * Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
     */
    public static void ejercicio12() {
        int i = 1;
        System.out.println("Los números del 1 al 100 son (while):");
        while(i<=100){
            System.out.println(i);
            i++;
        }
    }
    
    /**
     * Haz el mismo ejercicio anterior con un bucle for.
     */
    public static void ejercicio13() {
        System.out.println("Los números del 1 al 100 son(for):");
        for(int i=1;i<=100;i++){
            System.out.println(i);
        }
    }
    
    /**
     *Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.
     * Utiliza el bucle que desees.
     */
    public static void ejercicio14() {
        for (int i=1;i<=100;i++){
            if ((i%2==0)&&(i%3==0))
                System.out.println("El número "+i+" es divisible por 2 y 3.");
        }
    }
    
    /**
     *Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.
     * Utiliza el bucle que desees.
     * Representa una modificación (optimización?) al anterior.
     */
    public static void ejercicio14Bis() {
        for (int i=6;i<=100;i+=3){
            if (i%2==0)
                System.out.println("El número "+i+" es divisible por 2 y 3.");
        }
    }
    
    public static void ejercicio14Bis2() {
        for (int i=6;i<=100;i+=6)
            System.out.println("El número "+i+" es divisible por 2 y 3.");
    }
    
    /**
     *
     * @param a
     * @return
     */
    public int ejemploo(int a){
        return a;
    }
}

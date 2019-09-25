/*
 * ingreso por teclado
 */
package java002;

import java.util.Scanner;

/**
 *
 * @author ANDROID
 */
public class Java002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //leer datos del teclado, usando libreria scanner
        Scanner scan = new Scanner(System.in);
        // decl2arar variables float
        float a, b, r;
        System.out.print("Ingrese a: ");a = scan.nextFloat();
        // ingreso desde teclado para variable a y b
        System.out.println("Ingrese b: ");b= scan.nextFloat();
        r = a + b; System.out.println("La suma es : "+r);
        r = a - b; System.out.println("La resta es : "+r);
        r = a / b; System.out.println("La division es : "+r);
        r = a * b; System.out.println("El producto es : "+r);
        
                    
        
    }
    
}

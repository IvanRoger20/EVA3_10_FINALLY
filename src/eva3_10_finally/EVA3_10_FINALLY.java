/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_10_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_10_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Introduzca un dato en entero: ");
            int valor = sc.nextInt();
            System.out.println("El valor es: " + valor);
        }catch(InputMismatchException e) {
            e.printStackTrace();
        }finally{
            System.out.println("ESTA LINEA SIEMPRE DEBE EJECUTARSE");
        }
        System.out.println("Fin del programa");
    }
    
}

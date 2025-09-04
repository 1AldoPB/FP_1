
package eva1_9_captura;

import java.util.Scanner;// SIEMPRE NECESITO EL IMPORT  

public class EVA1_9_CAPTURA {

    public static void main(String[] args) {
        String nombre;
        int edad;
        double promedio;
        System.out.println("Introduce tu nombre completo:");
        //Captura de datos
        Scanner input = new Scanner (System.in);//CREA EL SCANNER
        nombre = input.nextLine();// Captura de texto (nextLine())
        System.out.println("El nombre es:");
        System.out.println(nombre);
        System.out.println("Introduce tu edad:");
        edad = input.nextInt();// NEXT INT ES PARA CONVERTIR A NUMERO
         System.out.println("Captura tu promedio de preparatoria");
         promedio = input.nextDouble();
    }
    
}

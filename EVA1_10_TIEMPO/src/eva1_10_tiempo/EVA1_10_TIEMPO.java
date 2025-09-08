
package eva1_10_tiempo;

import java.util.Scanner;

public class EVA1_10_TIEMPO {

    public static void main(String[] args) {
       //VELOCIDAD=DISTANCIA/TIEMPO
       double velocidad, distancia, tiempo;   
       Scanner input = new Scanner (System.in);
         System.out.println("Introduzca la distancia:");
         distancia =input.nextDouble();
         System.out.println("Introduzca el tiempo:");
         tiempo = input.nextDouble();
         //Calculo:
         velocidad = distancia / tiempo;
         System.out.print("La velocidad es:");
         System.out.print(velocidad);
         System.out.print("m/s");
    }
    
 }
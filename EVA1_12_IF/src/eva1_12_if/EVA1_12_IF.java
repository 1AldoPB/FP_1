
package eva1_12_if;

import java.util.Scanner;

public class EVA1_12_IF {

    public static void main(String[] args) {
       int calificacion;
        Scanner input = new Scanner (System.in);
       System.out.println("Introduzca la calificacion:");
       calificacion = input.nextInt();
       if(calificacion >=70){//Bloque verdadero
       System.out.println("ACREDITADO");
       }else{//bloque falso (opcional)
       System.out.println("No ACREDITADO");
       }
    }
    
}

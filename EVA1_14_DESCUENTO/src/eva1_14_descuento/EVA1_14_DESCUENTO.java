/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_descuento;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class EVA1_14_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double montoventa,montopagar;
        Scanner captu = new Scanner (System.in);
        System.out.println("Ingrese el monto de la compra por favor");
        montoventa= captu.nextDouble();
        System.out.println(montoventa);
        if(montoventa > 1000){
        montopagar= montoventa - (montoventa* 0.15);
        System.out.println("Usted debe pagar");
        System.out.println(montopagar);
        }
        
    }
    
}

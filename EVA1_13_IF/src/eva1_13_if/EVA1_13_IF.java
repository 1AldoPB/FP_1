/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nacimiento;
        Scanner input = new Scanner (System.in);
        System.out.println("Introduzca Año de nacimiento:");
        nacimiento = input.nextInt();
        if(nacimiento>=2005){
            System.out.println("SI PUEDES BEBER ALCOHOL");
            }else{
            System.out.println("NO PUEDES TOMAR ALCOHOL");
        }
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_califas;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class EVA1_20_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int cali;
        System.out.println("Introduzca su calificacion");
        cali=input.nextInt();
         if(cali>=90){
            System.out.println("A");
            }else if((cali>=80)&&(cali<=89)){
            System.out.println("B");
            }else if((cali>=70)&&(cali<=79)){
            System.out.println("C");
            }else if((cali>=60)&&(cali<=69)){
            System.out.println("D");
            }else if(cali<=59){
            System.out.println("F");
            }
    }
    
}


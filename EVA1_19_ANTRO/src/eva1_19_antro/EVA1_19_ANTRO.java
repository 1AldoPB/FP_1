/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_antro;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class EVA1_19_ANTRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        int edad;
        boolean credencial;
        System.out.println("Captura tu edasd");
        edad= input.nextInt();
        System.out.println("Tienes credencial para votar");
                credencial =input.nextBoolean();
                if((edad>=18)&& (credencial==true)){
        System.out.println("puedes entrar");
        }else{
                System.out.println("No puedes entrar");
    }
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_acceso;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class EVA1_18_ACCESO {
   final static String USUARIO = "ALDO";
    final static String PWD ="1234";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usu,contra;
        Scanner input = new Scanner (System.in);
        System.out.println("Introduzca nombre de usuario");
        usu = input.nextLine();
        System.out.println("Introduzca Contraseña");
        contra =input.nextLine();
        if(usu.equals(USUARIO)){//COMPARAR CADENAS
        System.out.println("ACCESO CONCEDIDO");
       if(contra.equals(PWD)){
           System.out.println("ACCESO CONCEDIDO");
       }else{
           System.out.println("ACCESO DENEGADO");
       }
        }else{
             System.out.println("ACCESO DENEGADO");
        }
        
        
    }
    
}
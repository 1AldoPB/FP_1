/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_if_anidado;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class EVA1_16_IF_ANIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DIA DE LA SEMANA DEL 1 AL 7
        int dia;
        Scanner input=new Scanner(System.in);
        System.out.println("captura el numero de dia del 1 al 7");
        dia=input.nextInt();
        if(dia==1){
            System.out.println("Domingo");
            }else if(dia==2){
            System.out.println("Lunes");
            }else if(dia==3){
            System.out.println("Martes");
            }else if(dia==4){
            System.out.println("Miercoles");
            }else if(dia==5){
            System.out.println("Jueves");
            }else if(dia==6){
            System.out.println("Viernes");
            }else if(dia==7){
            System.out.println("Sabado");
            }else{//opcional
            System.out.println("El numero que puso no es válido");
            }
        }
        
    }
    


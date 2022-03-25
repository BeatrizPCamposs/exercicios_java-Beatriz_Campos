/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beatriz_campos3;

import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class Beatriz_campos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        double soma = 0, num = 0;
        int cont = 0;
       
        do{
            System.out.println("Digite um número:");
            num = entrada.nextDouble(); 
            if(num >=0){
                soma = num + soma;
                cont++;
            }
        }
        while(num >=0);
        
        System.out.println("A média resultante é " +soma/cont);
    }
    
}

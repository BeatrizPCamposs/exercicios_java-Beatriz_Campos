/*
 * To change this license header, choose License Headers in  Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beatriz_campos;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @ author        2etimds
 */
public class Beatriz_campos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int result;
        int i;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro positivo:");
        num = entrada.nextInt();
        result = 0;
        i = 1;
        
        while(i<=num)
        {
            result = result+i;
            i++;
        }
        
        System.out.printf("A soma dos %s primeiros números inteiros é resultante a %s\n", num, result);
        entrada.close();
    }
    
    
}

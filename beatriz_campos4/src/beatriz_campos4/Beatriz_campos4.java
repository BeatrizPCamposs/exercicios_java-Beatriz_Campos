/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beatriz_campos4;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class Beatriz_campos4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       um();
         
    }
     public static void extensao(String a, int b){
         String[][] unidade = {
             {"dez", "zero", "", ""},
             {"onze", "um", "", "cento", "mil"},
             {"doze", "dois", "vinte", "duzentos", "dois mil"},
             {"treze", "três", "trinta", "trezentos", "três mil"},
             {"quatorze", "quatro", "quarenta", "quatrocentos", "quatro mil"},
             {"quinze", "cinco", "cinquenta", "quinhentos", "cinco mil"},
             {"dezesseis", "seis", "sessenta", "seiscentos", "seis mil"},
             {"dezessete", "sete", "setenta", "setecentos", "sete mil"},
             {"dezoito", "oito", "oitenta", "oitocentos", "oito mil"},
             {"dezenove", "nove", "noventa", "novecentos", "nove mil"}
        };
         
         System.out.println(unidade[Integer.parseInt((a))] [b]);
     }
       public static void um(){
           Scanner leitor = new Scanner(System.in);
           System.out.println("Digite um número");
           String num = leitor.nextLine();
           leitor.close();
           
           String 
       }
}
    


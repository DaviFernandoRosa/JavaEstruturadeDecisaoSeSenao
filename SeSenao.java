
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Davi
 */
public class SeSenao {
    
    
    public static void main(String[]args){
    
    //declaração de variavel
    int numero;
    String saida;
    
    //entrada de dados
    Scanner entrada = new Scanner(System.in);
    System.out.println("Informa um número: ");
    numero = entrada.nextInt();
    
    
    //Processamento de dados
    if (numero % 2 == 0){
       saida = "O número é par.";
       }
    else{
       saida = "O número é impar."; 
    }
    //saida de dados
    System.out.println(saida);
    
    
    
    }
    
}

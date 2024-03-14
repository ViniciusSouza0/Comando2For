package com.mycompany.exercicio2for;
import java.util.Scanner;
public class Exercicio2for {
public static void main(String[] args) {
    
   Scanner teclado = new Scanner(System.in); 
   
        System.out.println("Digite quantas linhas vai ter:");
        int x = teclado.nextInt();
        System.out.println("Digite um número para saber se está entre 10 e 20:");
        
        
       
        for (int i=1; i<=x; i++) {
           
        int y = teclado.nextInt();
            
        if (y >= 10 && y <=20){
                
                
        System.out.println("Está entre 10 e 20");
            
            
        } else { 
        System.out.println("Não está entre 10 e 20");
                
         
           
        } 
        }
        }
    
}

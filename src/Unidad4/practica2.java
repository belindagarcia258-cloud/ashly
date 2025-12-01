package Unidad4;

import java.util.Scanner;

public class practica2 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       float n1;
        System.out.println("Dame un numero");
        n1= leer.nextFloat();
        
         if (n1==0){
                  System.out.println("Es cero");
         }
         else{
        if (n1>=0) {
            System.out.println("Positivo");
            
        } else {
            System.out.println("Negativo");
        }
              
    }
    }
}

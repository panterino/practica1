
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Damian
 */
public class Prac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Scanner teclado=new Scanner(System.in);
          int ed;
          double p,e,imc;
          String n;
        
          
         System.out.println("Nombre: ");
         n=teclado.next();
        System.out.println("Edad: ");
        ed=teclado.nextInt();
        System.out.println("Cual es su peso ");
        p= teclado.nextDouble();
        System.out.println("Cual es tu estatura");
        e= teclado.nextDouble();
        
         imc= p/(e*e);
        System.out.println("SU IMC ES: "+imc);
        System.out.println(n);
       System.out.println(ed);



    }
    
}

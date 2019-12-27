
package proyecto.panterino;


import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        float kg,mts,imc,x;
        String nombre;
        System.out.print("Como te llamas ");
        nombre=sc.next();
        System.out.print("Cual es tu peso "+nombre+"? (Kg) ");
        kg=sc.nextFloat();
        System.out.print("Cual es tu altura "+nombre+"? (mts) ");
        mts=sc.nextFloat();
        imc=mts*mts;
        x=kg/imc;
        System.out.println("Tu indice de masa corporal "+nombre+" es: "+x);
        /*if(x<=18){
            System.out.println("Peso Bajo, Consulta un nutriologo");
        }else if(x>=18 && x<=24.9){
            System.out.println("Felicidades!! Tu peso es normal");
        }else if(x>=25 && x<=26.9){
            System.out.println("Padeces sobrepeso");
        }else if(x>=27 && x<=29.9){
            System.out.println("Obesidad nivel 1");
        }else if(x>=30 && x<=39.9){
            System.out.println("Obesidad nivel 2");
        }else if(x>=40){
            System.out.println("Obesidad nivel 3");
            
            
        }*/
    }
    
}

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame tu nombre");
        String name = teclado.next();

        System.out.println("Dame tu edad");
        int edad = teclado.nextInt();

        System.out.println("Dame tu peso");
        int peso = teclado.nextInt();

        System.out.println("Dame tu altura");
        float altura = teclado.nextFloat();

        float IMC = peso/(altura*altura);
        System.out.println("Tu IMC es: "+""+IMC);
    }
}

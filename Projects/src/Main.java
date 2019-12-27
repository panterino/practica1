import javafx.scene.layout.Pane;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);


        float height, weight, answer;
        String Name;
        int Age;

        System.out.println("Introduce tu nombre: ");
        Name = a.next();

        System.out.println("Introduce tu edad: ");
        Age = a.nextInt();

        System.out.println("Introduce  tu altura en mts ");
        height = a.nextFloat();

        System.out.println("Introduce el peso:  ");
        weight = a.nextFloat();

        answer =  weight / (height * 2);

        System.out.println(Name+" de edad "+Age+" tu IMC es: "+answer);
    }
}

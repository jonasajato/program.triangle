package program;

import entities.Triangle;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        System.out.println("Entre com as medidas do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Entre com as medidas do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        Double areaX = x.area();
        Double areaY = y.area();

        System.out.printf(("Area do triangulo X: %.2f"),  areaX);
        System.out.printf("Area do triangulo Y: %.2f", areaY);

        if ( areaX > areaY){
            System.out.println("Area X eh maior.");
        }else {
            System.out.println("Area Y eh maior.");
        }
        sc.close();
    }
}

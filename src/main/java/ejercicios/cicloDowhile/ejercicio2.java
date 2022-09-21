package ejercicios.cicloDowhile;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        do {
            System.out.println("Introduce el número 1:");
            numero1 = reader.nextInt();
            System.out.println("Introduce el número 2:");
            numero2 = reader.nextInt();
        }while(numero1!=numero2);
        System.out.println("Has terminado, los números son iguales");
    }
}

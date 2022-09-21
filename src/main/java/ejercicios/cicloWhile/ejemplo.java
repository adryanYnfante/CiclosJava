package ejercicios.cicloWhile;

import java.util.Scanner;

public class ejemplo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        while(numero <= 500)
        {
            System.out.println("Ingrese un numero ");
            numero = sc.nextInt();
        }
    }
}


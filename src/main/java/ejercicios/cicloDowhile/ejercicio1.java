package ejercicios.cicloDowhile;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numero;

        do
        {
            System.out.println("Ingrese un numero: ");
            numero = sc.nextInt();
        }
        while(numero <= 500);
    }
    }


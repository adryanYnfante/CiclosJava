package ejercicios.cicloDowhile;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        /*
         * Lo primero que tenemos que conocer es que la clase Scanner nos permite leer contenido
         * insertado por consola de una forma sencilla.
         * Lo que tenemos que hacer es crear un Scanner sobre el elemento de consola que es el
         * System.in.
         */
        Scanner reader = new Scanner(System.in);
        int contador=0;
        int suma=0;
        int A = 0;
        do {
            System.out.println("Introduce el número A:");
            /*
             * A partir de ese momento cada vez que queramos que el usuario nos de una entrada por
             * teclado, en nuestro caso un número deberemos de llamar al método .nextInt()
             */
            A = reader.nextInt();

            contador=contador+1;
            suma=suma+A;
        }while(contador<10);
        System.out.println("La suma es: "+suma);

    }
}

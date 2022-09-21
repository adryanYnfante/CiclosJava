package ejercicios.cicloDowhile;

public class ejercicio1 {
    public static void main(String args[])
    {
        int i=20;
        System.out.println("Inico del bucle");
        do
        {
            i++;
            System.out.println("Valor: " + i);
        }while (i <= 10);
        System.out.println("Fin bucle");
    }

    //una variable con valor superior a la condición del bucle y podremos comprobar
    // que primero entra en el bucle y después evalua el valor de la variable creada.
}

package ejercicios.cicloFor;

public class ejemplo {
    public static void main(String args[])
    {
        System.out.println("Inicio del bucle");
        System.out.println("Números");
        for (int i=0; i<20;i++)
        {
            if (i%2==0)
            {
                System.out.println("Valor: " + i);
            }
        }
        System.out.println("Fin programa");
    }
}

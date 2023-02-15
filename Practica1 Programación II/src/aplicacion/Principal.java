package aplicacion;
import java.util.Scanner;
import mates.Matematicas;

public class Principal{
    public static long pasos;
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Introduce un numero de puntos: ");
         pasos = sc.nextLong();
         sc.close();
         System.out.println("El número PI es: " + Matematicas.generarNumeroPi(pasos));
    }


}
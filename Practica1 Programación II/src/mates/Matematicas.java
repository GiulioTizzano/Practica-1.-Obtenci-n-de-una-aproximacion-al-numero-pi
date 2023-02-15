package mates;
import aplicacion.Principal;
import java.lang.Math;


public class Matematicas{
    // Defino todas las variables estáticas que necesito
    static double aciertos = 0;
    static long maximo = 1;
    static long minimo = -1;
    static long puntosTotales = Principal.pasos;


    public static double generarNumeroPi(long pasos){
        // Luego procedo a aplicar el pseudocódigo de la tarea
        for(int i = 1; i <= puntosTotales; i++){
            // Hay que generar puntos aleatorios para el par ordenado (x,y) con x e y entre -1 y 1 por lo tanto
            // usamos el método random de la clase Math
            double x = Math.random() * (maximo - minimo) + minimo;
            double y = Math.random() * (maximo - minimo) + minimo;

            // Ahora hay que verificar que la distancia entre el oridgen (0,0) y el punto (x,y) sea estrictamente igual o menor
            // que uno.

            // Aquí uso la formula de la distancia entre dos puntos en el plano cartesiano para verificar que se cumpla la condición
            // En la clase java.lang.Math hay un método Math.pow() que acepta como parámetros la base y el exponente.
            if(Math.pow(x, 2) + Math.pow(y, 2) <= 1){
                aciertos += 1;
            }
        }
        return 4 * (aciertos / (double) puntosTotales);

    }
    
}
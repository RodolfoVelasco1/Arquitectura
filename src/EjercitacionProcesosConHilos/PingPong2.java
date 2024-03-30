package EjercitacionProcesosConHilos;
import static java.lang.Thread.sleep;

public class PingPong2 implements Runnable { // Definimos la clase PingPong2 que implementa la interfaz Runnable
    private String word; // Atributo privado para almacenar el mensaje a imprimir
    private int delay; // Atributo privado para almacenar el tiempo de espera entre impresiones
    public PingPong2 (String queDecir, int cadaCuantosMs){ // El constructor recibe el mensaje y el tiempo de espera como argumentos
        word = queDecir; // Inicializa la variable word con la palabra proporcionada
        delay = cadaCuantosMs; // Inicializa la variable delay con el tiempo entre escrituras proporcionado
    };

    public void run(){  // Sobreescribimos el método run() de la interfaz Runnable
        while(true){ // Bucle infinito para imprimir repetidamente la palabra
            System.out.print(word + " "); // Imprime la palabra seguida de un espacio en la misma línea
            try{
                sleep(delay); // El hilo se suspende durante el tiempo especificado en la variable delay
            } catch(InterruptedException e){ // Captura la excepción InterruptedException, si ocurre dicha interrupción
                return; // Si se produce una interrupción, el hilo sale del bucle y termina su ejecución
            }
        }
    }

}


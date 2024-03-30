package EjercitacionProcesosConHilos; // Paquete al que pertenece la clase

public class PingPong extends Thread{ // Se declara la clase PingPong que hereda de la clase Thread

    private String word; // Atributo privado para almacenar el mensaje a imprimir
    private int delay; // Atributo privado para almacenar el tiempo de espera entre impresiones

    public PingPong(String queDecir, int cadaCuantosMs){  // El constructor recibe el mensaje y el tiempo de espera como argumentos
        word = queDecir; // Inicializa la variable word con la palabra proporcionada
        delay = cadaCuantosMs; // Inicializa la variable delay con el tiempo entre escrituras proporcionado
    };

    public void run(){  // Sobreescribimos el método run() de la clase Thread
        while(true){ // Bucle infinito para imprimir repetidamente la palabra
            System.out.print(word + " "); // Imprime la palabra seguida de un espacio en la misma línea
            try{
                sleep(delay); // El hilo se suspende durante el tiempo especificado en la variable delay
            } catch(InterruptedException e){ // Captura la excepción InterruptedException, si ocurre dicha interrupción
                return; // Si se produce una interrupción, el hilo sale del bucle y termina su ejecución
            }
        }
    }

    public static void main(String[] args){ // Método main que se ejecuta al iniciar el programa

        System.out.println("-------------Creación de un Thread por herencia-------------"); // Imprimimos el título de este ejemplo:

        // Declaramos dos objetos PingPong con diferentes mensajes y tiempos de espera
        PingPong t1 = new PingPong("PING", 30);
        PingPong t2 = new PingPong("PONG", 10);

        // Se activan los dos threads mediante el método start()
        t1.start();
        t2.start();

        try{
            sleep(5000); // Son el método sleep() logramos que haya una espera de 5000 milisegundos en este caso.
        }catch (InterruptedException e){} // Captura la excepción InterruptedException, si ocurre dicha interrupción

        // Se finaliza la ejecución de los threads con el método stop()
        t1.stop();
        t2.stop();
    }

}

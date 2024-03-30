package EjercitacionProcesosConHilos;

public class PruebaRunnable { // Definimos la clase PruebaRunnable

    public static void main(String[] args) { // Método main que se ejecuta al iniciar el programa

        System.out.println("-------------Creación de Thread a través de la interfaz Runnable-------------"); // Imprimimos el título de este ejemplo:

        // Declaramos dos objetos PingPong con diferentes mensajes y tiempos de espera
        PingPong2 r1 = new PingPong2("PING", 33);
        PingPong2 r2 = new PingPong2("PONG", 10);

        //Creamos dos objetos Thread (t1 y t2) los cuales reciben los objetos PingPong como argumentos.
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        // Ejecutamos los dos threads con el método start().
        t1.start();
        t2.start();
    }
}

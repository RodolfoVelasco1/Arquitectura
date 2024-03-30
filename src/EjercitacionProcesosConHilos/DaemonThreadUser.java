package EjercitacionProcesosConHilos;

public class DaemonThreadUser  implements Runnable {


    public void run() { // Implementación del método run()

        System.out.println("Comienza run()"); // Imprimimos un mensaje al iniciar el método run()

        try { // Bucle infinito que se ejecuta hasta que se interrumpa el thread
            while (true) {
                try {
                    Thread.sleep(500); // Se espera 500 milisegundos
                }
                catch (InterruptedException e) { // Captura de la InterruptedException si se interrumpe la espera
                }
                System.out.println("run() ha despertado"); // Impresión de un mensaje que indica que el thread ha despertado
            }
        }

        finally { // Bloque finally que se ejecuta siempre, incluso si se produce una excepción

            System.out.println("Termina run()"); // Imprimimos un mensaje al finalizar el método run()
        }
    }
    public static void main(String[] args) { // Método main que se ejecuta al iniciar el programa
        System.out.println("Comienza main()"); // Imprimimos de un mensaje al iniciar el método main()
        Thread t = new Thread(new DaemonThread()); // Se crea un nuevo thread con la instancia actual como Runnable


        t.setDaemon(true); // Se marca el thread como daemon

        try {
            Thread.sleep(2000); // Se espera 2 segundos
        }
        catch (InterruptedException e) { // Captura de la InterruptedException si se interrumpe la espera
        }
        System.out.println("Termina main()"); // Imprimimos un mensaje al finalizar el método main()
    }
}

package EjercitacionProcesosConHilos;

public class MiThread extends Thread {

    // Método `run()` que define la tarea a ejecutar en el Thread
    public void run() {
        // Bucle infinito que se ejecuta hasta que el Thread sea interrumpido
        while (true) {
            System.out.println("Ejecuto"); // Imprime un mensaje indicando que el Thread está activo
            try {
                // Duerme el Thread durante 100 milisegundos
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // Si se produce una interrupción, se imprime un mensaje y se finaliza el Thread
                System.out.println("Termino en sleep");
                return;
            }
        }
    }
}

package EjercitacionProcesosConHilos;

public class MiThread2 extends Thread {

    // Método `run()` que define la tarea a ejecutar en el Thread
    public void run() {
        // Bucle que se ejecuta mientras el Thread no haya sido interrumpido
        while (!Thread.interrupted()) {
            System.out.println("Ejecuto"); // Imprime un mensaje indicando que el Thread está activo
        }
        // Imprime un mensaje cuando el Thread es interrumpido
        System.out.println("Termino");
        // Finaliza el Thread
        return;
    }
}

package EjercitacionProcesosConHilos;

public class InterruptCheck {

    // Método `main` que demuestra el comportamiento de t.isInterrupted()
    public static void main(String[] args) {
        // Obtiene el Thread actual (el Thread principal) y lo almacena en la variable 't'
        Thread t = Thread.currentThread();

        // Imprime el estado de interrupción inicial del Thread actual
        System.out.println("A: t.isInterrupted()=" + t.isInterrupted()); // False

        // Interrumpe el Thread actual
        t.interrupt();

        // Comprueba nuevamente el estado de interrupción (sigue siendo interrumpido)
        System.out.println("B: t.isInterrupted()=" + t.isInterrupted()); // True

        // Comprueba nuevamente el estado de interrupción (sigue siendo interrumpido)
        System.out.println("C: t.isInterrupted()=" + t.isInterrupted()); // True

        // Intenta dormir el Thread actual durante 2 segundos
        try {
            Thread.sleep(2000); // Lanzará InterruptedException porque el Thread está interrumpido
            System.out.println("No ha sido interrumpida"); // No se imprime
        } catch (InterruptedException e) {
            System.out.println("Si ha sido interrumpida"); // Se imprime
        }

        // Comprueba el estado de interrupción nuevamente (sigue siendo interrumpido)
        System.out.println("D: t.isInterrupted()=" + t.isInterrupted()); // True
    }
}

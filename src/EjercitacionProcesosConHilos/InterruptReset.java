package EjercitacionProcesosConHilos;

public class InterruptReset {

    // Método `main` que demuestra el comportamiento de Thread.interrupted()
    public static void main(String[] args) {
        // Obtiene el Thread actual (el Thread principal) y lo almacena en la variable 't'
        Thread t = Thread.currentThread();

        // Imprime el estado de interrupción inicial del Thread actual
        System.out.println("A: Thread.interrupted()=" + Thread.interrupted()); // False

        // Interrumpe el Thread actual
        t.interrupt();

        // Comprueba nuevamente el estado de interrupción (sigue siendo interrumpido)
        System.out.println("B: Thread.interrupted()=" + Thread.interrupted()); // True

        // Comprueba nuevamente el estado de interrupción (se limpia la bandera)
        System.out.println("C: Thread.interrupted()=" + Thread.interrupted()); // False

        // Intenta dormir el Thread actual durante 2 segundos
        try {
            Thread.sleep(2000);
            System.out.println("No ha sido interrumpida"); // No se imprime si ocurre la interrupción
        } catch (InterruptedException e) {
            System.out.println("Si ha sido interrumpida"); // Se imprime si ocurre la interrupción
        }

        // Comprueba el estado de interrupción usando isInterrupted()
        System.out.println("D: t.isInterrupted()=" + t.isInterrupted()); // False (la bandera se limpió)
    }
}

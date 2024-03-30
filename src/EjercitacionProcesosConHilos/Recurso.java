package EjercitacionProcesosConHilos;

public class Recurso {

    // Método estático sincronizado que define cómo se usa el recurso
    static synchronized void uso() {
        // Obtiene el Thread actual
        Thread t = Thread.currentThread();

        // Imprime el nombre del Thread actual
        System.out.println("Soy " + t.getName());
    }
}
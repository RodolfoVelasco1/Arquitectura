package EjercitacionProcesosConHilos;

public class SimplePriorities extends Thread {

    // Variable para llevar la cuenta atrás
    private int countDown = 5;

    // Variable para realizar cálculos, marcada como volatile para evitar optimizaciones indeseadas
    private volatile double d = 0; // No optimization

    // Constructor que establece la prioridad del Thread y lo inicia
    public SimplePriorities(int priority) {
        setPriority(priority); // Establece la prioridad del Thread
        start(); // Inicia el Thread
    }

    // Sobrescribe el método toString para mostrar información del Thread
    public String toString() {
        return super.toString() + ": " + countDown; // Retorna información del Thread y la cuenta atrás
    }

    // Método run() que contiene la lógica del Thread
    public void run() {
        while (true) { // Bucle infinito
            // Operación costosa e interruptible:
            for (int i = 1; i < 100000; i++) {
                d = d + (Math.PI + Math.E) / (double) i; // Cálculo repetitivo
            }
            // Imprime información del Thread
            System.out.println(this);
            // Bloque sincronizado:
            synchronized (this) {
                if (--countDown == 0) { // Decrementa la cuenta atrás y finaliza el Thread si llega a 0
                    return;
                }
            }
        }
    }

    // Método main() que inicia los Threads
    public static void main(String[] args) {
        new SimplePriorities(Thread.MAX_PRIORITY); // Crea un Thread con prioridad máxima
        for (int i = 0; i < 5; i++) {
            new SimplePriorities(Thread.MIN_PRIORITY); // Crea 5 Threads con prioridad mínima
        }
    }
}

package EjercitacionProcesosConHilos;

public class SleepInterrupt implements Runnable {

    // Método run() que define la tarea a ejecutar en el Thread
    public void run() {
        try {
            System.out.println("in run(): me duermo 20 s");
            Thread.sleep(20000); // Intenta dormir 20 segundos
            System.out.println("in run(): me despierto");
        } catch (InterruptedException e) {
            System.out.println("in run(): interrumpida en sleep");
            return; // Finaliza el Thread si se interrumpe
        }
        System.out.println("in run(): fin normal");
    }

    // Método main() que crea e inicia el Thread
    public static void main(String[] args) {
        SleepInterrupt si = new SleepInterrupt(); // Crea un objeto SleepInterrupt
        Thread t = new Thread(si); // Crea un Thread con la tarea definida en SleepInterrupt
        t.start(); // Inicia el Thread

        try {
            Thread.sleep(1000); // Espera 1 segundo en el Thread principal
        } catch (InterruptedException e) {
        }

        System.out.println("in main(): Interrumpo a t");
        t.interrupt(); // Interrumpe el Thread t
        System.out.println("in main(): termina");
    }
}


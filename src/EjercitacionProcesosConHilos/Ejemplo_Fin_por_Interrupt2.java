package EjercitacionProcesosConHilos;

public class Ejemplo_Fin_por_Interrupt2 {

    // Método `main` que crea e inicia un Thread
    public static void main(String[] args) {
        // Crea un nuevo Thread llamado "elThread"
        Thread elThread = new MiThread2();
        // Inicia el Thread "elThread"
        elThread.start();

        try {
            // Duerme el Thread principal durante 1 segundo
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // Ignora la excepción InterruptedException
        }

        // Interrumpe el Thread "elThread"
        elThread.interrupt();
    }
}


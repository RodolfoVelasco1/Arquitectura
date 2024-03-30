package EjercitacionProcesosConHilos;

public class Cliente extends Thread {

    // Método `run()` que define la tarea a ejecutar en el Thread
    public void run() {
        // Usa el recurso llamando al método `uso()` de la clase `Recurso`
        Recurso.uso();

        // Duerme el Thread durante 2 segundos
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }
}



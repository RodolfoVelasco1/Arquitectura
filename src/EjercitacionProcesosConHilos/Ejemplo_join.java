package EjercitacionProcesosConHilos;

class Ejemplo_join {

    // Método `main` que muestra el uso de `join()` para esperar a que termine un Thread
    public static void main(String[] args) {
        // Crea un nuevo Thread de tipo `Obrera` y lo llama `agente`
        Obrera agente = new Obrera();
        // Inicia el Thread `agente`
        agente.start();

        // Hace algo durante el tiempo que tarda el cálculo del Thread `agente`
        try {
            // Simula una tarea que se ejecuta mientras el Thread 'agente' calcula
            System.out.println("Realizando otras tareas mientras 'agente' calcula...");
            Thread.sleep(5000); // Duerme 5 segundos para simular una tarea
        } catch (InterruptedException e) {
            // Ignora la excepción InterruptedException
        }

        // Espera a que el Thread `agente` termine su ejecución
        try {
            agente.join();
        } catch (InterruptedException e) {
            // Ignora la excepción InterruptedException
        }

        // Usa el resultado del cálculo del Thread `agente`
        System.out.println("Resultado del cálculo: " + agente.getResultado());
    }
}


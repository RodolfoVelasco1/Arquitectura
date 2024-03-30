package EjercitacionProcesosConHilos;

public class Ejemplo_isAlive {

    // Método `main` que muestra el uso de `isAlive()` para esperar a que termine un Thread
    public static void main(String[] args) {
        // Crea un nuevo Thread de tipo `Obrera` y lo llama `agente`
        Obrera agente = new Obrera();
        // Inicia el Thread `agente`
        agente.start();

        // Hace algo durante el tiempo que tarda el cálculo del Thread `agente`
        // ... (Aquí se puede poner código que se ejecuta mientras el Thread 'agente' calcula)

        // Espera a que el Thread `agente` termine su ejecución
        while (agente.isAlive()) {
            // Se cede el paso a otros Threads mientras se espera
            Thread.yield();
        }

        // Usa el resultado del cálculo del Thread `agente`
        System.out.println("Resultado del cálculo: " + agente.getResultado());
    }
}
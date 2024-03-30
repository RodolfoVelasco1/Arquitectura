package EjercitacionProcesosConHilos;

public class Main {

    // Método `main` que crea e inicia dos Threads
    public static void main(String[] args) {
        // Crea un nuevo Thread de tipo `Cliente` y lo llama `juan`
        Cliente juan = new Cliente();
        // Establece el nombre del Thread `juan`
        juan.setName("Juan López");

        // Crea un nuevo Thread de tipo `Cliente` y lo llama `ines`
        Cliente ines = new Cliente();
        // Establece el nombre del Thread `ines`
        ines.setName("Inés García");

        // Inicia el Thread `juan`
        juan.start();

        // Inicia el Thread `ines`
        ines.start();
    }
}
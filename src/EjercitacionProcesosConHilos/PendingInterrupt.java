package EjercitacionProcesosConHilos;

public class PendingInterrupt {

    public static void main(String[] args) {

        // Si se recibe un argumento, se interrumpe el Thread actual
        if (args.length > 0) {
            Thread.currentThread().interrupt();
        }

        // Se guarda el tiempo inicial
        long tiempoInicial = System.currentTimeMillis();

        try {

            // Se intenta dormir el Thread durante 2 segundos
            Thread.sleep(2000);

            // Si no se interrumpe, se imprime un mensaje
            System.out.println("No es interrumpida");

        } catch (InterruptedException e) {

            // Si se interrumpe, se imprime un mensaje diferente
            System.out.println("Es interrumpida");

        }

        // Se calcula el tiempo gastado
        System.out.println("Tiempo gastado: " +
                (System.currentTimeMillis() - tiempoInicial));
    }
}

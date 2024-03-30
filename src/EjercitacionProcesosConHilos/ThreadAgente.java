package EjercitacionProcesosConHilos;


public class ThreadAgente { // Definimos la clase ThreadAgente
    public static void operacionCostosa() { // Definimos el método operacionCostosa()
        System.out.println("Se realiza operación costosa."); // El método imprime un mensaje.
    }

    static public void main(String[] args) { // Método main que se ejecuta al iniciar el programa
        System.out.println("-------------Delegación en una operación costosa en un thread-------------"); // Imprimimos el título de este ejemplo:

        new Thread( // Lanzamos la ejecución operación costosa en un thread anónimo concurrente
                new Runnable() {

                    public void run() { // Implementamos el método run()
                        operacionCostosa();
                    }
                }
        ).start(); // El thread principal ejecuta concurrentemente otra tarea de interés


    }
}

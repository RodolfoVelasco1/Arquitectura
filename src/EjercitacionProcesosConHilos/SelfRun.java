package EjercitacionProcesosConHilos;

public class SelfRun implements Runnable{ // Definimos la clase SelfRun que implementa la interfaz Runnable
    private Thread internalThread; // Atributo para almacenar el thread interno
    private boolean noStopRequired; // Atributo para indicar si se debe detener el thread
    public SelfRun(){ // Se crea un Constructor
        System.out.println("Comienza ejecución"); // Se imprime un mensaje al iniciar la ejecución
        noStopRequired=true; // Se establece la bandera de no detener a true
        internalThread=new Thread(this);  // Se crea un nuevo thread con la instancia actual como Runnable
        internalThread.start(); // Se inicia el thread
    }

    public void run(){ // Implementamos el método run()
        while(noStopRequired){ // Bucle infinito que se ejecuta mientras no debamos detener el thread
            System.out.println("En ejecución"); // Imprimimos un mensaje
            try{
                Thread.sleep(500); // Se espera 500 milisegundos
            }
            catch (InterruptedException e){ // Capturamos una InterruptedException si se interrumpe la espera
                Thread.currentThread().interrupt(); // Se interrumpe el thread actual
            }
        }
    }
    public void stopRequest(){ // Método para solicitar la detención del thread
        noStopRequired=false; // Se establece la bandera de no detener a false
        internalThread.interrupt(); // Se interrumpe el thread interno
    }

    public static void main(String[] args) { // Método main que se ejecuta al iniciar el programa


        SelfRun objActivo=new SelfRun(); // Creamos una instancia de SelfRun
        // Espera durante 2 segundos
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){};
        System.out.println("main invoca stopRequest()");
        objActivo.stopRequest(); // Se invoca el método stopRequest() para detener el objeto activo
    }
}

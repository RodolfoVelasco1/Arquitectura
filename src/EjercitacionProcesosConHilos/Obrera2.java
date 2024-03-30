package EjercitacionProcesosConHilos;

public class Obrera2 extends Thread {

    // Atributo privado que guarda el resultado del cálculo
    private String resultado = "No calculado";

    // Método `run()` que define la tarea a ejecutar en el Thread
    public void run() {
        // Calcula el resultado y lo guarda en la variable 'resultado'
        resultado = calcula();
    }

    // Método privado que realiza un cálculo largo
    private String calcula() {
        // Simula un cálculo largo durmiendo el Thread durante 10 segundos
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }

        // Devuelve el resultado del cálculo
        return "Ya calculado";
    }

    // Método público que devuelve el resultado del cálculo
    public String getResultado() {
        // Devuelve el valor actual de la variable 'resultado'
        return resultado;
    }
}



package EjSincronizacionNoObligatorio;

import java.util.concurrent.*;

public class Cafeteria {
    private static final int NUM_MESAS = 5;
    private static final int NUM_CLIENTES = 15;

    public static void main(String[] args) {
        Semaphore mesas = new Semaphore(NUM_MESAS);

        for (int i = 1; i <= NUM_CLIENTES; i++) {
            new Thread(new Cliente(i, mesas), "Cliente " + i).start();
        }
    }

    static class Cliente implements Runnable {
        private final int id;
        private final Semaphore mesas;

        Cliente(int id, Semaphore mesas) {
            this.id = id;
            this.mesas = mesas;
        }

        @Override
        public void run() {
            try {
                mesas.acquire();
                System.out.println("El " + Thread.currentThread().getName() + " se ha sentado en una mesa.");
                // Simular el tiempo que tarda el cliente en comer
                Thread.sleep((long) (Math.random() * 10000));
                System.out.println("El " + Thread.currentThread().getName() + " ha terminado de comer y se va.");
                mesas.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

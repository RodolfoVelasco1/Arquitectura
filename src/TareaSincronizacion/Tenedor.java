package TareaSincronizacion;

public class Tenedor {

    private boolean disponible;

    public Tenedor() {
        this.disponible = true;
    }

    public synchronized void tomar() {
        while (!disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        disponible = false;
    }

    public synchronized void soltar() {
        disponible = true;
        notifyAll();
    }
}

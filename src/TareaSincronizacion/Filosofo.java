package TareaSincronizacion;

public class Filosofo implements Runnable {

    private int id;
    private Tenedor tenedorIzquierdo;
    private Tenedor tenedorDerecho;

    public Filosofo(int id, Tenedor tenedorIzquierdo, Tenedor tenedorDerecho) {
        this.id = id;
        this.tenedorIzquierdo = tenedorIzquierdo;
        this.tenedorDerecho = tenedorDerecho;
    }

    @Override
    public void run() {
        while (true) {
            pensar();
            tomarTenedores();
            comer();
            soltarTenedores();
        }
    }

    private void pensar() {
        System.out.println("Filosofo " + id + " está pensando");
        try {
            int sleepTime = (int) (Math.random() * (5000 - 1000 + 1) + 1000);
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void tomarTenedores() {
        synchronized (tenedorIzquierdo) {
            System.out.println("Filosofo " + id + " toma tenedor izquierdo");
            synchronized (tenedorDerecho) {
                System.out.println("Filosofo " + id + " toma tenedor derecho");
            }
        }
    }

    private void comer() {
        System.out.println("Filosofo " + id + " está comiendo");
        try {
            int sleepTime = (int) (Math.random() * (5000 - 1000 + 1) + 1000);
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void soltarTenedores() {
        synchronized (tenedorDerecho) {
            System.out.println("Filosofo " + id + " suelta tenedor derecho");
        }
        synchronized (tenedorIzquierdo) {
            System.out.println("Filosofo " + id + " suelta tenedor izquierdo");
        }
    }
}

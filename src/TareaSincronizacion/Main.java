package TareaSincronizacion;

public class Main {

    public static void main(String[] args) {
        int n = 5; // Número de filósofos
        Tenedor[] tenedores = new Tenedor[n];
        for (int i = 0; i < n; i++) {
            tenedores[i] = new Tenedor();
        }

        Filosofo[] filosofos = new Filosofo[n];
        for (int i = 0; i < n; i++) {
            filosofos[i] = new Filosofo(i + 1, tenedores[i], tenedores[(i + 1) % n]);
            new Thread(filosofos[i]).start();
        }
    }
}

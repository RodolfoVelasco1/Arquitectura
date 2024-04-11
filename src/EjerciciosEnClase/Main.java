package EjerciciosEnClase;

public class Main {

    //TRABAJANDO CON CLASE HILO

    public static void main(String[] args) {
        Hilo[]hilos = new Hilo[10];
        for(int i = 0; i < hilos.length; i++){
            hilos[i] = new Hilo("Hilo" + i, i);
            hilos[i].start();
        }

        System.out.println(Hilo.cont);

        //TRABAJANDO CON CLASES CONTADOR, HILOA E HILOB

        Contador cont = new Contador(100);
        HiloA a = new HiloA("HiloA", cont);
        HiloB b = new HiloB("HiloB", cont);
        a.start();
        b.start();

        //TRABAJANDO CON CLASES CONTADOR, HILOA2 E HILO2B

        Contador cont2 = new Contador(100);
        HiloA2 a2 = new HiloA2("HiloA2", cont2);
        HiloB2 b2 = new HiloB2("HiloB2", cont2);
        a2.start();
        b2.start();

    }

}

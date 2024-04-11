package EjerciciosEnClase;

public class HiloA2 extends Thread{
    private Contador contador;
    public HiloA2(String n, Contador c){
        setName(n);
        contador = c;
    }
    public void run(){
        synchronized (contador){
            for(int j = 0; j < 300; j++){
                contador.incrementa();
                try {
                    sleep(100);
                } catch(InterruptedException e){}
            }
            System.out.println(getName() + " contador vale " + contador.getValor());
        }

    }
}

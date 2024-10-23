package CuartoEjemplo;

class Contador{
    private int contador = 0;

    public synchronized void incrementar(){
        contador ++;
        System.out.println("contador "+this.contador);
        if (this.contador == 4){
            System.out.println("Hilo 1 terminado");
        }
    }
}

public class HiloMain {
    public static void main(String[] args) {

        Contador contador = new Contador();

        Thread hilo1 = new Thread(() -> {
           for (int i = 0; i <=5; i ++){
               System.out.println("Hilo 1: " + i);
               contador.incrementar();
               try {
                    Thread.sleep(1000);
               } catch (InterruptedException e){
                   System.out.println("Error " + e.getMessage());
               }
           }
        });

        Thread hilo2 = new Thread(() -> {
            for (int i = 6; i <=10; i ++){
                System.out.println("Hilo 2: " + i);
                contador.incrementar();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    System.out.println("Error " + e.getMessage());
                }
            }
        });
        hilo1.start();
        hilo2.start();
    }
}

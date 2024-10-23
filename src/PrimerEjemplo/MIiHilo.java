package PrimerEjemplo;

public class MIiHilo extends Thread{

    public void run() {
        int i;
        for ( i = 1; i <= 5; i++);{

            System.out.println("Hilo: " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println("Error" + e.getMessage());
            }
        }
    }
}

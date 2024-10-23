package TercerEjemplo;

public class HiloMain {
    public static void main(String[] args) {

        Thread hilo1 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hilo " + i);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Error" + e.getMessage());
                }
            }
        });
        Thread hilo2 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hilo " + i);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Error" + e.getMessage());
                }
            }
        });

        hilo1.start();
        hilo2.start();

        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

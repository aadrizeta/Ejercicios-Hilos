package SegundoEjemplo;

public class MiRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <=5; i++) {
            System.out.println("Running " + i);
            try {
                Thread.sleep(1000);

            } catch (Exception e){
                System.out.println("Error" + e.getMessage());
            }
        }
    }
}

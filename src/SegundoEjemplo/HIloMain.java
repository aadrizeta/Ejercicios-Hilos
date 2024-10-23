package SegundoEjemplo;

public class HIloMain {
    public static void main(String[] args) {
        MiRunnable mr = new MiRunnable();
        Thread hilo = new Thread(mr);
        hilo.start();

    }
}

package Ejercicios;

/*Crear dos hilos en JAVA. El primer hilo debe de contar del 1 al 5.
El segundo hilo debe de contar del 6 al 10.
Ambos hilos deben de hacer una pausa de 1s entre cada número y mostrar
el número que está imprimiendo.*/

public class Ejercicio1 {
    public static void main(String[] args) {
        Thread hilo1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hilo 1: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    System.out.println("Error " + e.getMessage());
                }
            }
        });
        Thread hilo2 = new Thread(() -> {
            for (int i = 6; i <= 10; i++) {
                System.out.println("Hilo 2: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    System.out.println("Error " + e.getMessage());
                }
            }
        });
        hilo1.start();
        try {
            hilo1.join();
        } catch (InterruptedException e){
            System.out.println("Error " + e.getMessage());
        }
        hilo2.start();

    }
}

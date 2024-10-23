package Ejercicios;

/*Crear un programa en JAVA con dos hilos que compartan una misma variable entera (Contador).
Un hilo debe de incrementar el contador y el otro hilo debe de decrementarlo.
Usa synchronized para resolverlo.*/

class Contador {
    private int contador;
    public synchronized void incrementar(){
        contador++;
    }
    public synchronized void decrementar(){
        contador--;
    }
}

public class Ejercicio2 {

    Contador contador = new Contador();

    public static void main(String[] args) {

        Thread hilo1 = new Thread(() -> {
            for (int i = 1; i <= 5 ; i++) {
                conta
                System.out.println("Hilo 1 :" + i);
            }
        });
    }
}

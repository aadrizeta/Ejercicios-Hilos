package EjercicioEntrega1;

/*Crear un programa que simule la entrada y salida de vehículos de un estacionamiento con capacidad limitada.
Un numero de hilos simularán que intentan entrar en el estacionamiento. Si el estacionamiento está lleno los vehiculos
deberan esperar a que otro vehiculo salga (se ha de ultilizar de dos a tres hilos)*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estacionamiento estacionamiento = new Estacionamiento(5 , 2);
        System.out.println("Capacidad del estacionamiento: " + estacionamiento.getCapacidadMaxima());
        System.out.println("Coches en el interior del estacionamiento: 3");
        System.out.println("Coches en el exterior del estacionamiento: 5");

        Thread cochesEntrando = new Thread(() -> {
            for (int i = 1; i <= 5 ; i++) {
                System.out.println("Coche " + i);
                estacionamiento.entrarVehiculo();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        });

        Thread cochesSaliendo = new Thread(() -> {
            for (int i = 1; i <= 3 ; i++) {
                System.out.println("Coche en el interior" + i + " saliendo");
                estacionamiento.salirVehiculo();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        });

    }
}

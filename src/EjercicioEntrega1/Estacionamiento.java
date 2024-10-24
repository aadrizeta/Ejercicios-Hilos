package EjercicioEntrega1;

public class Estacionamiento {
    private int capacidadMaxima;
    private int cantidadActual;

    public Estacionamiento(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public synchronized void entrarVehiculo() throws InterruptedException {
        while (cantidadActual >= capacidadMaxima){
            System.out.println("Aparcamiento lleno. Esperando a que haya una plaza libre");
            wait();
        }
        cantidadActual++;
        System.out.println("El vehiculo ha entrado. Capacidad Actual: " + (capacidadMaxima - cantidadActual));
        notifyAll();
    }

    public synchronized void salirVehiculo() throws InterruptedException {

            // Se quita un vehículo
            cantidadActual--;
            System.out.println("Vehículo salió. Capacidad actual: " + (capacidadMaxima - cantidadActual));
            notifyAll(); // Notifica a otros hilos

    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}

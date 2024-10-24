package EjercicioEntrega1;

public class Estacionamiento {
    private int capacidadMaxima;
    private int cantidadActual;

    public Estacionamiento(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public void entrarVehiculo(){
        if (cantidadActual < capacidadMaxima){
            cantidadActual++;
            System.out.println("Vehiculo entrado al estacionamiento. Cantidad actual: " + cantidadActual);
        } else {
            System.out.println("Estacionamiento lleno. Esperando a que otro vehículo abandone el estacionamiento");
        }
    }

    public void salirVehiculo(){
        if (cantidadActual > 0){
            cantidadActual--;
            System.out.println("Vehiculo salido del estacionamiento. Cantidad actual: " + cantidadActual);
        } else {
            System.out.println("No hay vehículos en el estacionamiento");
        }
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

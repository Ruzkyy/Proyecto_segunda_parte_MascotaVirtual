package co.edu.konradlorenz.model;

public class EstadisticasM {

    private Mascota mascota;

    public EstadisticasM(Mascota mascota) {
        this.mascota = mascota;
    }

    public int getAlimentacion() {
        return mascota.getAlimentacion();
    }

    public int getEnergia() {
        return mascota.getEnergia();
    }

    public int getDiversion() {
        return mascota.getDiversion();
    }

    

    public void mostrarEstadisticas() {
        System.out.println("Estadísticas de " + mascota.getNombre() + ":");
        System.out.println("Alimentación: " + mascota.getAlimentacion());
        System.out.println("Energía: " + mascota.getEnergia());
        System.out.println("Diversión: " + mascota.getDiversion());
    }
}

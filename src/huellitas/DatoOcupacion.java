package huellitas;

public class DatoOcupacion  {
    private Tipo tipo;
    private int cantAnimales;
    private int cantCuidadores;

    public DatoOcupacion (Tipo tipo, int cantAnimales, int cantCuidadores) {
        this.tipo = tipo;
        this.cantAnimales = cantAnimales;
        this.cantCuidadores = cantCuidadores;
    }
// Muestra el dato de ocupación por tipo de animal
    public void mostrar() {
        System.out.println("Tipo: " + tipo
                + " | Animales: " + cantAnimales
                + " | Cuidadores con al menos uno: " + cantCuidadores);
    }
}

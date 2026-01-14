package huellitas;

import java.util.ArrayList;

public class InformeOcupacionPorTipo {

	private ArrayList<DatoOcupacion> datos;

	public InformeOcupacionPorTipo() {
		this.datos = new ArrayList<>();
	}
// Agrega un dato al informe de ocupación
	public void agregarDato(Tipo tipo, int cantAnimales, int cantCuidadores) {
		datos.add(new DatoOcupacion(tipo, cantAnimales, cantCuidadores));
	}
// Muestra el informe
	public void mostrarPorTipo() {
		int i = 0;
		while (i < datos.size()) {
			DatoOcupacion dato = datos.get(i);
			dato.mostrar();
			i++;
		}
	}

}
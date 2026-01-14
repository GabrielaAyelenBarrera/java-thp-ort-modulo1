package huellitas.v2;

import java.util.ArrayList;

public class Refugio {

	private String nombre;
	private ArrayList<Cuidador> cuidadores;

	public Refugio(String nombre) {
		this.nombre = nombre;
		this.cuidadores = new ArrayList<>();
	}

// Registra cuidador en el refugio si no existe 
	public void registrarCuidador(String nombre, TipoAnimal tipo) {
		if (this.buscarCuidador(nombre) == null) {
			this.cuidadores.add(new Cuidador(nombre, tipo));

		} else {
			System.out.println(nombre + " ya existe en el sistema!");
		}
	}

// Busca un cuidador por su nombre
	private Cuidador buscarCuidador(String nombre) {
		Cuidador cuidador = null;
		int i = 0;
		while (i < this.cuidadores.size() && !this.cuidadores.get(i).esMismoNombre(nombre)) {
			i++;

		}
		if (i < this.cuidadores.size()) {
			cuidador = this.cuidadores.get(i);
		}
		return cuidador;
	}

// Registra un animal en el refugio y le asigna un cuidador
	public void registrarAnimal(String nombreAnimal, TipoAnimal tipo) {
		Cuidador cuidador;
		cuidador = this.buscarCuidadorPorTipo(tipo);
		if (cuidador != null) {
			cuidador.asignarAnimal(new Animal(nombreAnimal, tipo));
			System.out.println(nombreAnimal + " fue agregado con exito y es cuidado por: " + cuidador.getNombre());
		} else {
			System.out.println("No hay cuidador para " + tipo);
		}
	}

// Busca el cuidador que tiene menos animales
	private Cuidador buscarCuidadorPorTipo(TipoAnimal tipo) {
		Cuidador cuidadorElegido = null;
		int minAnimales = Integer.MAX_VALUE;
		int cantidadAnimales;

		for (Cuidador cuidador : this.cuidadores) {
			cantidadAnimales = cuidador.getCantAnimales();
			if (cuidador.estaCuidando(tipo) && cantidadAnimales < minAnimales) {
				cuidadorElegido = cuidador;
				minAnimales = cantidadAnimales;
			}
		}
		return cuidadorElegido;

	}

// VERSION 1
	private ArrayList<InformeTipoAnimal> generarInformeOcupacionPorTipo() {
		ArrayList<InformeTipoAnimal> informe = new ArrayList<>();

		for (TipoAnimal tipo : TipoAnimal.values()) {
			this.completarRegistro(informe, tipo);
		}
		return informe;

	}

//// VERSION 2
//	private ArrayList<InformePorTipo> generarInformeOcupacionPorTipo() {
//		ArrayList<InformePorTipo> informe = new ArrayList<>();
//		this.completarRegistro(informe, TipoAnimal.PERRO);
//		this.completarRegistro(informe, TipoAnimal.GATO);
//		this.completarRegistro(informe, TipoAnimal.CONEJO);
//		this.completarRegistro(informe, TipoAnimal.HAMSTER);
//		return informe;
//
//	}
	
// completa el informe con los animales y los cuidadores de cada tipo de animal
	private void completarRegistro(ArrayList<InformeTipoAnimal> informe, TipoAnimal tipo) {
		int cantAnimales = 0;
		int cantCuidadores = 0;
		for (Cuidador cuidador : this.cuidadores) {
			if (cuidador.estaCuidando(tipo) && cuidador.tieneAnimalesACargo()) {
				cantAnimales += cuidador.getCantAnimales();
				cantCuidadores++;
			}
		}
		informe.add(new InformeTipoAnimal(cantAnimales, cantCuidadores, tipo));
		// return informe.add(new InformeTipoAnimal(cantAnimales, cantCuidadores,
		// tipo));

	}

// VERSION 1
	public void mostrarInformeOcupacionPorTipo() {
		ArrayList<InformeTipoAnimal> informe;
		informe = this.generarInformeOcupacionPorTipo();
		for (InformeTipoAnimal registro : informe) {
			System.out.println(registro);
		}
	}

//// VERSION 2
//	public void mostrarInformeOcupacionPorTipo() {
//		for (InformeTipoAnimal registro : this.generarInformeOcupacionPorTipo()) {
//			System.out.println(registro);
//
//		}
//	}

}

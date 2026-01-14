package huellitas;

import java.util.ArrayList;

public class Refugio {

	private String nombre;
	private ArrayList<Cuidador> cuidadores;
	private ArrayList<Animal> animales;

	public Refugio(String nombre) {
		this.nombre = nombre;
		this.cuidadores = new ArrayList<>();
		this.animales = new ArrayList<>();
	}

	// Busca si existe un cuidador por su nombre y apellido
	private Cuidador buscarCuidadorPorNombreCompleto(String nombre, String apellido) {
		Cuidador cuidadorEncontrado = null;
		int i = 0;
		Cuidador actual;

		while (i < cuidadores.size() && cuidadorEncontrado == null) {
			actual = cuidadores.get(i);
			if (actual.getNombre().equals(nombre) && actual.getApellido().equals(apellido)) {
				cuidadorEncontrado = actual;
			} else {
				i++;
			}
		}

		return cuidadorEncontrado;
	}

	// Busca un cuidador por su tipo preguntandole a cada uno si puede atender ese tipo
	public boolean existeCuidadorConTipo(Tipo tipo) {
	    boolean existe = false;
	    int i = 0;
	    Cuidador actual;

	    while (i < cuidadores.size() && !existe) {
	        actual = cuidadores.get(i);
	        if (actual.puedoAtenderEseTipo(tipo)) {   // delegación al cuidador
	            existe = true;
	        } else {
	            i++;
	        }
	    }

	    return existe;
	}


	// Registra un cuidador en el refugio si no existe
	public boolean registrarCuidador(String nombre, String apellido, Tipo tipo) {
		boolean agregado = false;
		Cuidador existente;
		existente = buscarCuidadorPorNombreCompleto(nombre, apellido);

		if (existente == null) {
			Cuidador nuevo = new Cuidador(nombre, apellido, tipo);
			cuidadores.add(nuevo);
			agregado = true;
		}

		return agregado;
	}


	// Busca el mejor cuidador para un tipo de animal
	private Cuidador buscarMejorCuidadorParaTipo(Tipo tipoBuscado) {
		Cuidador mejorCuidador = null;
		int i = 0;
		Cuidador cuidadorActual;

		while (i < cuidadores.size()) {
			cuidadorActual = cuidadores.get(i);

			if (cuidadorActual.puedoAtenderEseTipo(tipoBuscado)) {
				if (mejorCuidador == null || cuidadorActual.tieneMenorCargaQue(mejorCuidador)) {
					mejorCuidador = cuidadorActual;
				}
			} 

				i++;
			
		}

		return mejorCuidador;
	}

// Asigna un animal a un cuidador
	public boolean asignarAnimalACuidador(Animal animal) {
		boolean animalAsignado = false;
		Cuidador cuidadorMejor;

		cuidadorMejor = buscarMejorCuidadorParaTipo(animal.getTipo());

		if (cuidadorMejor != null) {
			cuidadorMejor.agregarAnimal(animal);
			animalAsignado = true;
		}

		return animalAsignado;
	}

	// Registra un animal
	public ResultadoRegistroAnimal registrarAnimal(String nombre, Tipo tipo) {
		ResultadoRegistroAnimal resultado;
		Animal animal;
		
		animal = new Animal(nombre, tipo);
		
		if (asignarAnimalACuidador(animal)) {
			animales.add(animal);
			resultado = ResultadoRegistroAnimal.REGISTRADO_OK;
		} else {
			resultado = ResultadoRegistroAnimal.SIN_CUIDADOR_DISPONIBLE;
		}
		
		return resultado;
	}
	// Cuenta cuántos animales del refugio son de ese tipo
	private int contarAnimalesDeTipo(Tipo tipo) {
	    int cant = 0;
	    int i = 0;

	    while (i < animales.size()) {
	        Animal a = animales.get(i);
	        if (a.soyDeTipo(tipo)) {   // acá sí delegás en el animal
	            cant++;
	        }
	        i++;
	    }

	    return cant;
	}


	// Cuenta cuántos cuidadores tienen al menos un animal de ese tipo
	private int contarCuidadoresConAnimalesDeTipo(Tipo tipo) {
		int cantCuidadores = 0;
		int j = 0;

		while (j < cuidadores.size()) {
			Cuidador c = cuidadores.get(j);
			if (c.tieneAnimalDeTipo(tipo)) { // delegación en Cuidador
				cantCuidadores++;
			}
			j++;
		}

		return cantCuidadores;
	}

	// Genera el informe
	public InformeOcupacionPorTipo generarInformeOcupacionPorTipo() {
		InformeOcupacionPorTipo informe = new InformeOcupacionPorTipo();

		int i = 0;

		while (i < Tipo.values().length) {
			Tipo tipo = Tipo.values()[i];

			int cantAnimales = contarAnimalesDeTipo(tipo);
			int cantCuidadores = contarCuidadoresConAnimalesDeTipo(tipo);

			informe.agregarDato(tipo, cantAnimales, cantCuidadores);

			i++;
		}

		return informe;
	}

	// Muestra el informe
	public void mostrarInformeOcupacionPorTipo() {
		InformeOcupacionPorTipo informe;
		informe = generarInformeOcupacionPorTipo();
		informe.mostrarPorTipo();
	}
	public void mostrarCuidadoresConAnimales() {
	    System.out.println("=== ESTADO DE LOS CUIDADORES ===");

	    int i = 0;
	    while (i < cuidadores.size()) {
	        Cuidador c = cuidadores.get(i);
	        c.mostrarAnimalesACargo();   // delegación
	        i++;
	    }
	}

	

}

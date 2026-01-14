package huellitas;

import java.util.ArrayList;

public class Cuidador {
	private String nombre;
	private String apellido;
	private Tipo tipo;
	private ArrayList<Animal> animalesAcargo;

	public Cuidador(String nombre, String apellido, Tipo tipo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipo = tipo;
		this.animalesAcargo = new ArrayList<>();
	}
//El cuidador dice si puede atender ese tipo
	public boolean puedoAtenderEseTipo(Tipo tipoBuscado) {
		boolean puedeatender = false;
		if (this.getTipo().equals(tipoBuscado)) {
			puedeatender = true;
		}
		return puedeatender;

	}
//El cuidador dice cuantos animales tiene
	public int obtenerCargaDeTrabajo() {
		return this.animalesAcargo.size();
	}
//El cuidador dice si tiene menos animales
	public boolean tieneMenorCargaQue(Cuidador otro) {
		return this.obtenerCargaDeTrabajo() < otro.obtenerCargaDeTrabajo();
	}
//El cuidador agrega un animal
	public boolean agregarAnimal(Animal animal) {
		boolean agregado = false;

		if (animal.soyDeTipo(this.tipo)) {
			animalesAcargo.add(animal);
			agregado = true;
		}

		return agregado;
	}
//El cuidador dice si tiene ese animal
	public boolean tieneAnimalDeTipo(Tipo tipo) {
		int i = 0;
		boolean encontrado = false;
		Animal a;
		while (i < animalesAcargo.size() && !encontrado) {
			a = animalesAcargo.get(i);
			if (a.getTipo() == tipo) {
				encontrado = true;
			} else {
				i++;
			}
		}
		return encontrado;
	}
	//El cuidador dice que animales tiene
	public void mostrarAnimalesACargo() {
	    System.out.println("Cuidador: " + this.getNombre() + " " + this.getApellido()
	            + " - Tipo: " + this.getTipo());

	    if (animalesAcargo.isEmpty()) {
	        System.out.println("   Sin animales a cargo.");
	    } else {
	        int i = 0;
	        while (i < animalesAcargo.size()) {
	            Animal a = animalesAcargo.get(i);
	            System.out.println("   * " + a.getNombre() + " (" + a.getTipo() + ")");
	            i++;
	        }
	    }

	    System.out.println(); 
	}


	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Tipo getTipo() {
		return tipo;
	}
}

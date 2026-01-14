package huellitas.v2;

import java.util.ArrayList;

public class Cuidador {

	private String nombre;
	private TipoAnimal tipo;
	private ArrayList<Animal> animalesAcargo;

	public Cuidador(String nombre, TipoAnimal tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.animalesAcargo = new ArrayList<>();
	}

// compara el nombre del cuidador con el que se pasa por parametro
	public boolean esMismoNombre(String nombre) {
		return this.nombre.equals(nombre);
	}

// compara el tipo del cuidador con el que se pasa por parametro
	public boolean estaCuidando(TipoAnimal tipo) {
	    return this.tipo == tipo;
	}

// obtiene la cantidad de animales que tiene
	public int getCantAnimales() {
		return this.animalesAcargo.size();
	}

// agrega un animal a la lista
	public void asignarAnimal(Animal animal) {
		this.animalesAcargo.add(animal);
	}

// verifica si tiene animales
	public boolean tieneAnimalesACargo() {
		return this.getCantAnimales() > 0;
	}

	public String getNombre() {
		return nombre;
	}

}

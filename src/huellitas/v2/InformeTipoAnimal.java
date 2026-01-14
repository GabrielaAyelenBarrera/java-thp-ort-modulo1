package huellitas.v2;

public class InformeTipoAnimal {

	private int cantAnimales;
	private int cantCuidadores;
	private TipoAnimal tipo;

	public InformeTipoAnimal(int cantAnimales, int cantCuidadores, TipoAnimal tipo) {
		this.cantAnimales = cantAnimales;
		this.cantCuidadores = cantCuidadores;
		this.tipo = tipo;

	}

// Muestra el informe de tipo de animal y cantidad de animales y cuidadores
	@Override
	public String toString() {
		String resultado = "";

		resultado = " Tipo de animal: " + this.tipo + ". ";
		resultado += " Cantidad de animales cuidados: " + this.cantAnimales + ". ";
		resultado += " Cantidad de cuidadores asignados: " + this.cantCuidadores + ". ";

		return resultado;

	}

}

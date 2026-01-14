package huellitas;

public class Animal {

	private String nombre;
	private Tipo tipo;

	public Animal(String nombre, Tipo tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public Tipo getTipo() {
		return tipo;
	}
	
	public boolean soyDeTipo(Tipo tipoBuscado) {
		return this.tipo.equals(tipoBuscado);
	}

}

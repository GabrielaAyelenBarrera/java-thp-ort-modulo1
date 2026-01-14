package huellitas.v2;

public class Test {

	   public static void main(String[] args) {

	        Refugio refugio = new Refugio("Huellitas");

	        // 1) Registrar cuidadores
	        refugio.registrarCuidador("Ana", TipoAnimal.PERRO);
	        refugio.registrarCuidador("Luis", TipoAnimal.PERRO);
	        refugio.registrarCuidador("Marta", TipoAnimal.GATO);
	        refugio.registrarCuidador("Pedro", TipoAnimal.HAMSTER);

	        // Intentar registrar un cuidador repetido (debería mostrar el mensaje de "ya existe")
	        refugio.registrarCuidador("Ana", TipoAnimal.PERRO);

	        System.out.println("---- Registro de animales ----");

	        // 2) Registrar animales (se tienen que repartir entre los cuidadores del mismo tipo
	        refugio.registrarAnimal("Firulais", TipoAnimal.PERRO);
	        refugio.registrarAnimal("Toby", TipoAnimal.PERRO);
	        refugio.registrarAnimal("Luna", TipoAnimal.PERRO);

	        refugio.registrarAnimal("Mishi", TipoAnimal.GATO);
	        refugio.registrarAnimal("Bigotes", TipoAnimal.GATO);

	        // No hay cuidador de CONEJO, debería mostrar el mensaje "No hay cuidador para CONEJO"
	        refugio.registrarAnimal("Copito", TipoAnimal.CONEJO);

	        System.out.println();
	        System.out.println("---- Informe de ocupación por tipo ----");

	        // 3) Mostrar informe
	        refugio.mostrarInformeOcupacionPorTipo();
	    }
	}
package ciclismo;

import java.util.Scanner;

public class Ciclismo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		final String FIN = "FIN";
		int tiempoCarreraTotal = 0;
		int cantidadCiclistasTotal = 0;
		int cantRutasTodosTerminaron = 0;

		int cantidadCiclistas;
		String nombreRuta;
		String nombreCiclista;
		char respuestaCarrera;
		boolean terminoCarrera;
		boolean hayAbandono;
		int tiempoCarrera;
		double aguaConsumida;
		double aguaConsumidaPorRuta;
		double promedioTiempo;

		// Nuevas Funcionalidades:
		final char BAJO = 'B';
		final char MEDIO = 'M';
		final char ALTO = 'A';

		int minTiempo = Integer.MAX_VALUE;
		double maxAgua = Double.MIN_VALUE;
		String ciclistaMenosTiempo = null;
		boolean alMenosUnoTermino = false;
		String ciclistaMayorConsumoAgua = null;
		
		int rutasBajo = 0, rutasMedio = 0, rutasAlto = 0;
		int totalRutas = 0;
		
		char gradoDificultad;
		double porcentajeRutasBajo;
		double porcentajeRutasMedio;
		double porcentajeRutasAlto;

		do {
			System.out.println("Ingrese el nombre de la ruta (" + FIN + " para finalizar)");
			nombreRuta = input.nextLine().trim().toUpperCase();

			if (nombreRuta.equals("")) {
				System.out.println("El nombre debe ser distinto a vacio.");
			}

		} while (nombreRuta.equals(""));

		while (!nombreRuta.equals(FIN)) {

			do {
				System.out.println("Ingrese un grado de dificultad: (BAJO: " + BAJO + ", MEDIO: " + MEDIO + ", ALTO:" + ALTO + ")");
				gradoDificultad = input.nextLine().trim().toUpperCase().charAt(0);

				if (gradoDificultad != BAJO && gradoDificultad != MEDIO && gradoDificultad != ALTO) {
					System.out.println("ERROR: debe ingresar " + BAJO + ", " + MEDIO + " o " + ALTO + ".");
				}
			} while (gradoDificultad != BAJO && gradoDificultad != MEDIO && gradoDificultad != ALTO);

			switch (gradoDificultad) {
			case BAJO:
				rutasBajo++;
				break;
			case MEDIO:
				rutasMedio++;
				break;
			case ALTO:
				rutasAlto++;
				break;
			}

			do {
				System.out.println("Ingrese la cantidad de ciclistas que participaron en esta ruta");
				cantidadCiclistas = Integer.parseInt(input.nextLine());

				if (cantidadCiclistas < 0) {
					System.out.println("Usted ingreso " + cantidadCiclistas + " debe ser mayor o igual que 0");
				}

			} while (cantidadCiclistas < 0);

			aguaConsumidaPorRuta = 0;
			hayAbandono = false;

			for (int i = 0; i < cantidadCiclistas; i++) {

				do {
					System.out.println("Ingrese el nombre del ciclista");
					nombreCiclista = input.nextLine().trim();

					if (nombreCiclista.equals("")) {
						System.out.println("El nombre debe ser distinto a vacio.");
					}

				} while (nombreCiclista.equals(""));

				do {
					System.out.println("¿Termino la carrera? (S/N)");
					respuestaCarrera = input.nextLine().trim().toUpperCase().charAt(0);

					if (respuestaCarrera != 'S' && respuestaCarrera != 'N') {
						System.out.println("Error ingrese SI: " + 'S' + " o NO: " + 'N');
					}

				} while (respuestaCarrera != 'S' && respuestaCarrera != 'N');

				terminoCarrera = (respuestaCarrera == 'S');

				if (terminoCarrera) {
					alMenosUnoTermino = true;
					do {
						System.out.println("Ingrese el tiempo que tardó en finalizar la carrera");
						tiempoCarrera = Integer.parseInt(input.nextLine());

						if (tiempoCarrera <= 0) {
							System.out.println("Usted ingreso " + tiempoCarrera + " debe ser mayor a 0");
						}

					} while (tiempoCarrera <= 0);

					if (tiempoCarrera < minTiempo) {

						minTiempo = tiempoCarrera;
						ciclistaMenosTiempo = nombreCiclista;
					}

					do {
						System.out.println("Ingrese la cantidad de agua consumida durante la carrera");
						aguaConsumida = Double.parseDouble(input.nextLine());

						if (aguaConsumida <= 0) {
							System.out.println("Usted ingreso " + aguaConsumida + " debe ser mayo a 0");
						}

					} while (aguaConsumida <= 0);

					if (aguaConsumida > maxAgua) {

						maxAgua = aguaConsumida;
						ciclistaMayorConsumoAgua = nombreCiclista;

					}

					aguaConsumidaPorRuta += aguaConsumida;
					tiempoCarreraTotal += tiempoCarrera;
					cantidadCiclistasTotal++;

				} else {
					hayAbandono = true;
				}
			}

			if (alMenosUnoTermino) {
				System.out.println("En la ruta " + nombreRuta + ", el más rápido fue " + ciclistaMenosTiempo + " con " + minTiempo + " minutos.");
			}

			if (!hayAbandono && cantidadCiclistas > 0) {
				cantRutasTodosTerminaron++;
			}

			if (aguaConsumidaPorRuta > 0) {
				System.out.println(
						"El total de agua consumida para la ruta " + nombreRuta + " fue: " + aguaConsumidaPorRuta);
			} else {
				System.out.println("Ningun ciclista de la ruta " + nombreRuta + " ha logrado finalizar la carrera.");
			}

			do {
				System.out.println("Ingrese el nombre de la ruta (" + FIN + " para finalizar)");
				nombreRuta = input.nextLine().trim().toUpperCase();

				if (nombreRuta.equals("")) {
					System.out.println("El nombre debe ser distinto a vacio.");
				}

			} while (nombreRuta.equals(""));
		}

		// SALIO

		totalRutas = rutasBajo + rutasMedio + rutasAlto;

		if (totalRutas > 0) {
			porcentajeRutasBajo = 100 * ((double) rutasBajo / totalRutas);
			porcentajeRutasMedio = 100 * ((double) rutasMedio / totalRutas);
			porcentajeRutasAlto = 100 * ((double) rutasAlto / totalRutas);

			System.out.println("El porcentaje de rutas para " + BAJO + " fue de: " + porcentajeRutasBajo);
			System.out.println("El porcentaje de rutas para " + MEDIO + " fue de: " + porcentajeRutasMedio);
			System.out.println("El porcentaje de rutas para " + ALTO + " fue de: " + porcentajeRutasAlto);
		}

		if (cantidadCiclistasTotal > 0) {

			promedioTiempo = (double) tiempoCarreraTotal / cantidadCiclistasTotal;

			System.out.println("El promedio de tiempo que tardaron los ciclistas en completar la carrera fue de: " + promedioTiempo + " minutos.");
			System.out.println("La cantidad de rutas donde todos los ciclistas pudieron terminar la carrera fue: " + cantRutasTodosTerminaron);
		} else {
			System.out.println("Ningun ciclista ha terminado la carrera en ninguna ruta.");
		}

		if (ciclistaMayorConsumoAgua != null) {
			System.out.println("El ciclista que mayor cantidad de agua consumio fue " + ciclistaMayorConsumoAgua + " con " + maxAgua + " litros.");
		}

		input.close();
	}
}

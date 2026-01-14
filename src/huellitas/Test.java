package huellitas;

public class Test {

    public static void main(String[] args) {
        Refugio r = new Refugio("Huellitas");

        // --- CUIDADORES (6 en total) ---
        r.registrarCuidador("Ana",     "Gomez",    Tipo.PERRO);
        r.registrarCuidador("Luis",    "Perez",    Tipo.GATO);
        r.registrarCuidador("Marta",   "Lopez",    Tipo.CONEJO);
        r.registrarCuidador("Pablo",   "Diaz",     Tipo.HAMSTER);
        r.registrarCuidador("Sofia",   "Ramirez",  Tipo.PERRO);
        r.registrarCuidador("Diego",   "Fernandez",Tipo.GATO);


        // --- ANIMALES (al menos 30) ---
        ResultadoRegistroAnimal res;

        // Perros
        res = r.registrarAnimal("Firulais",   Tipo.PERRO);
        res = r.registrarAnimal("Luna",       Tipo.PERRO);
        res = r.registrarAnimal("Rocky",      Tipo.PERRO);
        res = r.registrarAnimal("Toby",       Tipo.PERRO);
        res = r.registrarAnimal("Bobby",      Tipo.PERRO);
        res = r.registrarAnimal("Mora",       Tipo.PERRO);
        res = r.registrarAnimal("Lola",       Tipo.PERRO);
        res = r.registrarAnimal("Simba",      Tipo.PERRO);

        // Gatos
        res = r.registrarAnimal("Mishu",      Tipo.GATO);
        res = r.registrarAnimal("Copito",     Tipo.GATO);
        res = r.registrarAnimal("Pelusa",     Tipo.GATO);
        res = r.registrarAnimal("Tom",        Tipo.GATO);
        res = r.registrarAnimal("Nina",       Tipo.GATO);
        res = r.registrarAnimal("Garfield",   Tipo.GATO);
        res = r.registrarAnimal("Mimi",       Tipo.GATO);
        res = r.registrarAnimal("Salem",      Tipo.GATO);

        // Conejos
        res = r.registrarAnimal("Bruno",      Tipo.CONEJO);
        res = r.registrarAnimal("Blanca",     Tipo.CONEJO);
        res = r.registrarAnimal("Nube",       Tipo.CONEJO);
        res = r.registrarAnimal("Chispa",     Tipo.CONEJO);
        res = r.registrarAnimal("Canela",     Tipo.CONEJO);
        res = r.registrarAnimal("Manchas",    Tipo.CONEJO);
        res = r.registrarAnimal("Pompón",     Tipo.CONEJO);

        // Hamsters
        res = r.registrarAnimal("Bolita",     Tipo.HAMSTER);
        res = r.registrarAnimal("Rueditas",   Tipo.HAMSTER);
        res = r.registrarAnimal("Nuez",       Tipo.HAMSTER);
        res = r.registrarAnimal("Chiqui",     Tipo.HAMSTER);
        res = r.registrarAnimal("Pepita",     Tipo.HAMSTER);
        res = r.registrarAnimal("Coco",       Tipo.HAMSTER);
        res = r.registrarAnimal("Pelusa Jr",  Tipo.HAMSTER);

        System.out.println("Animales registrados... (30+ en total)");

        System.out.println();
        r.mostrarInformeOcupacionPorTipo();   
        System.out.println();
        r.mostrarCuidadoresConAnimales();     // listado de cuidadores y sus animales
    }
}
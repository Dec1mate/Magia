import java.util.Scanner;

public class Hogwarts {

	private static Scanner teclado;

	public static String nombreAleatorio() {
		// son 12 nombres
		String nombresAlumnos[] = { "locira", "cliza", "amis", "andran", "palmes", "palades", "himes", "parton",
				"anfiris", "criascios", "orcelia", "gene", "andranteo", "gracas", "delion", "dion", "viosaos",
				"nodicte", "cabarca", "selqueran" };
		String nombre = nombresAlumnos[(int) Math.floor(Math.random() * 20)];

		return nombre;
	}

	public static String apellidoAleatorio() {
		// son 12 apellidos
		String apellidosAlumnos[] = { "vids", "volve", "grida", "freaw", "alrun", "brodic", "wigli", "svia", "sigene",
				"condrimi", "balga", "grolki", "spald", "welvet", "sameadil", "bren", "Skarm", "hammi", "kalf",
				"greinut" };

		String apellidos = apellidosAlumnos[(int) Math.floor(Math.random() * 20)];

		return apellidos;
	}

	public static void imprimir(Alumno[] arrayAlumnos) {

		for (int i = 0; i < arrayAlumnos.length; i++) {
			System.out.println("Nombre Completo: " + arrayAlumnos[i].nombre + " " + arrayAlumnos[i].apellidos);
			System.out.println("Edad: " + arrayAlumnos[i].edad);
			System.out.println("Su asignatura favorita es: " + arrayAlumnos[i].asignaturaFavorita);
			System.out.println("Has hecho los deberes? " + arrayAlumnos[i].deberes);
			System.out.println("Se le permite tener un/a: " + arrayAlumnos[i].especial);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		int grif, huf, rev, sly, edad;
		String asignatura = "";
		Gryffindor[] casaGrif;
		Hufflepuff[] casaHuf;
		Ravenclaw[] casaRav;
		Slytherin[] casaSly;

		System.out.println("Cuantos alumnos van a la casa Hufflepuff ?");
		huf = teclado.nextInt();
		casaHuf = new Hufflepuff[huf];
		for (int i = 0; i < huf; i++) {
			casaHuf[i] = new Hufflepuff(nombreAleatorio(), apellidoAleatorio(),
					edad = (int) Math.floor(Math.random() * 21) + 10, asignatura);
		}
		imprimir(casaHuf);

		System.out.println("Cuantos alumnos van a la casa Ravenclaw ?");
		rev = teclado.nextInt();
		casaRav = new Ravenclaw[rev];
		for (int i = 0; i < rev; i++) {
			casaRav[i] = new Ravenclaw(nombreAleatorio(), apellidoAleatorio(),
					edad = (int) Math.floor(Math.random() * 21) + 10, asignatura);
		}
		imprimir(casaRav);

		System.out.println("Cuantos alumnos van a la casa Slytherin ?");
		sly = teclado.nextInt();
		casaSly = new Slytherin[sly];
		for (int i = 0; i < sly; i++) {
			casaSly[i] = new Slytherin(nombreAleatorio(), apellidoAleatorio(),
					edad = (int) Math.floor(Math.random() * 21) + 10, asignatura);
		}
		imprimir(casaSly);

		System.out.println("Cuantos alumnos van a la casa Griffindor ?");
		grif = teclado.nextInt();
		casaGrif = new Gryffindor[grif];
		for (int i = 0; i < grif; i++) {
			casaGrif[i] = new Gryffindor(nombreAleatorio(), apellidoAleatorio(),
					edad = (int) Math.floor(Math.random() * 21) + 10, asignatura);
		}
		imprimir(casaGrif);

	}
}


public class Ravenclaw extends Alumno {

	public Ravenclaw(String nombre, String apellidos, int edad, String asignaturaFavorita) {
		super(nombre, apellidos, edad, asignaturaFavorita);
		this.deberes = "A eso llamas deberes?";
		this.especial = especialLibros();
	}

	public String especialLibros() {
		String especialArrayLibros[] = { "Herbologia", "Biologia", "Magia", "Alquimia", "Hechizo" };
		String libro;

		libro = especialArrayLibros[(int) Math.floor(Math.random() * 5)];
		return libro;
	}
}

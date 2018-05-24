
public class Slytherin extends Alumno {

	public Slytherin(String nombre, String apellidos, int edad, String asignaturaFavorita) {
		super(nombre, apellidos, edad, asignaturaFavorita);
		this.deberes = "Torture a  un  elfo  domestico  para  que  los hiciera";
		this.especial = especialArma();
	}

	public String especialArma() {
		String especialArrayArmas[] = { "Espada", "Cuchillo", "Daga", "Cetro", "Baston" };
		String arma;

		arma = especialArrayArmas[(int) Math.floor(Math.random() * 5)];
		return arma;
	}
}

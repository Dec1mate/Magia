
public class Hufflepuff extends Alumno {

	public Hufflepuff(String nombre, String apellidos, int edad, String asignaturaFavorita) {
		super(nombre, apellidos, edad, asignaturaFavorita);
		this.asignaturaFavorita = "Lenguaje de Marcas y Runas";
		this.deberes = "Habian deberes?";
		this.especial = especialPlantas();
	}

	public String especialPlantas() {
		String especialArrayPlantas[] = { "Mandragora", "Trebol", "Rosa", "Cactus", "Pino" };
		String planta;

		planta = especialArrayPlantas[(int) Math.floor(Math.random() * 5)];
		return planta;
	}
}

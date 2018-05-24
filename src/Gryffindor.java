
public class Gryffindor extends Alumno {

	public Gryffindor(String nombre, String apellidos, int edad, String asignaturaFavorita) {
		super(nombre, apellidos, edad, asignaturaFavorita);
		this.deberes = "Por  supuesto que los  he  hecho!!!";
		this.especial = especialAnimal();

	}

	public String especialAnimal() {
		String especialArrayAnimales[] = { "Buho", "Ciervo", "Dragon", "Serpiente", "Lechuza" };
		String animal;

		animal = especialArrayAnimales[(int) Math.floor(Math.random() * 5)];
		return animal;
	}
}
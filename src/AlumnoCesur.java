
public class AlumnoCesur {
	public static void main(String[] args) {
		Alumno simran;
		simran = new Alumno("simran", 23, "DAM");
		Alumno alejandro = new Alumno("alejandro", 23, "DAM");
		Alumno adrian = new Alumno("adrian", 25, "DAM");
		Alumno janhin = new Alumno("janhin", 27, "DAM");
		Alumno alvaro = new Alumno("alvaro", 18, "DAM");
		Alumno andres = new Alumno("andres", 20, "DAM");
		Alumno fran = new Alumno("fran", 18, "DAM");
		Alumno santiago = new Alumno("santiago", 22, "DAM");
		Alumno juancarlos = new Alumno("juancarlos", 24, "DAM");
		Alumno ramon = new Alumno("ramon", 24, "DAM");
		Alumno joseramon = new Alumno("joseramon", 39, "DAM");
		Alumno dario = new Alumno("dario", 17, "DAM");
		Alumno juanantonio = new Alumno("juanantonio", 26, "DAW");

		Clase premiumPlus = new Clase("PremiumPlus");

		premiumPlus.add(simran);
		premiumPlus.add(alejandro);
		premiumPlus.add(adrian);
		premiumPlus.add(janhin);
		premiumPlus.add(alvaro);
		premiumPlus.add(andres);
		premiumPlus.add(fran);
		premiumPlus.add(santiago);
		premiumPlus.add(juancarlos);
		premiumPlus.add(ramon);
		premiumPlus.add(joseramon);
		premiumPlus.add(dario);
		premiumPlus.add(juanantonio);

		System.out.println(premiumPlus);
		for (int i = 0; i < premiumPlus.getNumAlumnos(); i++) {
			System.out.println(premiumPlus.getAlumnos()[i]);
		}

		for (int i = 0; i < premiumPlus.getNumAlumnos(); i++) {
			if (premiumPlus.getAlumnos()[i].getNombre() == "dario") {
				premiumPlus.getAlumnos()[i].setEdad(18);
				System.out.println(premiumPlus.getAlumnos()[i].getEdad());
			}
		}
		System.out.println("");
		System.out.println("Los alumnos de DAM son:");
		System.out.println("");

		for (int i = 0; i < premiumPlus.getNumAlumnos(); i++) {
			if (premiumPlus.getAlumnos()[i].getCurso() == "DAM") {
				System.out.println(premiumPlus.getAlumnos()[i]);

			}

		}
		System.out.println("");
		System.out.println("Los alumnos de DAW son:");
		System.out.println("");

		for (int i = 0; i < premiumPlus.getNumAlumnos(); i++) {
			if (premiumPlus.getAlumnos()[i].getCurso() == "DAW") {
				System.out.println(premiumPlus.getAlumnos()[i]);

			}
		}
	}

}

class Alumno {

	private String nombre;
	private int edad;
	private String curso;

	public Alumno(String nombre, int edad, String curso) {
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String toString() {
		return ("[Alumno: " + nombre + " Edad: " + edad + " Curso: " + curso + "]");
	}
}

class Clase {

	private int numAlumnos;
	private Alumno[] alumnos;
	private static final int TOTALALUMNOS = 15;
	private String nombre;

	public Clase(String nombre) {
		numAlumnos = 0;
		alumnos = new Alumno[TOTALALUMNOS];
		this.nombre = nombre;
	}

	public int getNumAlumnos() {
		return numAlumnos;
	}

	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	public static int getTotalalumnos() {
		return TOTALALUMNOS;
	}

	public String toString() {
		return ("[Clase: " + nombre + " NumAlumnos: " + numAlumnos + "]");

	}

	public void add(Alumno nuevoAlumno) {
		if (numAlumnos < TOTALALUMNOS) {
			alumnos[numAlumnos] = nuevoAlumno;
			numAlumnos++;
		}
	}
}

public class DiasSemana {
	public static void main(String[] args) {

		int dayOfWeek;
		int semana;
		int mes = 1;
		while (mes <= 12) {
			if (mes == 1) {
				System.out.print("Enero" + " ");
			} else if (mes == 2) {
				System.out.print("Febrero" + " ");
			} else if (mes == 3) {
				System.out.print("Marzo" + " ");
			} else if (mes == 4) {
				System.out.print("Abril" + " ");
			} else if (mes == 5) {
				System.out.print("Mayo" + " ");
			} else if (mes == 6) {
				System.out.print("Junio" + " ");
			} else if (mes == 7) {
				System.out.print("Julio" + " ");
			} else if (mes == 8) {
				System.out.print("Agosto" + " ");
			} else if (mes == 9) {
				System.out.print("Septiembre" + " ");
			} else if (mes == 10) {
				System.out.print("Octubre" + " ");
			} else if (mes == 11) {
				System.out.print("Noviembre" + " ");
			} else if (mes == 12) {
				System.out.print("Dicembre" + " ");
			}
			semana = 0;
			while (semana <= 3) {
				dayOfWeek = 1;
				while (dayOfWeek <= 7) {
					if (dayOfWeek == 1) {
						System.out.print("[" + "L" + " ");
					} else if (dayOfWeek == 2) {
						System.out.print("M" + " ");
					} else if (dayOfWeek == 3) {
						System.out.print("X" + " ");
					} else if (dayOfWeek == 4) {
						System.out.print("J" + " ");
					} else if (dayOfWeek == 5) {
						System.out.print("V" + " ");
					} else if (dayOfWeek == 6) {
						System.out.print("S" + " ");
					} else if (dayOfWeek == 7) {
						System.out.print("D" + "]");
					}

					dayOfWeek = dayOfWeek + 1;
				}
				semana = semana + 1;
			}
			mes = mes + 1;
			System.out.println(" ");
		}
	}
}

package unico;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
/*Realiza un programa que pida una hora por teclado y que luego muestre "buenos días",
 * "buenas tardes" o "buenas noches" según la hora. Se utilizarán los tramos de 6 a 12,
 * de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las horas, los minutos
 * no se deben introducir por teclado.
 */
		final String DIA = "Buenos días";
		final String TARDE = "Buenas tardes";
		final String NOCHE = "Buenas noches";
		final String ERROR = "Hora no valida.";
		
		int hora;
		String mensaje;
		
		System.out.println("¿Buenos días?, ¿Buenas tardes? o ¿Buenas noches?");
		System.out.print("Introduzca una hora [1 - 24]: ");
		hora = Integer.parseInt(teclado.nextLine());
		
		if (hora >= 6 && hora <= 12) {
			mensaje = DIA;
		} else {
			if(hora >= 13 && hora <= 20) {
				mensaje = TARDE;
			} else {
				if (hora >= 21 && hora <= 5) {
					mensaje = NOCHE;
				} else {}
					mensaje = ERROR;
			}
		}
		
		System.out.println(mensaje);
	}

}
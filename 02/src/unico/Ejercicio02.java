package unico;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
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
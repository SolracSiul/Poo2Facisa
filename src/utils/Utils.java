package utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Utils {
	
	private static Scanner teclado = new Scanner (System.in);
	
	static NumberFormat number = new DecimalFormat("RS #,##0.00", new DecimalFormatSymbols(new Locale ("pt", "BR")));
	
	public static String doubleToString(Double value) {
		return number.format(value);
	}
	
	public static String leString() {
		String texto = teclado.nextLine();
		return texto;
	}
	
	public static int leInt() {
		while(true) {
			String texto = leString();
			try {
				return Integer.parseInt(texto);
			}catch(NumberFormatException x) {
				System.out.println("Valor invalido, tente novamente: ");
			}
		}
	}
	public static double leDouble() {
		while(true) {
			String texto = leString();
			try {
				return Double.parseDouble(texto);
			}catch(NumberFormatException x) {
				System.out.println("Valor invalido, tente novamente: ");
			}
		}
	}
	
	public static void pausar(int segundos) {
		try {
			TimeUnit.SECONDS.sleep(segundos);
		}catch(InterruptedException e) {
			System.out.println("Erro ao pausar por: " + segundos + " segundos.");
		}
	}
	
}

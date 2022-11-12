package utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Utils {
	static NumberFormat number = new DecimalFormat("RS #,##0.00", new DecimalFormatSymbols(new Locale ("pt", "BR")));
	
	public static String doubleToString(Double value) {
		return number.format(value);
	}
}
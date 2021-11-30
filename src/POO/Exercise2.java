package POO;

public class Exercise2 {

	public static void main(String[] args) {
		String string1, string2, string3, substring;
		string1 = "Clase de programaci�n";
		string2 = "Es segunda hora";
		string3 = "Programaci�n est� chulo";
		substring = "Quedan 3 Ejercicios";
		System.out.println(string1.charAt(4));
		System.out.println(string1.length());
		System.out.println(string1.codePointAt(6));
		System.out.println(string1.compareTo(string2));
		System.out.println(string1.compareToIgnoreCase(string2));
		System.out.println(string1.concat(string2));
		System.out.println(string1.endsWith(string2));
		System.out.println(string1.equals(string2));
		System.out.println(string1.equals(string2) && string1.equals(string3));
		System.out.println(string1.equalsIgnoreCase(string2));
		System.out.println(string1.indexOf('e'));
		System.out.println(string2.indexOf('e', 0));
		System.out.println(string2.indexOf('e', 5));
		System.out.println(string1.indexOf(substring));
		System.out.println(string1.indexOf(substring, 0));
		System.out.println(string1.isEmpty());
		System.out.println(string3.lastIndexOf('e'));
		System.out.println(string3.lastIndexOf('s', 9));
		System.out.println(string3.lastIndexOf('s', 20));
		System.out.println(string1.lastIndexOf(substring));
		System.out.println(string1.lastIndexOf(substring, 0));
		System.out.println(string3.replace('s', 'z'));
		System.out.println(substring.toUpperCase());
		System.out.println(string1.trim());
	}

}

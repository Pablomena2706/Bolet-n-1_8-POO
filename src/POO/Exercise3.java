package POO;

public class Exercise3 {

	public static void main(String[] args) {
		Character ch1, ch2, ch3;
		char primitive = 'c';
		ch1 = 'c';
		ch2 = '4';
		ch3 = '1';
		System.out.println(ch1.charValue());
		System.out.println(Character.compare(primitive, 'f'));
		System.out.println(ch3.equals(ch1));
		System.out.println(Character.isDigit(1));
		System.out.println(Character.isLetter(ch3));
		System.out.println(Character.isLowerCase(ch2));
		System.out.println(Character.isSpaceChar(ch2));
		System.out.println(Character.isUpperCase(ch1));
		System.out.println(Character.toLowerCase(ch2));
		System.out.println(Character.toUpperCase(ch3));

	}

}

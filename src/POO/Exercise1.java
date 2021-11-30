package POO;

public class Exercise1 {

	public static void main(String[] args) {
		float a = 3;
		int b = 6, c = 5, f = 1, i = -2;
		double d = 4.4, e = -5.5, g = -1.1, h = -1.1;

		System.out.println(Math.abs(a) + 1); // 4.0, este m�todo pasa los n�meros a valor absoluto
		System.out.println(Math.addExact(b, c) + 1);// 12, este m�todo
		System.out.println(Math.ceil(d)); // 5.0, este m�todo se va al n� exacto m�s grande
		System.out.println(Math.ceil(e)); // -5.0,este m�todo se va al n� exacto m�s grande
		System.out.println(Math.decrementExact(f)); // 0, este m�todo resta uno al n�mero impuesto
		System.out.println(Math.floor(g)); // -2.0,este m�todo se va al n�mero exacto m�s peque�o
		System.out.println(Math.floor(h)); // -2.0, este m�todo se va al n� exacto m�s peque�o
		System.out.println(Math.incrementExact(i)); // -1, este m�todo suma uno al n� impuesto
		System.out.println(Math.max(d, e) + 1); // 5.4, este m�todo escoge el n� m�s grande de los impuestos
		System.out.println(Math.multiplyExact(b, i));// -12, este m�todo multiplica los dos n� impuestos
		System.out.println(Math.negateExact(c)); // -5, este m�todo pasa a negativo cualquier n�

	}

}

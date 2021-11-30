package POO;

public class Exercise4 {

	public static void main(String[] args) {
		Integer integer = 65;
		int ent = 9;
		Integer int2 = 12;
		Integer int3 = 13, int4 = 30;
		String cad = "213";

		System.out.println(integer.byteValue());
		System.out.println(Integer.compare(ent, 9));
		System.out.println(int3.compareTo(int4));
		System.out.println(int2.doubleValue());
		System.out.println(int3.equals(int4));
		System.out.println(int3.intValue());
		System.out.println(Integer.max(ent, 101));
		System.out.println(Integer.min(ent, 87));
		System.out.println(Integer.parseInt(cad));
		System.out.println(Integer.sum(ent, 34));
		System.out.println(Integer.valueOf(56));
		System.out.println(Integer.valueOf(int3));
	}

}

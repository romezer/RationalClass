
public class Test {

	public static void main(String[] args) {
		
		Rational r1 = new Rational(2, 3);
		Rational r2 = new Rational(1,6);
		
		System.out.println(r1.equals(r2));
		System.out.println(r1.getDenominator());
		System.out.println(r1.getNumerator());
		System.out.println(r1.greaterThan(r2));
		System.out.println(r1.toString());
		System.out.println(r1.minus(r2));
		System.out.println(r1.multiply(r2));
		System.out.println(r1.plus(r2));
		System.out.println(r1.multiply(r2).reduce());
	}

}

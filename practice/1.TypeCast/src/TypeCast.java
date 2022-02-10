public class TypeCast {

	public static void main(String[] args) {
		
		//implicit conversion
		System.out.println("Implicit Type Casting");
		char a='C';
		System.out.println("Character Value of a: "+a);
		
		double e=a;
		System.out.println("Double Numeric of e: "+e);

		int b=a;
		System.out.println("Interger Value of b: "+b);
		
		float c=a;
		System.out.println("Decimal Value of c: "+c);
		
		long d=a;
		System.out.println("Long Decimal of d: "+d);
		
				
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		//explicit conversion
		
		double q=97.5;
		int p=(int)q;
		System.out.println("Value of q: "+q);
		System.out.println("Value of p: "+p); 
		
	}
}

import static org.junit.jupiter.api.Assertions.*;

import Util.Fibona;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		System.out.println(Fibona.fibonacci(4));
		System.out.println(Fibona.fibonacci(2));
		System.out.println(Fibona.fibonacci(7));
		System.out.println(Fibona.fibonacci(8));
		
		System.out.println(Fibona.factorial(2));
		System.out.println(Fibona.factorial(9));
		System.out.println(Fibona.factorial(1));
		System.out.println(Fibona.factorial(6));
		
		System.out.println(Fibona.esPrimo(3));
		System.out.println(Fibona.esPrimo(4));
		System.out.println(Fibona.esPrimo(5));
		System.out.println(Fibona.esPrimo(6));
		
	}
	

}

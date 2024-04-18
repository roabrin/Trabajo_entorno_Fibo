
public class Fibona {
	public class Algoritmo {

		public static void fibonacci(int MAX) {

			int firstNumber = 0;
			int secondNumber = 1;
			int fibonacci = '\0';

			for (int i = 2; i < MAX; i++) {

				fibonacci = firstNumber + secondNumber;
				System.out.print(fibonacci + " ");

				firstNumber = secondNumber;
				secondNumber = fibonacci;
			}
		}

		public static void main(String[] args) {

			System.out.println("Print Fibonacci Series Using Iterative Method");
			int MAX = 15;
			fibonacci(MAX);

			
		}
		public static int factorial (int fac) {
			int factor=1;
			for (int i = 1; i <= fac; i++) {
	            factor = factor * i;
	        }
			return factor;
		}
		public boolean esPrimo(int numero) {
		    if (numero <= 1) {
		        return false;
		    }
		    for (int i = 2; i < numero; i++) {
		        if (numero % i == 0) {
		            return false;
		        }
		    }
		    return true;
		}

	}
}

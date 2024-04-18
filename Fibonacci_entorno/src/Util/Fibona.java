package Util;

public class Fibona {
	

		
/**
 * 
 * @param MAX Aqui hacemos el metodo fibonacci
 * @return
 */
		
		public static int fibonacci(int MAX) {

			int firstNumber = 0;
			int secondNumber = 1;
			int fibonacci = '\0';

			for (int i = 2; i < MAX; i++) {

				fibonacci = firstNumber + secondNumber;
				

				firstNumber = secondNumber;
				secondNumber = fibonacci;
			}
			return fibonacci;
		}
		/**
		 * 
		 * @param fac Esto devuelve el factorial
		 * @return
		 */
		public static int factorial (int fac) {
			int factor=1;
			for (int i = 1; i <= fac; i++) {
	            factor = factor * i;
	        }
			return factor;
		}
		/**
		 * 
		 * @param numero Esto es para averiguar el numero primo
		 * @return
		 */
		public static boolean esPrimo(int numero) {
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

package APP;

import java.util.Random;

import Util.Fibona;

public class Principal {
	
public static void main(String[] args) {
		/*Crea mediante un bucle un array de enteros llamado 
		“numeros” con 5 números aleatorios del 1 al 10.*/
	int[] numero = new int[5];
	for (int i = 0; i < 5; i++) {
	    numero[i] = (int)(Math.random() * 10) + 1;
	}


		/*Calcula mediante un bucle el número de fibonacci de los 
		 * 5 números del array y almacena 
		 * el resultado en otro array de enteros llamado “resultadoFibonacci”.*/
		int[] resultadosfibonacci = new int[5];
        for (int i =0; i<numero.length;i++) {
        	resultadosfibonacci[i]= Fibona.fibonacci(i);
        	
        }

		
		/*Calcula mediante un bucle el factorial de los 5 números del array y 
		 * almacena el resultado en otro array de enteros llamado 
		 * “resultadoFactorial”.*/
        int[] resultadosfactorial = new int[5];
        for (int i =0; i<numero.length;i++) {
        	resultadosfactorial[i]= Fibona.factorial(i);   	
        }
		/*Comprueba mediante un bucle si los 5 números del array son primos o no y 
		  almacena el resultado en otro array de booleanos llamado “resultadoPrimos”.*/
        boolean[] resultadosprimo = new boolean[5];
        for (int i =0; i<numero.length;i++) {
        	resultadosprimo[i]=Fibona.esPrimo(i);
        	}
        }
}

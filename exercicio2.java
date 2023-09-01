package lacoDeRepeticao_Aula10;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int numero, contador, somaPares = 0, somaImpar = 0;
		
		for(contador = 1; contador <11; contador++) {
			System.out.println("\nDigite o " + contador + "º numero: ");
			numero = leia.nextInt();
		
						
			if(numero % 2 == 0) {
			somaPares++;
			
			
			}else {
			somaImpar++;	
										
			}
		}
			System.out.println("Total de números pares: " + somaPares);
			System.out.println("Total de números ímpares: " + somaImpar);
			
		}

}

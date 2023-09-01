package lacoDeRepeticao_Aula10;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
			
		 int num, soma = 0;
		 
		 System.out.println("\nDigite um numero. Digite 0 para encerrar. ");	 
		
		 do {
		 System.out.println("\nDigite um numero: ");
			num = leia.nextInt();
			
			 
			if (num > 0) {
				soma += num;
			}
			
		 }while (num != 0);
	       	        
	        	
		
			 System.out.println("A soma dos numeros positivos é: " + soma);
			
	         } 
			
	}



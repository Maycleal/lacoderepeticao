package lacoDeRepeticao_Aula10;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		 int num, menor = 0, maior = 0;
		 
		 System.out.println("\nDigite a sua idade.");
		 num = leia.nextInt();
			
			
	         while (num > 0)	{ 
	        	 
	        	 System.out.println("\nDigite a sua idade: ");
					num = leia.nextInt(); 	  			 
		 
			 if (num<21) { 
			 menor++;
			 
			 }if (num>50) {
			 maior++;
			 }
	         }
			 System.out.println("Total de pessoas menores de 21anos: " + menor);
			 System.out.println("Total de pessoas maiores de 50 anos: " + maior);
		 
			 }
			 
		 }
		 
	

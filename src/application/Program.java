package application;

import java.util.Scanner;

import entity.UrnaEletronica;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		UrnaEletronica urna1 = new UrnaEletronica();
		UrnaEletronica urna2 = new UrnaEletronica();
		UrnaEletronica urna3 = new UrnaEletronica();
		UrnaEletronica urna4 = new UrnaEletronica();
		UrnaEletronica urna5 = new UrnaEletronica();
		
		System.out.println("------------------------------ URNA ELETRÊNICA -----------------------------------");
		
		System.out.println(" Deputado Federal");		
		Integer num = sc.nextInt();
		urna1.setNumeroCandidato(num);
		urna1.verificaCargo();
		
		System.out.println(" Deputado Estadual");		
		num = sc.nextInt();
		urna2.setNumeroCandidato(num);
		urna2.verificaCargo();
		
		System.out.println(" Senador");		
		num = sc.nextInt();
		urna3.setNumeroCandidato(num);
		urna3.verificaCargo();
		
		System.out.println(" Governador");		
		num = sc.nextInt();
		urna4.setNumeroCandidato(num);
		urna4.verificaCargo();
		
		System.out.println(" Presidente");		
		num = sc.nextInt();		
		urna5.setNumeroCandidato(num);			
		urna5.verificaCargo();
		
		
		System.err.println("\n\n\n\n\n-------------------------------------- FIM ---------------------------------");

		
		sc.close();
	}

}

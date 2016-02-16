import java.util.Scanner;

public class PrimerParcial_2
{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		
		System.out.println("numero de mes: ");
		System.out.println("1 = Enero");
		System.out.println("2 = Febrero");
		System.out.println("3 = Marzo");
		System.out.println("4 = Abril");
		System.out.println("1 = Mayo");
		System.out.println("2 = Junio");
		System.out.println("3 = Julio");
		System.out.println("4 = Agosto");
		System.out.println("1 = Septiembre");
		System.out.println("2 = Octibre");
		System.out.println("3 = Noviembre");
		System.out.println("4 = Didiembre");
		
		int menu = teclado.nextInt();

		switch (menu){
				case 1 : 	Sstem.out.println("Enero tiene 31 dias.")
				break;
				case 2 : 	System.out.println("Febrero tiene 28 dias");		
				break;
				case 3 : 	System.out.println ("Marzo tiene 31 dias");			
				break;
				case 4 : 	Sstem.out.println("Abril tiene 30 dias.")
				break;
				case 5 : 	System.out.println("Mayo tiene 28 dias");		
				break;
				case 6 : 	System.out.println ("Junio tiene 30 dias");			
				break;
				case 7 : 	Sstem.out.println("Julio tiene 31 dias.")
				break;
				case 8 : 	System.out.println("Agosto tiene 31 dias");		
				break;
				case 9 : 	System.out.println ("Septiembre tiene 30 dias");			
				break;
				case 10 : 	Sstem.out.println("Octubre tiene 31 dias.")
				break;
				case 11 : 	System.out.println("Noviembre tiene 30 dias");		
				break;
				case 12 : 	System.out.println ("Diciembre tiene 31 dias");	
		
				case 4 : return;
				//break;
				default: 
				break;
				}

					
	}
}
import java.util.Scanner;

public class PrimerParcial_1
{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		do {
		System.out.println("Ingrese el tipo de consola de juego: ");
		System.out.println("1 = PS3");
		System.out.println("2 = XBOX");
		System.out.println("3 = WII");
		System.out.println("4 = Salir.");
		
		int menu = teclado.nextInt();
		int ps3=0;
		int xbox=0;
		int wii=0;

		

		if (menu == 1){
			ps3= +1;
			}
			else if (menu == 2){
			xbox = +1;
		}
		else if (menu == 3){
			wii = +1;
		}
		else if (menu == 4){
			return;
		}
		else{
			System.out.print ("Opcion no valida, ingrese numero: ");
		}
		System.out.println("El numero de veses que ingreso PS3  es: " + ps3);
		System.out.println("El numero de veses que ingreso XBOX  es: " + xbox);
		System.out.println("El numero de veses que ingreso WII  es: " + wii);

		}
		while (menu == 4);

	}
}
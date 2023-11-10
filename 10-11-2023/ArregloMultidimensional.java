import java.util.Scanner;

/**
 * @autor HeNew4
 */

public class ArregloMultidimensional {	
	
	public static void main(String []args) {	
		Scanner scanner = new Scanner(System.in);
	
		String arreglos[][] = new String[3][3];
		
		for ( int i = 0; i < arreglos.length; i++ ) {
			
			System.out.printf("\nTe quedan %d/3\n\n", i);
		
			System.out.println("¿Apellido Paterno del Maestro?");	
			arreglos[i][0] = scanner.nextLine();

			System.out.println("¿Apellido Materno del Maestro?");	
			arreglos[i][1] = scanner.nextLine();

			System.out.println("¿Nombre del Maestro?");	
			arreglos[i][2] = scanner.nextLine();

		}

		System.out.println("¿Quieres que te muestre los datos?[y/n]");
		char response = scanner.next().charAt(0);
		
		if ( response == 'y' ) {
			System.out.printf("\n%18s %18s %18s\n", "Apellido paterno", "Apellido materno", "Nombre");

			for ( int i = 0; i < arreglos.length; i++ ) {
				System.out.printf("%18s %18s %18s\n", arreglos[i][0], arreglos[i][1], arreglos[i][2]);
			}
		}
	}

}

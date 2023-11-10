
public class Arrays {
	public static void main( String [] args ) {
		
		final int LENGTH = 10;		

		// Figura 7.2
		System.out.printf("%s\n", "Figura 7.3");

		System.out.printf("%s%8s\n", "Indice", "Valor");

		int arregloP[] = new int[LENGTH];

		for ( int i = 0; i < arregloP.length; i++ ) {
			System.out.printf("%5d%8d\n", i, arregloP[i]);
		}

		// Figura 7.3
		System.out.printf("\n%s\n", "Figura 7.3");		
		
		int arreglo[] = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };

		System.out.printf("%s%8s\n", "Indice", "Valor");

		for ( int i = 0; i < arreglo.length; i++ ) {
			System.out.printf("%5d%8d\n", i, arreglo[i]);
		}

		// Figura 7.4	
		System.out.printf("\n%s\n", "Figura 7.4");	

		int array[] = new int[LENGTH];
		
		for ( int i = 0; i < array.length; i++ ) {
			array[i] = 2 + 2 * i;
		}

		System.out.printf("%s%8s\n", "Indice", "Valor");

		for ( int i = 0; i < array.length; i++ ) {
			System.out.printf("%5d%8d\n", i, array[i]);
		}
	}
}
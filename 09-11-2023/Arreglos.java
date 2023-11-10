public class ArraySuma {
	public static void main( String [] args ) {	
		
		int arreglo[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 ,10 };

		int tmp = 0;
		

		System.out.printf("%2s %8s\n", "Suma", "Promedio");

		for ( int i = 0; i < arreglo.length; i++ ) {
			tmp += arreglo[i];
		}

		float promedio = (float)tmp/(float)arreglo.length;

		System.out.printf("%4d %.2f\n", tmp, promedio);
	}
}
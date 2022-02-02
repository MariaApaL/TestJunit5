package JUNIT5.VideoJuego;

class PruebaVideojuegoSerie {

public static void main(String[] args) {
		
		TestSerie test = new TestSerie();
		
		test.testDevolver();
		test.testEntregar();
		
		TestVideoJuego test2 = new TestVideoJuego();
		
		test2.testEntregar();
		test2.testDevolver();
		
		System.out.println("Pruebas Finalizadas");
		

	}
}

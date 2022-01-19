package utilidades;

public class Utilidad {
	public static void stopAndContinue() {
		tiempoEspera();
		limpiarPantalla();
	}

	public static void limpiarPantalla() {
		for (int i = 0; i < 10; i++) {
			System.out.println("");
		}
		System.out.flush();
	}

	public static void tiempoEspera() {
		int tiempoEspera = 10; 
		try {
			for (int i = 0; i < tiempoEspera; i++) {
				Thread.sleep(150);
			}
		} catch (InterruptedException ie) {
			System.out.println("Tiempo de espera interrumpido");
		}
	}

}

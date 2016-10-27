package intento1;

public class pureba {
	public static void main(String[] args) {
		Tablero tab = new Tablero();
		tab.iniciar(17, 18);
		tab.cambiarEstado(5, 3);
		tab.cambiarEstado(4, 4);
		tab.cambiarEstado(5, 4);
		tab.cambiarEstado(6, 4);
		tab.cambiarEstado(5, 5);

		tab.cambiarEstado(12, 3);
		tab.cambiarEstado(11, 4);
		tab.cambiarEstado(13, 4);
		tab.cambiarEstado(12, 4);
		tab.cambiarEstado(12, 5);
		
		tab.cambiarEstado(3, 8);
		tab.cambiarEstado(3, 9);
		tab.cambiarEstado(3, 10);
		tab.cambiarEstado(3, 12);
		tab.cambiarEstado(3, 13);
		tab.cambiarEstado(3, 14);
		
		tab.cambiarEstado(10, 8);
		tab.cambiarEstado(10, 9);
		tab.cambiarEstado(10, 10);
		tab.cambiarEstado(10, 12);
		tab.cambiarEstado(10, 13);
		tab.cambiarEstado(10, 14);
		
		tab.cambiarEstado(14, 8);
		tab.cambiarEstado(14, 9);
		tab.cambiarEstado(14, 10);
		tab.cambiarEstado(14, 12);
		tab.cambiarEstado(14, 13);
		tab.cambiarEstado(14, 14);
		
		tab.imprimirEstadoActual();
		tab.next();
		tab.imprimirEstadoActual();
		tab.next();
		tab.imprimirEstadoActual();
		tab.next();
		tab.imprimirEstadoActual();
		tab.next();
		tab.imprimirEstadoActual();

		
		
		
	}
}

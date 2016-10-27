package intento1;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.imageio.ImageIO;

public class Tablero {
	private Celda[][] tablero; // [alto,ancho]
	private boolean[][] tableroAux;
	private int alto;
	private int ancho;

	public Tablero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void next() {
		tableroAux = new boolean[alto + 1][ancho + 1];
		for (int i = 0; i < alto + 1; i++) {
			for (int j = 0; j < ancho + 1; j++) {
				tableroAux[i][j] = tablero[i][j].isActivo();
			}
		}

		for (int i = 0; i < alto + 1; i++) {
			for (int j = 0; j < ancho + 1; j++) {
				tablero[i][j].actualizar(analizarVecinos(i, j));
			}
		}

	}

	private int analizarVecinos(int alt, int anch) {
		int cont = 0;

		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				if (i == 0 && j == 0) {
				} else {
					try {
						if (tableroAux[alt + i][anch + j]) {
							cont++;
						}
					} catch (ArrayIndexOutOfBoundsException a) {
					}
				}
			}

		}
		return cont;
	}

	public void iniciar(int alt, int anch) {
		this.alto = alt - 1;
		this.ancho = anch - 1;
		tablero = new Celda[alt][anch];
		for (int i = 0; i <= alto; i++) {
			for (int j = 0; j <= ancho; j++) {
				tablero[i][j] = new Celda();
			}
		}
		// alt = alto+ 1;
	}

	public void cambiarEstado(int anch, int alt) {
		tablero[alt][anch].cambiarEstado();
	}

	public void imprimirEstadoActual() {
		for (int i = 0; i <= alto; i++) {
			for (int j = 0; j <= ancho; j++) {
				if (tablero[i][j].isActivo()) {
					System.out.print("  ");
				} else {
					System.out.print("||");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public void guardarEstadoActual(String file) {
		BufferedImage bf = new BufferedImage(alto + 1, ancho + 1, BufferedImage.TYPE_INT_RGB);
		Color negro = Color.BLACK;
		Color blanco = Color.WHITE;

		for (int i = 0; i <= alto; i++) {
			for (int j = 0; j <= ancho; j++) {
				if (tablero[i][j].isActivo()) {
					bf.setRGB(alto - i, ancho - j, negro.getRGB());
				} else {
					bf.setRGB(alto - i, ancho - j, blanco.getRGB());
				}
			}
		}
		try {
			ImageIO.write(bf, "jpg", new File(file));
		} catch (IOException e) {
			System.out.println("Error de escritura");
		}
	}

}

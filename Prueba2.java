package intento1;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Prueba2 {

	public static Tablero tablero;

	public static void leerImagen(String file) throws IOException {
		File imagenSeleccionada = new File(file);
		BufferedImage imagen = ImageIO.read(imagenSeleccionada);
		tablero = new Tablero();
		Color negro = Color.BLACK;
		Color colorAux;
		tablero.iniciar(imagen.getHeight(), imagen.getWidth()); // altura,ancho
		for (int i = 0; i < imagen.getHeight(); i++) {
			for (int j = 0; j < imagen.getWidth(); j++) {
				colorAux = new Color(imagen.getRGB(j, i));
				if (colorAux.getRGB() == negro.getRGB()) {
					tablero.cambiarEstado(j, i);
				}
			}
		}

	}

	public static void main(String[] args) {
		try {
			String ruta = "C:\\Users\\usuario\\Desktop\\EIA\\Semestre 5\\Lenguajes y Compiladores\\GameOfLifeTuring\\";
			String rutaSala = "C:\\Users\\informatica\\workspace\\Compi\\txt\\";
			leerImagen(ruta+ "_0riginal.bmp");
			tablero.guardarEstadoActual(ruta + "1.bmp");
			for (int i = 0; i <= 100; i++) {
				tablero.next();
				tablero.guardarEstadoActual(ruta + i + ".bmp");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

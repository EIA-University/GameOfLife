package intento1;

import java.util.ArrayList;

public class Celda {
	private boolean activo;
	private boolean anterior;
	private int cantidadCont;
	

	public Celda() {
		super();
		
		this.cantidadCont = 0;
		this.activo = false;
		this.anterior = false;
	}

	public boolean isActivo() {
		return activo;
	}

	public void definirContiguos(int cont) {
		this.cantidadCont = cont;
	}

	public void actualizar(int contiguo) {
		cantidadCont = contiguo;
		if (cantidadCont == 3) {
			activar();
		} else if(cantidadCont !=2) {
			desactivar();
		}
	}

	public void cambiarEstado() {
		if (!activo) {
			activar();
		} else {
			desactivar();

		}
	}

	public void activar() {
		if (!activo) {
			activo = true;

		}
	}

	public void desactivar() {
		if (activo) {
			activo = false;

		}
	}

	public void agregarUno() {
		cantidadCont++;
	}

	public void quitarUno() {
		if (cantidadCont != 0)
			cantidadCont--;
	}

}

package modelo;
import modelo.LampadaTresEstados;

public class Lampada {
	LampadaTresEstados estado;
	
	public Lampada() {
		
	}
	public Lampada(LampadaTresEstados estado) {
		this.estado = estado;
	}
	
	public void setEstado(LampadaTresEstados estadoAtual) {
		this.estado = estadoAtual;
	}
	
	public LampadaTresEstados getEstado() {
		return this.estado;
	}
	
	public boolean estaLigada(LampadaTresEstados est) {
		boolean bool = false;
		
		if(est == LampadaTresEstados.acesa) {
			bool = true;
		}
		if(est == LampadaTresEstados.meia_luz) {
			bool = true;
		}
		if(est == LampadaTresEstados.apagada) {
			bool = false;
		}
		return bool;
	}
}

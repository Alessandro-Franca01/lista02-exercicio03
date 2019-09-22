package visao;
import modelo.LampadaTresEstados;
import modelo.Lampada;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int var;
		LampadaTresEstados estado, estado02;
		estado02 = LampadaTresEstados.apagada;
		
		Lampada lamp = new Lampada();
		Lampada lamp02 = new Lampada();
		System.out.println("Qual operação que vc quer fazer com a 1° lampada:");
		System.out.println("1 - Apagar Lampada");
		System.out.println("2 - Acender Lampada");
		System.out.println("3 - Mei-luz Lampada");
		System.out.println("Digite: ");
		var = sc.nextInt();
		
		if(var == 1) {
			estado = LampadaTresEstados.apagada;
			lamp.setEstado(estado);
		}
		if(var == 2) {
			estado = LampadaTresEstados.acesa;
			lamp.setEstado(estado);
		}
		if(var == 3) {
			estado = LampadaTresEstados.meia_luz;
			lamp.setEstado(estado);
		}
		System.out.println("A 1° lampada esta "+lamp.getEstado());
		System.out.println("\n2° lampada testa o metodo estaLigada()");
		System.out.println(lamp02.estaLigada(lamp02.getEstado()));
	}

}


public class Iccc implements Imposto {

	public double calcula(double valor) {
		if (valor < 1000) {
			return valor * 0.05;
		} else if (valor <= 3000) {
			return valor * 0.07;
		} else {
			return valor * 0.08 + 30;
		}
	}
}
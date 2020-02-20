
public class Icms implements Imposto {

	@Override
	public double calcula(double valor) {
		return valor * 0.01;
	}

}

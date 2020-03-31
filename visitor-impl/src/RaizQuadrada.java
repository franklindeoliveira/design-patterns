
public class RaizQuadrada implements Expressao {
	
	private double numero;

    public RaizQuadrada(double expressao) {
        this.numero = expressao;
    }

    @Override
    public int avalia() {
        return (int) Math.sqrt(numero);
    }

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaRaizQuadrada(this);
		
	}
	
	public double getRaizQuadrada() {
		return numero;
	}

}

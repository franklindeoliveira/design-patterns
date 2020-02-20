
public class CalculadoraDeImpostos {
	
	public void realizaCalculo(double valor, String tipoImposto) {
		
		if (tipoImposto.equals("icms")) {
            double icms = valor * 0.1;
			System.out.println(icms);
		} else if (tipoImposto.equals("iss")) {
            double iss = valor * 0.01;
			System.out.println(iss);
		} else if (tipoImposto.equals("iccc")) {
			if (valor < 1000) {
				System.out.println(valor * 0.05);
			} else if (valor <= 3000) {
				System.out.println(valor * 0.07);
			} else {
				System.out.println(valor * 0.08 + 30);
			}
		}
			
	}

}

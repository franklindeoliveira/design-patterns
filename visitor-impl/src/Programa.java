
public class Programa {
	
	public static void main(String[] args) {
		
		// (10-5) + (2+10)
        Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
        Expressao direita = new Soma(new Numero(2), new Numero(10));
		
        Expressao conta = new Soma(esquerda, direita);
		
        int resultado = conta.avalia();
        System.out.println(resultado);		
        
        Visitor impressora = new ImpressoraVisitor();
        Visitor impressoraPrefixa = new ImpressoraPrefixaVisitor();
        
        conta.aceita(impressora);
        System.out.println();
        conta.aceita(impressoraPrefixa);
	}

}

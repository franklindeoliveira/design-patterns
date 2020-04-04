
public class EmpresaFacadeSingleton {
	
	private static EmpresaFacade instancia;
	
	protected EmpresaFacadeSingleton() {}

    public EmpresaFacade getInstancia() {
        if(instancia == null) {
            instancia = new EmpresaFacade();
        }

        return instancia;
    }

}

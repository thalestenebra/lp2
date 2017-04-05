public class FabricaCarro{
	public static FabricaCarro instancia;
	private FabricaCarro(){
	}
	protected int nfiat;
	protected int nvolks;
	protected int nfords;
	public static synchronized FabricaCarro getInstancia(){
		if(instancia == null)
			instancia = new FabricaCarro();
		return instancia;
		
	}
}

public class Principal{
	public static void main(String args[]){
		FabricaCarro f2=FabricaCarro.getInstancia();
		FabricaCarro f3=FabricaCarro.getInstancia();
		f2.nfiat=+10;
		System.out.println(f3.fiat);
	}
}

package teste;
public class TestaContaComExcecaoChecked {

	public static void main(String[] args)  {
		
		modelo.Conta conta = new modelo.Conta();
		try {
			conta.deposita();
		} catch (modelo.MinhaExcecao ex) {
			System.out.println("tratamento...");
		}
	}
}

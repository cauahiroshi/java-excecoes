
public class TesteConexao {

	public static void main(String[] args) {

		try(Conexao conexao2 = new Conexao()){
			conexao2.leDados();
		}catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
		}
		
		
		// ------------------------------
//		Conexao conexao = null;
//		try {
//			conexao = new Conexao();
//			conexao.leDados();
//		}catch(IllegalStateException ex){
//			System.out.println("Deu erro na conexao");
//		}finally {
//			System.out.println("finally");
//			if(conexao != null) {
//				conexao.close();
//
//			}
//		}
	
	
	
	
	}

}

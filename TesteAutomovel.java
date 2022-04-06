package POO;

public class TesteAutomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciando um objeto da classe automóvel
		
		Automovel auto1 = new Automovel("Fábio Monteiro","H20","OYM1234",2022);
				
			auto1.imprimirInfo();
				
			System.out.println("\n*******Transferência de Proprietário********");
				
			auto1.setNomeProprietario("Lanna Eliege");
				
			auto1.imprimirInfo();
				
			System.out.println("\nModelo:"+auto1.getModelo());
			}
	}



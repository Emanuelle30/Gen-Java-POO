package POO;

public class TesteAutomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciando um objeto da classe autom�vel
		
		Automovel auto1 = new Automovel("F�bio Monteiro","H20","OYM1234",2022);
				
			auto1.imprimirInfo();
				
			System.out.println("\n*******Transfer�ncia de Propriet�rio********");
				
			auto1.setNomeProprietario("Lanna Eliege");
				
			auto1.imprimirInfo();
				
			System.out.println("\nModelo:"+auto1.getModelo());
			}
	}



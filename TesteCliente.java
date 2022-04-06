package POO;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente Cliente1 = new Cliente("Maria Elsa","médica",35,2010);
		
		Cliente1.imprimirInfo();
			
		System.out.println("\n*******Correção de Dados********");
			
		Cliente1.setIdade(33);
			
		Cliente1.imprimirInfo();
			
	}

}

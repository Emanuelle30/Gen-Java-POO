package POO;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente Cliente1 = new Cliente("Maria Elsa","m�dica",35,2010);
		
		Cliente1.imprimirInfo();
			
		System.out.println("\n*******Corre��o de Dados********");
			
		Cliente1.setIdade(33);
			
		Cliente1.imprimirInfo();
			
	}

}

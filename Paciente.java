package POO;

public class Paciente {

	//Declara��o dos atributos da classe
	
			private String nomePaciente;
			private String setor;
			private String entrada;
			private String saida;
			private String statusAtual;
						
	//Declara��o do m�todo construtor
			
			public Paciente (String nomePaciente,String setor,String entrada,String saida,String statusAtual)
			{
				this.nomePaciente = nomePaciente;
				this.setor = setor;
				this.entrada = entrada;
				this.saida = saida;
				this.statusAtual = statusAtual;
			}

			public String getNomePaciente() {
				return nomePaciente;
			}

			public void setNomePaciente(String nomePaciente) {
				this.nomePaciente = nomePaciente;
			}

			public String getSetor() {
				return setor;
			}

			public void setSetor(String setor) {
				this.setor = setor;
			}

			public String getEntrada() {
				return entrada;
			}

			public void setEntrada(String entrada) {
				this.entrada = entrada;
			}

			public String getSaida() {
				return saida;
			}

			public void setSaida(String saida) {
				this.saida = saida;
			}

			public String getStatusAtual() {
				return statusAtual;
			}

			public void setStatusAtual(String statusAtual) {
				this.statusAtual = statusAtual;}
				
				public void imprimirInfo()
			{
				System.out.println("\nPaciente: "+nomePaciente+"\nAlocado no setor: "+setor+"\nDeu entrada no dia: "+entrada+"\nData de sa�da: "+saida+"\nStatus atual do paciente: "+statusAtual+".");
			}

			}

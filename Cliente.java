package POO;

public class Cliente {

	//Declaração dos atributos da classe
	
	private String nomeCliente;
	private String profissao;
	private int idade;
	private int anoFiliacao;
	
//Declaração do método construtor
	
	public Cliente (String nomeCliente,String profissao,int idade,int anoFiliacao)
	{
		this.nomeCliente = nomeCliente;
		this.profissao = profissao;
		this.idade = idade;
		this.anoFiliacao = anoFiliacao;
}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getAnoFiliacao() {
		return anoFiliacao;
	}

	public void setAnoFiliacao(int anoFiliacao) {
		this.anoFiliacao = anoFiliacao;
	}

	public void imprimirInfo()
	{
		System.out.println("\nNome do Cliente: "+nomeCliente+" é "+profissao+" tem  "+idade+" anos, e é nossa cliente desde "+anoFiliacao+".");
	}
	
}
	



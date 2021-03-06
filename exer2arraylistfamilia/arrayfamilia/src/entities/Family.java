package entities;

public class Family {
	
	private String nome;
	private Integer idade;
	private String posicao;
	private String dataNiver;
	
	public Family() {
		
	}
	
	public Family(String nome, String dataNiver, Integer idade, String posicao ) {
		this.nome = nome;
		this.dataNiver = dataNiver;
		this.idade = idade;
		this.posicao = posicao;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getDataNiver() {
		return dataNiver;
	}

	public void setDataNiver(String dataNiver) {
		this.dataNiver = dataNiver;
	}
	
	public String toString() {
		return "Nome: "
				+ nome
				+ ", Data de nacimento: "
				+ dataNiver
				+ ", Idade: "
				+ idade 
				+", Posi??o: "
				+ posicao;
	}
}

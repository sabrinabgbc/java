package funcionario_v2;

//gerente herda de funcion�rio seus m�todos e atributos
public class Gerente extends Funcionario {
	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	//reescrita do m�todo getBonifica��o que tem na classe pai funcion�rio
	public double getBonificacao() {
		//o super indica que o atributo n�o est� definido nesta classe e sim na super classe (a classe pai), que no caso � a Funcion�rio
		//foi chamado um m�todo da classe funcion�rio para concatenar com outro valor
		return super.getBonificacao() +  super.getSalario();
		//se fosse utilizado o this.getBonificacao em vez de usar super.getBonificacao, o m�todo seria chamado recursivamente ele mesmo, causando erros nessa situa��o.
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}

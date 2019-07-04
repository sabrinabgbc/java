package funcionario_v2;

public class ControleBonificacao {
	
	private double soma;
	
	//Polimorfismo
	//Utiliza a refer�ncia mais gen�tica, a classe pai funcionario para que ele e todos os seus filhos possam utilizar essa mesma fun��o
	public void registra(Funcionario funcionario) {
		double bonificacao = funcionario.getBonificacao();
		this.soma = this.soma + bonificacao;
	}
	
	public double getSoma() {
		return soma;
	}
}

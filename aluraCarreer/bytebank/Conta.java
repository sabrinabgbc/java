package bytebank;

//classe: especifica��o de um tipo (neste caso o conta) que define seus atributos e comportamentos
public class Conta {
	//atributos ou propriedades, iniciam com 0/false/vazio
	//altera��es feita na classe ser�o replicada aos objetos ao ser instanciado, depois disso podem ser alterados
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	//fun��o sem retorno
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
		//this para referenciar o saldo (atribuito da classe) da conta na qual o m�todo foi invocado
		//o valor n�o utiliza this por ser uma var�vel tempor�rio que s� existe neste escopo e desaparecer� ao ser terminado de executar essa fun��o
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta contaDestino) {
		if(this.saldo >= valor) {
			saca(valor);
			contaDestino.deposita(valor);
			return true;
		} 
		
		return false;
	}
}

package bytebank_v3;

public class Conta {
	//private para evitar que as vari�veis sejam acessadas diretamente, queremos que sejam alteradas somente pelos m�todos deposita, saca e transfere.
	//atributos da inst�ncia
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	//static: atributo da classe (compartilhado por todas as inst�ncias)
	private static int total;
	
	//A principal responsabilidade do construtor � iniciar atributos
	public Conta(int agencia, int numero) {
		//total++;
		Conta.total++;
		
		this.agencia = agencia;
		this.numero = numero;
		
		//O construtor pode ser usada para fazer restri��es, ser obrigado a informar a agencia e n�mero para instanicar uma conta
		System.out.println("Criando uma conta via construtor");
	}
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
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
	
	//quando as vari�veis s�o privadas, � necess�rio utilizar os get/set para poder alterar essas vari�veis por outras classes
	//neste caso n�o � necess�rio um setSaldo por ue o saca/deposita/transfere j� faz esse papel de alterar o valor do saldo
	//o ideal � que todos os atributos da classe sejam privados, com raras excess�es.
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("O valor informado n�o � permitido");
		} else {
			this.agencia = agencia;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(agencia <= 0) {
			System.out.println("O valor informado n�o � permitido");
		} else {
			this.numero = numero;
		}
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	//m�todo da classe (compartilhado por todas as inst�ncias)
	public static int getTotal() {
		return Conta.total;
	}
}

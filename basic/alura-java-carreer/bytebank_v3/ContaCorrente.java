package bytebank_v3;

public class ContaCorrente extends Conta {

	//herda os m�todos e caracteristicas, mas n�o os construtores
		public ContaCorrente(int agencia, int numero) {
		//necessita da indica��o super para a classe pai
		super(agencia, numero);
	}
}

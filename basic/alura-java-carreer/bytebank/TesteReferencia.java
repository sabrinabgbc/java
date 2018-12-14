package bytebank;

public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("primeira conta - saldo: " + primeiraConta.saldo);
		
		//o objeto n�o est� dentro da vari�vel, e sim somente a sua refer�ncia
		//temos somente um objeto criado, e suas refer�ncias para ele.
		Conta segundaConta = primeiraConta;
		
		//mostra a refer�ncia a primeira conta.
		System.out.println(segundaConta);
		
		//mostra o saldo da primeira conta, pois n�o foi instanciado um novo objeto para a segunda conta.
		System.out.println(segundaConta.saldo);
		
		//incrementar o valor do saldo da primeira conta utilizando a refer�ncia da segunda conta a este objeto.
		segundaConta.saldo += 100;
		System.out.println("segunda conta - saldo: " + segundaConta.saldo);
		
		//mostrando o valor do saldo do objeto da primeira conta, que tinha sido alterado pela refer�ncia da segunda conta.
		System.out.println("primeira conta - saldo: " + primeiraConta.saldo);
		
		//comparando as referencias ao objeto das vari�veis
		if(primeiraConta == segundaConta) {
			System.out.println("Refer�ncias iguais ao mesmo objeto");
		}
		
		Conta terceiraConta = new Conta();
		//comparando as referencias ao objeto das vari�veis
		if(primeiraConta == terceiraConta) {
			System.out.println("Refer�ncias iguais ao mesmo objeto");
		} else {
			System.out.println("Refer�ncias diferentes para outros objetos");
		}
	}
}

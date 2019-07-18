package funcionario_v2;

public class Teste {
	
	public static void main(String[] args) {
		Funcionario sabrina = new Funcionario();
		sabrina.setNome("Sabrina B. Moreira");
		sabrina.setCpf("000000000000");
		sabrina.setSalario(2500);
		
		System.out.println("Nome: " + sabrina.getNome());
		System.out.println("Sal�rio: " + sabrina.getSalario());
		System.out.println("Valor da bonifica��o: " + sabrina.getBonificacao());
		
		Funcionario alexander = new Funcionario();
		alexander.setNome("Alexander C. Becker");
		alexander.setCpf("111111111111");
		alexander.setSalario(3000);
		
		System.out.println("");
		System.out.println("Nome: " + alexander.getNome());
		System.out.println("Sal�rio: " + alexander.getSalario());
		System.out.println("Valor da bonifica��o: " + alexander.getBonificacao());
		
		Gerente liv = new Gerente();
		liv.setNome("Liv B. Becker");
		liv.setCpf("111111111111");
		liv.setSalario(5000);
		liv.setSenha(12345);
		
		System.out.println("");
		System.out.println("Nome: " + liv.getNome());
		System.out.println("Sal�rio: " + liv.getSalario());
		System.out.println("Valor da bonifica��o: " + liv.getBonificacao());
		System.out.println("Autenticado: " + liv.autentica(12345));
		
		//Polimorfismo
		//Utiliza��o de uma refer�ncia mais gen�rica: funciona pois o gerente � um tipo de funcion�rio, as fun��es ser�o somente as que existem em funcion�rio
		Funcionario func = new Gerente();
		
		Gerente gerenteTeste = new Gerente();
		gerenteTeste.setNome("Marcos");
		gerenteTeste.setSalario(1500);
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerenteTeste);
		System.out.println(controle.getSoma());
		
		Funcionario funcionarioTeste = new Funcionario();
		funcionarioTeste.setSalario(2000);
		controle.registra(funcionarioTeste);
		System.out.println(controle.getSoma());
		
		/*
		func.autentica();
		n�o funciona pois autentica est� no gerente, e n�o em funcion�rio.
		*/
	}

}

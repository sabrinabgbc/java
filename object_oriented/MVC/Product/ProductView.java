//� respons�vel por exibir os dados na tela
//ligado a classe produto pois o recebe como par�metro

package relationship;

public class ProductView {	
	public void show(Product product) {
		System.out.println("|-----------------|");
		System.out.println("|---- Product ----|");
		System.out.println("|-----------------|");
		System.out.println("|---- " + product.getName() + " ----|");
		System.out.println("|-----------------|");
		System.out.println("|-----------------|");
	}
}

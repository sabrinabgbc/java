package relacionamentos;

public class ProductDAO {
	//DAO data acess object, respons�vel em acessar o banco de dados
	
	public Product catchById(long id) {
		Product p = new Product();
		p.setName("Bonit�o");
		return p;
	}
}

//DAO data acess object, respons�vel em acessar o banco de dados

package relationship;

public class ProductDAO {
	
	public Product catchById(long id) {
		Product p = new Product();
		p.setName("Great name");
		return p;
	}
}

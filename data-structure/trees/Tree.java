import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.function.Consumer;

public class Tree<T> {
	private Node<T> Root;

	public Node<T> getRoot() {
		return Root;
	}

	public void setRoot(Node<T> root) {
		Root = root;
	}
	
	public void walkInTree(Node<T> node) {
		System.out.println(node.getValue());
		
		for(Node<T> children: node.getChildren()) {
			this.walkInTree(children);
		}
	}
	
	//busca por profundidade com recursividade
	public void goThrough(Node<T> node) {
		System.out.println(node.getValue());
		
		for(Node<T> children: node.getChildren()) {
			this.goThrough(children);
		}
	}
	
	//busca por profundidade sem recurs�o
		public void deep(Node<T> node) {
			Stack<Node<T>> stack = new Stack<Node<T>>();
			stack.push(node);
			
			while (!stack.isEmpty()) {
				node = stack.pop();
				System.out.println(node.getValue());
				
				for(int i = node.getChildren().size() -1; i >= 0; i--) {
					stack.push(node.getChildren().get(i));
				}
			}
		}
		
	public void goThrough() {
		this.goThrough(this.Root);
	}
	
	//busca por profundidade com lambda
	public void goThroughLambda(Node<T> node, Consumer<Node<T>> lamba) {
		lamba.accept(node);
		
		for(Node<T> children: node.getChildren()) {
			this.goThroughLambda(children, lamba);
		}
	}

	//busca por largura
	public void width(Node<T> node) {
		List<Node<T>> list = new ArrayList<Node<T>>();
		list.add(node);
		
		while(!list.isEmpty()) {
			node = list.remove(0);
			System.out.println(node.getValue());
			
			list.addAll(node.getChildren());
		}
	}
	
	/*
	busca em largura: quantos n�s existem?
	busca profundidade: n� folha com maior dist�ncia do n� raiz
	profundidade x largura: �rvores com pouca hierarquia podem se tornar listas, com um n�vel de largura e muita profundidade.
	N�meros baixos de compara��es por causa das podas
	
	busca em largura (BFS)
	Desce um n�vel hier�rquico, vai por todos os filhos nesse n�vel, depois desse ao n�vel abaixo desce e continua.
	
	busca em profundidade (DFS)
	Busca entre os os n�veis da �rvore.
	Come�a pela raiz entrando por um filho desta e percorrento todos os seus filhos at� encontrar o n� folha, depois sobre um n�vel e vai ao seu par e visita todos os seus filhos, e continua. 
	*/
}

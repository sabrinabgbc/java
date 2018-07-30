package sort;
//ordenar de forma crescente
//melhor caso vetor crescente
//pior caso descrescente
public class SelectionSort {
	public void sort(int[] vetor) {
		int i, j, min, aux, counter = 0;
		for(i = 0; i < vetor.length; i++) { //controla a vari�vel min
			min  = i;
			for(j = i + 1; j < vetor.length; j++) { //da posi��o min para frente quem � o menor?, faz a ordena��o	
				counter = counter +1;
				if(vetor[j] < vetor[min]) {
					min = j;
				}
			}
			counter = counter +1;
			if(vetor[i] != vetor[min]) { 
				counter = counter +1;
				aux = vetor[i];
				vetor[i] = vetor[min];
				vetor[min] = aux;
			}
		}
		System.out.println("Number of instructions: " + counter);
	}
	public void print(int[] vetor) {
		int i = 0;
		System.out.println("");
		System.out.println("Starting print...");
		for(i = 0; i < vetor.length; i++) { 
			System.out.println("value " + vetor[i] +  " of position: " + i);
		}
		System.out.println("End");
		System.out.println("");
	}
}

package bucketSort;

import java.util.Arrays;

/**
 * Classe concreta do tipo BucketSort
 * @author Neto
 *
 */
public class BucketSort {

	private int[] vetor;
	private int count;
	private static final int DOUBLE_SIZE = 2;

	public BucketSort(int tamanho) {
		vetor = new int[tamanho];
	}

	/**
	 * Metodo adiciona um valor do tipo inteiro ao vetor principal da aplicação
	 * @param i
	 */
	public void add(int i) {
		if (count == vetor.length) {
			duplicateSize();
		}
		vetor[count++] = i;
	}

	/**
	 * Metodo privado responsavel por dobrar o tramanho do vetor principal
	 */
	private void duplicateSize() {
		int[] copy = new int[DOUBLE_SIZE * vetor.length];
		for (int i = 0; i < vetor.length; i++) {
			copy[i] = vetor[i];
		}
		vetor = copy;
	}

	/**
	 * Metodo representando o algoritmo de ordenação bucket sort, ordena valores originalmente
	 * bagunçados em um vetor interno e depois organiza-os no vetor principal
	 */
	public void bucketSort() {
		int[] bucket = new int[count];

		//Inicializa o bucket(balde) com o valor 0
		for (int i = 0; i < bucket.length; i++) {
			bucket[i] = 0;
		}

		//Inclui os elemento (array) de cada posição (i) em um bucket(balde) diferente (++)
		//Ele vai na no valor do elemento e quando se está lá, incrementa (++)
		for (int i = 0; i < vetor.length; i++) {
			bucket[vetor[i]]++;
		}

		
		int outPos = 0;
		for (int i = 0; i < bucket.length; i++) {
			//Coloca todos elementos dos buckets (baldes) que não estão vazios no vetor original.
			//Observe a condição, enquanto j(que possui o valor 0) for menor que
			//O elemento na posição i ele adiciona no array original;
			for (int j = 0; j < bucket[i]; j++) {
				vetor[outPos++] = i;
			}
		}
	}
	
	/**
	 * Metodo representando o algoritmo de ordenação bucket sort, ordena valores originalmente
	 * bagunçados em um vetor interno e depois organiza-os no vetor principal. Ele descarta
	 * iterações desnecessárias que o metodo bucketSort faz.
	 */
	public void bucketSortOtimozado() {
		int[] bucket = new int[count];

		//Inicializa o bucket(balde) com o valor 0
		for (int i = 0; i < bucket.length; i++) {
			bucket[i] = 0;
		}

		//Inclui os elemento (array) de cada posição (i) em um bucket(balde) diferente (++)
		//Ele vai na no valor do elemento e quando se está lá, incrementa (++)
		for (int i = 0; i < vetor.length; i++) {
			bucket[vetor[i]]++;
		}
		
		int contador = 0;
		
		for(int i = 1; i < bucket.length; i++){
			if(bucket[i] > 0){
				contador++;
			}
		}
		
		int outPos = 0;
		for (int i = 0; i <= contador; i++) {
			//Coloca todos elementos dos buckets (baldes) que não estão vazios no vetor original.
			//Observe a condição, enquanto j(que possui o valor 0) for menor que
			//O elemento na posição i ele adiciona no array original;
			for (int j = 0; j < bucket[i]; j++) {
				vetor[outPos++] = i;
			}
		}
	}

	/**
	 * Mostra o estado atual do vetor principal
	 */
	public void showMeArray() {
		System.out.println(Arrays.toString(vetor));
		System.out.println();
	}
}

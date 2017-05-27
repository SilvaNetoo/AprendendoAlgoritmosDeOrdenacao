package bucketSort;

import java.util.Arrays;

public class BucketSort {

	private int[] array;
	private int count;
	private static final int DOUBLE_SIZE = 2;

	public BucketSort(int tamanho) {
		array = new int[tamanho];
	}

	public void add(int i) {
		if (count == array.length) {
			duplicateSize();
		}
		array[count++] = i;
	}

	private void duplicateSize() {
		int[] copy = new int[DOUBLE_SIZE * array.length];
		for (int i = 0; i < array.length; i++) {
			copy[i] = array[i];
		}
		array = copy;
	}

	public void bucketSort() {
		int[] bucket = new int[count];

		//Inicializa o bucket(balde) com o valor 0
		for (int i = 0; i < bucket.length; i++) {
			bucket[i] = 0;
		}

		//Inclui os elemento (array) de cada posição (i) em um bucket(balde) diferente (++)
		//Ele vai na no valor do elemento e quando se está lá, incrementa (++)
		for (int i = 0; i < array.length; i++) {
			bucket[array[i]]++;
		}

		
		int outPos = 0;
		for (int i = 0; i < bucket.length; i++) {
			//Coloca todos elementos dos buckets (baldes) que não estão vazios no vetor original.
			//Observe a condição, enquanto j(que possui o valor 0) for menor que
			//O elemento na posição i ele adiciona no array original;
			for (int j = 0; j < bucket[i]; j++) {
				array[outPos++] = i;
			}
		}
	}

	public void showMeArray() {
		System.out.println(Arrays.toString(array));
	}
}

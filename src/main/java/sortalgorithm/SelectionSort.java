package sortalgorithm;

public class SelectionSort {

	public static void main(String[] args) {

		int[] array = { 15, 35, -15, 7, 55, 1, -22 };

		for (int i = array.length - 1; i > 0; i--) {
			int max = 0;
			for (int j = 1; j <= i; j++) {
				if (array[j] > array[max]) {
					max = j;
				}
			}
			swap(array, i, max);
		}

		for (int i : array) {
			System.out.println(i);
		}

	}

	public static void swap(int[] ar, int i, int j) {

		if (i == j) {
			return;
		}
		int temp = ar[j];
		ar[j] = ar[i];
		ar[i] = temp;

	}

}

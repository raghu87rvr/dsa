package sortalgorithm;

public class BubbleSort {

	public static void main(String[] args) {

		int[] array = { 15, 35, -15, 7, 55, 1, -22 };

		for (int j = array.length - 1; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				if (array[i] > array[i + 1]) {
					swap(array, i, i + 1);
				}
			}
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

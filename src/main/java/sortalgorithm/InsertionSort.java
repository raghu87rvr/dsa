package sortalgorithm;

public class InsertionSort {

	public static void main(String[] args) {

		int[] array = { 15, 35, -15, 7, 55, 1, -22 };

		for (int uai = 1; uai < array.length; uai++) {
			int newElement = array[uai];
			int i;
			for (i = uai; i > 0 && array[i - 1] > newElement; i--) {
				array[i] = array[i - 1];
			}
			array[i] = newElement;
		}

		for (int i : array) {
			System.out.println(i);
		}
	}

}

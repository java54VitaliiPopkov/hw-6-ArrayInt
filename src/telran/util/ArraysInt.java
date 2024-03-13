package telran.util;

import java.util.Arrays;

public class ArraysInt {
	public static int[] addNumber(int[] array, int number) {
		int[] arrayNew = Arrays.copyOf(array, array.length + 1);
		arrayNew[arrayNew.length - 1] = number;
		return arrayNew;
	}

	public static int[] insertNumber(int[] array, int index, int number) {

		int[] arrayNew = new int[array.length + 1];
		System.arraycopy(array, 0, arrayNew, 0, index);
		arrayNew[index] = number;
		System.arraycopy(array, index, arrayNew, index + 1, array.length - index);
		return arrayNew;
	}

	public static int[] removeNumber(int[] array, int index) {
		int[] arrayNew = new int[array.length - 1];
		System.arraycopy(array, 0, arrayNew, 0, index);
		System.arraycopy(array, index + 1, arrayNew, index, array.length - index - 1);
		return arrayNew;
	}

	public static int[] insertSorted(int[] sortedArray, int number) {
		int index = Arrays.binarySearch(sortedArray, number);
		if (index < 0) {
			index = -(index + 1);
		}
		int[] arrayNew = new int[sortedArray.length + 1];
		System.arraycopy(sortedArray, 0, arrayNew, 0, index);
		System.arraycopy(sortedArray, index, arrayNew, index + 1, sortedArray.length - index);
		arrayNew[index] = number;
		return arrayNew;
	}

}

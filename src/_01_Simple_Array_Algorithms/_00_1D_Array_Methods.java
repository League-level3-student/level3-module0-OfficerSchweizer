package _01_Simple_Array_Algorithms;

public class _00_1D_Array_Methods {
	// 1. Complete the method so that it returns the sum of all
	// of the integers in the array being passed in

	public static void main(String[] args) {

		int[] asdf = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		System.out.println(getIndex(asdf, 50));

	}

	public static int sumIntArray(int[] values) {

		int sum = 0;

		for (int i = 0; i < values.length; i++) {

			sum += values[i];
		}

		return sum;
	}

	// 2. Complete the method so that it returns the average of all
	// of the integers in the array being passed in
	public static double averageIntArray(int[] values) {

		int sum = 0;

		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}

		return (sum / values.length);
	}

	// 3. Complete the method so that it returns true if the integer
	// array contains the value specified by the second parameter.
	// It should otherwise return false.
	public static boolean containsIntValue(int[] array, int value) {

		boolean hasInt = false;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				hasInt = true;
			}
		}

		return hasInt;
	}

	// 4. Complete the method so that it returns the index of the,
	// first instance that the specified value occurs in the array.
	// If the array does not contain the specified value, it should return -1.
	public static int getIndex(int[] arr, int value) {

		int currentIndex = 0;
		int valueIndex = -1;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == value) {
				valueIndex = currentIndex;
			}
			currentIndex++;
		}

		return valueIndex;
	}
}

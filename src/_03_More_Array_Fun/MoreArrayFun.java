package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.

	public static void main(String[] args) {
		MoreArrayFun morearrayfun = new MoreArrayFun();

		String[] asdf = { "A", "B", "C", "D", "E", "F" };

		morearrayfun.printArrayRandomly(asdf);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.

	void printArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.

	void printArrayBackwards(String[] array) {
		for (int i = array.length; i > 0; i--) {
			System.out.println(array[i - 1]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.

	void printEveryOtherString(String[] array) {

		int index = 0;

		for (int i = 0; i < array.length; i++) {

			if (index % 2 == 0) {
				System.out.println(array[i]);
			}
			index++;
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	
	void printArrayRandomly(String[] array) {
		
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			
			int index = rand.nextInt(5);
			
			System.out.println(array[index]);
		}
	}

}

package sortingAlgorithms;
import java.util.Arrays;

public class SearchingSortingLab {

	public static void main(String[] args) {

		// 1) Example data:

		int[] numbers = {42, 10, 7, 25, 30, 2, 20, 15};

		String[] words = {"banana", "apple", "mango", "cherry", "blueberry"};

		// 2) Library-based searching/sorting

		System.out.println("===== Using Java Library Methods =====");

		System.out.println("Original int array: " + Arrays.toString(numbers));

		Arrays.sort(numbers); // Sorting using Java's library

		System.out.println("Sorted int array: " + Arrays.toString(numbers));

		// Searching with Arrays.binarySearch

		int target = 25;

		int index = Arrays.binarySearch(numbers, target);

		System.out.println("Searching for " + target + ", found at index: " + index);

		System.out.println();

		System.out.println("Original String array: " + Arrays.toString(words));


		Arrays.sort(words);

		System.out.println("Sorted String array: " + Arrays.toString(words));


		// Searching objects with Arrays.binarySearch

		String targetWord = "mango";

		int wIndex = Arrays.binarySearch(words, targetWord);

		System.out.println("Searching for \"" + targetWord + "\", found at index: " +

				wIndex);

		// 3) TODO: Implement your own searching and sorting below

		System.out.println();

		System.out.println("===== Student Implementations =====");

		// ---- A) Sequential Search (13.3) ----

		// TODO: implement linearSearch below

		int seqIndex = linearSearch(numbers, 25);

		System.out.println("Sequential search for 25 returned index: " + seqIndex);

		// ---- B) Binary Search (Iterative) ----

		// TODO: implement binarySearchIter below

		int binIndex = binarySearchIter(numbers, 25);

		System.out.println("Iterative binary search for 25 returned index: " +

				binIndex);

		// ---- C) Binary Search (Recursive) ----

		// TODO: implement binarySearchRec below

		int recIndex = binarySearchRec(numbers, 25, 0, numbers.length - 1);

		System.out.println("Recursive binary search for 25 returned index: " +

				recIndex);

		// ---- D) Selection Sort (13.3) ----

		int[] numbersForSelection = {42, 10, 7, 25, 30, 2, 20, 15};

		// TODO: implement selectionSort below

		selectionSort(numbersForSelection);

		System.out.println("Selection-sorted array: " +

				Arrays.toString(numbersForSelection));

		// ---- E) Merge Sort (13.4) ----

		int[] numbersForMerge = {42, 10, 7, 25, 30, 2, 20, 15};

		// TODO: implement mergeSort below

		mergeSort(numbersForMerge);

		System.out.println("Merge-sorted array: " +

				Arrays.toString(numbersForMerge));

	}

	// =========================================================================

	// TODO SECTION: Students

	// =========================================================================

	// A) Implement a sequential (linear) search.

	// Return index of target or -1 if not found.

	public static int linearSearch(int[] arr, int target) {

		// TODO

		// pseudocode:

		// for i from 0 to arr.length - 1:

		// if arr[i] == target, return i
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == target) {
				return i;
			}
		}

		return -1; // placeholder

	}

	// B) Implement binary search (iterative).

	// Return index of target or -1 if not found.

	// Precondition: arr is sorted in non-decreasing order.

	public static int binarySearchIter(int[] arr, int target) {

		// TODO

		// min = 0, max = arr.length - 1

		// while min <= max:

		// mid = (min + max) / 2

		// if arr[mid] == target, return mid

		// else if arr[mid] < target, min = mid + 1

		// else, max = mid - 1
		int min = 0;
		int max = arr.length - 1;
		while (min <= max) {
			int mid = (min+max) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			else if (arr[mid] < target) {
				min = mid + 1;
			}
			else {
				max = mid + 1;
			}
		}

		return -1; // placeholder

	}

	// C) Implement binary search (recursive).

	// Return index of target or -1 if not found.

	// Precondition: arr is sorted in non-decreasing order.

	public static int binarySearchRec(int[] arr, int target, int min, int max) {

		// TODO

		// base case: if min > max, return -1

		// otherwise: mid = (min + max) / 2

		// if arr[mid] == target, return mid

		// else if arr[mid] < target, recurse on mid+1..max

		// else recurse on min..mid-1

		return -1; // placeholder

	}

	// D) Implement selection sort (in-place).

	// Sort arr in non-decreasing order.

	public static void selectionSort(int[] arr) {

		// TODO

		// for i in [0..arr.length-2]:

		// find index of smallest value from i..end

		// swap arr[i] and arr[smallestIndex]

	}

	// E) Implement merge sort (13.4).

	// Sort arr in an increasing order.

	public static void mergeSort(int[] arr) {

		// TODO

		// if array length >= 2:

		// split into left half & right half

		// mergeSort(left)

		// mergeSort(right)

		// merge(arr, left, right)

	}

	// E.1) Helper method: merges two sorted subarrays (left, right) into result

	private static void merge(int[] result, int[] left, int[] right) {

		// TODO

		// use two pointers i1, i2 to track position in left, right

		// fill result array by taking smaller of left[i1] vs right[i2]

		// if one side is exhausted, copy the remainder from the other side

	}
}

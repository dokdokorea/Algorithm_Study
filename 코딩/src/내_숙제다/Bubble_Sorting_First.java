package 내_숙제다;

import java.util.ArrayList;
import java.util.Random;

class bubbleBubble {
	private static int THOUSANDNUM = 1000;
	private static int TENTHOUSANDNUM = 10000;
	private static int ONEMILLIONNUM = 1000000;
	private int[] numberArr = { THOUSANDNUM, TENTHOUSANDNUM, ONEMILLIONNUM };
	Random rd;
	int cnt = 0;
	ArrayList<Integer> arrList = new ArrayList<Integer>();

	public bubbleBubble() {
		System.out.println(
				"       Random1000       Reverse1000       Random10000       Reverse10000       Random100000       Reverse100000");
		System.out.println();
		// System.out.print("Bubble");
		//
		// System.out.print(randomBubbleSortThousand());
		// System.out.print(reverseBubbleSortThousand());
		// System.out.print(randomBubbleSortTenThousand());
		// System.out.print(reverseBubbleSortTenThousand());
		//// System.out.print(randomBubbleSortOneMillion());
		//// System.out.print(reverseBubbleSortOneMillion());
		// System.out.println();
		// System.out.print("Selection");
		// System.out.print(randomSelectionSortThousand());
		// System.out.print(reverseSelectionSortThousand());
		// System.out.print(randomSelectionSortTenThousand());
		// System.out.print(reverseSelectionSortTenThousand());
		//// System.out.print(randomSelectionSortOneMillion());
		//// System.out.print(reverseSelectionSortOneMillion());
		//
		// System.out.println();
		// System.out.print("Insertion");
		// System.out.print(randomInsertionSortThousand());
		// System.out.print(reverseInsertionSortThousand());
		// System.out.print(randomInsertionSortTenThousand());
		// System.out.print(reverseInsertionSortTenThousand());
		//// System.out.print(randomInsertionSortOneMillion());
		//// System.out.print(reverseInsertionSortOneMillion());
		// System.out.println();
		// System.out.print("Merge");
		// System.out.print(randomMergeSortThousand());
		// System.out.print(reverseMergeSortThousand());
		// System.out.print(randomMergeSortTenThousand());
		// System.out.print(reverseMergeSortTenThousand());
		//// System.out.print(randomMergeSortOneMillion());
		//// System.out.print(reverseMergeSortOneMillion());
		//
		// System.out.println();
		// System.out.print("Quick1");
		// System.out.print(randomQuick1SortThousand());
		// System.out.print(reverseQuick1SortThousand());
		// System.out.print(randomQuick1SortTenThousand());
		// System.out.print(reverseQuick1SortTenThousand());
		//// System.out.print(randomQuick1SortOneMillion());
		//// System.out.print(reverseQuick1SortOneMillion());
		// System.out.println();
		// System.out.print("Quick2");
		// System.out.print(randomQuick2SortThousand());
		// System.out.print(reverseQuick2SortThousand());
		// System.out.print(randomQuick2SortTenThousand());
		// System.out.print(reverseQuick2SortTenThousand());
		//// System.out.print(randomQuick2SortOneMillion());
		//// System.out.print(reverseQuick2SortOneMillion());
		//
		// System.out.println();
		// System.out.print("Quick3");
		// System.out.print(randomQuick3SortThousand());
		// System.out.print(reverseQuick3SortThousand());
		// System.out.print(randomQuick3SortTenThousand());
		// System.out.print(reverseQuick3SortTenThousand());
		//// System.out.print(randomQuick3SortOneMillion());
		//// System.out.print(reverseQuick3SortOneMillion());
		System.out.println(randomStandardSortThousand());

	}

	private String randomStandardSortThousand() {
		int[] arr = new int[numberArr[0]];
		long start = System.currentTimeMillis();
		randomNumber(arr, arr.length);
		for (int i = 0; i < arr.length; i++) 
			arrList.add(arr[i]);
		arrList.sort(null);
		long end = System.currentTimeMillis();
		return " " + ((end - start) / 1000.0) + " ";
	}

	private String randomMaxHeapSortThousand() {
		int[] arr = new int[numberArr[0]];
		// for (int a = 0; a < arr.length; a++)
		// arr[a] = a;
		long start = System.currentTimeMillis();
		randomNumber(arr, arr.length);
		sort(arr);
		long end = System.currentTimeMillis();
		return " " + ((end - start) / 1000.0) + " ";
		// for (int i = 0; i < arr.length; i++)
		// System.out.println(arr[i]);
	}

	private String randomBubbleSortThousand() {
		int[] arr = new int[numberArr[0]];
		long start = System.currentTimeMillis();
		randomNumber(arr, arr.length);
		bubbleSort(arr, arr.length);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String randomSelectionSortThousand() {
		int[] arr = new int[numberArr[0]];
		long start = System.currentTimeMillis();
		randomNumber(arr, arr.length);
		selectionSort(arr, arr.length);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String randomInsertionSortThousand() {
		int[] arr = new int[numberArr[0]];
		long start = System.currentTimeMillis();
		randomNumber(arr, arr.length);
		insertionSort(arr, arr.length);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String randomMergeSortThousand() {
		int[] arr = new int[numberArr[0]];
		long start = System.currentTimeMillis();
		randomNumber(arr, arr.length);
		mergeSort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String randomQuick1SortThousand() {
		int[] arr = new int[numberArr[0]];
		long start = System.currentTimeMillis();
		randomNumber(arr, arr.length);
		quick1Sort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String randomQuick2SortThousand() {
		int[] arr = new int[numberArr[0]];
		long start = System.currentTimeMillis();
		randomNumber(arr, arr.length);
		quick2Sort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String randomQuick3SortThousand() {
		int[] arr = new int[numberArr[0]];
		long start = System.currentTimeMillis();
		randomNumber(arr, arr.length);
		quick3Sort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String reverseBubbleSortThousand() {
		int[] arr = new int[numberArr[0]];
		long start = System.currentTimeMillis();
		reverseNumber(arr, arr.length);
		bubbleSort(arr, arr.length);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String reverseSelectionSortThousand() {
		int[] arr = new int[numberArr[0]];
		long start = System.currentTimeMillis();
		reverseNumber(arr, arr.length);
		selectionSort(arr, arr.length);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String reverseInsertionSortThousand() {
		int[] arr = new int[numberArr[0]];
		long start = System.currentTimeMillis();
		reverseNumber(arr, arr.length);
		insertionSort(arr, arr.length);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String reverseMergeSortThousand() {
		int[] arr = new int[numberArr[0]];
		long start = System.currentTimeMillis();
		reverseNumber(arr, arr.length);
		mergeSort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String reverseQuick1SortThousand() {
		int[] arr = new int[numberArr[0]];
		long start = System.currentTimeMillis();
		reverseNumber(arr, arr.length);
		quick1Sort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String reverseQuick2SortThousand() {
		int[] arr = new int[numberArr[0]];
		long start = System.currentTimeMillis();
		reverseNumber(arr, arr.length);
		quick2Sort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String reverseQuick3SortThousand() {
		int[] arr = new int[numberArr[0]];
		long start = System.currentTimeMillis();
		reverseNumber(arr, arr.length);
		quick3Sort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String randomBubbleSortTenThousand() {
		int[] arr = new int[numberArr[1]];
		long start = System.currentTimeMillis();
		randomNumber(arr, arr.length);
		bubbleSort(arr, arr.length);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String randomSelectionSortTenThousand() {
		int[] arr = new int[numberArr[1]];
		long start = System.currentTimeMillis();
		randomNumber(arr, arr.length);
		selectionSort(arr, arr.length);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String randomInsertionSortTenThousand() {
		int[] arr = new int[numberArr[1]];
		long start = System.currentTimeMillis();
		randomNumber(arr, arr.length);
		insertionSort(arr, arr.length);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String randomMergeSortTenThousand() {
		int[] arr = new int[numberArr[1]];
		long start = System.currentTimeMillis();
		randomNumber(arr, arr.length);
		mergeSort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String randomQuick1SortTenThousand() {
		int[] arr = new int[numberArr[1]];
		long start = System.currentTimeMillis();
		randomNumber(arr, arr.length);
		quick1Sort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String randomQuick2SortTenThousand() {
		int[] arr = new int[numberArr[1]];
		long start = System.currentTimeMillis();
		randomNumber(arr, arr.length);
		quick2Sort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String randomQuick3SortTenThousand() {
		int[] arr = new int[numberArr[1]];
		long start = System.currentTimeMillis();
		randomNumber(arr, arr.length);
		quick3Sort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String reverseBubbleSortTenThousand() {
		int[] arr = new int[numberArr[1]];
		long start = System.currentTimeMillis();
		reverseNumber(arr, arr.length);
		bubbleSort(arr, arr.length);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String reverseSelectionSortTenThousand() {
		int[] arr = new int[numberArr[1]];
		long start = System.currentTimeMillis();
		reverseNumber(arr, arr.length);
		selectionSort(arr, arr.length);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String reverseInsertionSortTenThousand() {
		int[] arr = new int[numberArr[1]];
		long start = System.currentTimeMillis();
		reverseNumber(arr, arr.length);
		insertionSort(arr, arr.length);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String reverseMergeSortTenThousand() {
		int[] arr = new int[numberArr[1]];
		long start = System.currentTimeMillis();
		reverseNumber(arr, arr.length);
		mergeSort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String reverseQuick1SortTenThousand() {
		int[] arr = new int[numberArr[1]];
		long start = System.currentTimeMillis();
		reverseNumber(arr, arr.length);
		quick1Sort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String reverseQuick2SortTenThousand() {
		int[] arr = new int[numberArr[1]];
		long start = System.currentTimeMillis();
		reverseNumber(arr, arr.length);
		quick2Sort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String reverseQuick3SortTenThousand() {
		int[] arr = new int[numberArr[1]];
		long start = System.currentTimeMillis();
		reverseNumber(arr, arr.length);
		quick3Sort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String randomBubbleSortOneMillion() {
		int[] arr = new int[numberArr[2]];
		long start = System.currentTimeMillis();
		randomNumber(arr, arr.length);
		bubbleSort(arr, arr.length);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String randomSelectionSortOneMillion() {
		int[] arr = new int[numberArr[2]];
		long start = System.currentTimeMillis();
		randomNumber(arr, arr.length);
		selectionSort(arr, arr.length);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String randomInsertionSortOneMillion() {
		int[] arr = new int[numberArr[2]];
		long start = System.currentTimeMillis();
		randomNumber(arr, arr.length);
		insertionSort(arr, arr.length);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String randomMergeSortOneMillion() {
		int[] arr = new int[numberArr[2]];
		long start = System.currentTimeMillis();
		randomNumber(arr, arr.length);
		mergeSort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String randomQuick1SortOneMillion() {
		int[] arr = new int[numberArr[2]];
		long start = System.currentTimeMillis();
		randomNumber(arr, arr.length);
		quick1Sort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String randomQuick2SortOneMillion() {
		int[] arr = new int[numberArr[2]];
		long start = System.currentTimeMillis();
		randomNumber(arr, arr.length);
		quick2Sort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String randomQuick3SortOneMillion() {
		int[] arr = new int[numberArr[2]];
		long start = System.currentTimeMillis();
		randomNumber(arr, arr.length);
		quick3Sort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String reverseBubbleSortOneMillion() {
		int[] arr = new int[numberArr[2]];
		long start = System.currentTimeMillis();
		reverseNumber(arr, arr.length);
		bubbleSort(arr, arr.length);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String reverseSelectionSortOneMillion() {
		int[] arr = new int[numberArr[2]];
		long start = System.currentTimeMillis();
		reverseNumber(arr, arr.length);
		selectionSort(arr, arr.length);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String reverseInsertionSortOneMillion() {
		int[] arr = new int[numberArr[2]];
		long start = System.currentTimeMillis();
		reverseNumber(arr, arr.length);
		insertionSort(arr, arr.length);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String reverseMergeSortOneMillion() {
		int[] arr = new int[numberArr[2]];
		long start = System.currentTimeMillis();
		reverseNumber(arr, arr.length);
		mergeSort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String reverseQuick1SortOneMillion() {
		int[] arr = new int[numberArr[2]];
		long start = System.currentTimeMillis();
		reverseNumber(arr, arr.length);
		quick1Sort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String reverseQuick2SortOneMillion() {
		int[] arr = new int[numberArr[2]];
		long start = System.currentTimeMillis();
		reverseNumber(arr, arr.length);
		quick2Sort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private String reverseQuick3SortOneMillion() {
		int[] arr = new int[numberArr[2]];
		long start = System.currentTimeMillis();
		reverseNumber(arr, arr.length);
		quick3Sort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		return "     " + ((end - start) / 1000.0) + "     ";
	}

	private void randomNumber(int[] arr, int no) {
		rd = new Random();

		for (int i = 0; i < no; i++) {
			arr[i] = rd.nextInt(no);
		}
	}

	private void reverseNumber(int[] arr, int no) {
		int normalNo = 1;
		for (int i = no; i > 0; i--) {
			arr[i - 1] = normalNo;
			normalNo++;
		}
	}

	private void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private void bubbleSort(int[] array, int N) {
		for (int a = 0; a < N; a++) {
			for (int i = 0; i < N - 1; i++) {
				if (array[i] > array[i + 1]) {
					swap(array, i, i + 1);
				}
			}
		}
	}

	private void selectionSort(int[] array, int N) {
		int maxIndex = 0;
		for (int a = 0; a <= N + 1; a++) {
			for (int i = 0; i < N - 1; i++)
				if (array[i] > array[maxIndex])
					maxIndex = i;
			swap(array, maxIndex, N - 1);
			N--;
		}

	}

	private void insertionSort(int[] array, int N) {
		int minNum = 0;
		for (int a = 0; a < N - 1; a++) {
			for (int i = 1; i < N; i++) {
				if (array[i] < array[i - 1])
					swap(array, i, i - 1);
			}
		}
	}

	private void mergeSort(int[] array, int start, int end) {
		int half;
		if (start < end) {
			half = (start + end) / 2;
			mergeSort(array, start, half); // 전반부 정렬
			mergeSort(array, half + 1, end); // 후반부 정렬
			merge(array, start, end, half);
		}
	}

	private void merge(int[] array, int start, int end, int half) {
		int[] sortedArr = new int[array.length];
		int i = start;
		int j = half + 1;
		int k = start;

		while (i <= half && j <= end) {
			if (array[i] <= array[j]) {
				sortedArr[k] = array[i];
				i++;
			} else {
				sortedArr[k] = array[j];
				j++;
			}
			k++;
		}
		while (j <= end) {
			sortedArr[k++] = array[j++];
		}
		while (i <= half) {
			sortedArr[k++] = array[i++];
		}

		for (int z = start; z <= end; z++)
			array[z] = sortedArr[z];
	}

	private void quick1Sort(int[] array, int start, int end) { // 마지막 값을 피봇으로 선택

		if (start < end) {
			int q = partition(array, start, end); // 분할
			quick1Sort(array, start, q - 1); // 왼쪽 부분배열 정렬
			quick1Sort(array, q + 1, end); // 오른쪽 부분배열 정렬
		}
	}

	private int partition(int[] array, int start, int end) {
		int pivotPointer = end;
		int i = -1;
		int j = 0;

		for (j = 0; j < end; j++) {

			if (array[j] <= array[pivotPointer]) {
				i++;
				swap(array, j, i);
			}
		}
		if (j == end) {
			i++;
			swap(array, j, i);
		}
		return i;
	}

	private void quick2Sort(int[] array, int start, int end) { // 첫 번째 값, 가운데 위치의 값, 그리고 마지막 값 중에서 중간값을 pivot으로 선택
		if (start < end) {
			int q = partition2(array, start, end); // 분할
			quick2Sort(array, start, q - 1); // 왼쪽 부분배열 정렬
			quick2Sort(array, q + 1, end); // 오른쪽 부분배열 정렬
		}
	}

	private int partition2(int[] array, int start, int end) {
		int half = (start + end) / 2;
		int pivotPointer = end;
		int i = -1;
		int j = 0;
		swap(array, half, pivotPointer);

		for (j = 0; j < end; j++) {
			if (array[j] <= array[pivotPointer]) {
				i++;
				swap(array, j, i);
			}
		}
		if (j == end) {
			i++;
			swap(array, j, i);
		}
		return i;
	}

	private void quick3Sort(int[] array, int start, int end) { // pivot을 랜덤하게 선택
		if (start < end) {
			int q = partition3(array, start, end); // 분할
			quick3Sort(array, start, q - 1); // 왼쪽 부분배열 정렬
			quick3Sort(array, q + 1, end); // 오른쪽 부분배열 정렬
		}
	}

	private int partition3(int[] array, int start, int end) {
		Random rand = new Random();
		int randomIndex = rand.nextInt((end + 1) - start);
		randomIndex += start;
		int pivotPointer = end;
		int i = -1;
		int j = 0;
		swap(array, randomIndex, pivotPointer);

		for (j = 0; j < end; j++) {
			if (array[j] <= array[pivotPointer]) {
				i++;
				swap(array, j, i);
			}
		}
		if (j == end) {
			i++;
			swap(array, j, i);
		}
		return i;
	}

	public void sort(int arr[]) {
		int n = arr.length;

		// Build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);

		// One by one extract an element from heap
		for (int i = n - 1; i >= 0; i--) {
			// Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// call max heapify on the reduced heap
			heapify(arr, i, 0);
		}
	}

	// To heapify a subtree rooted with node i which is
	// an index in arr[]. n is size of heap
	void heapify(int arr[], int n, int i) {
		int largest = i; // Initialize largest as root
		int l = 2 * i + 1; // left = 2*i + 1
		int r = 2 * i + 2; // right = 2*i + 2

		// If left child is larger than root
		if (l < n && arr[l] > arr[largest])
			largest = l;

		// If right child is larger than largest so far
		if (r < n && arr[r] > arr[largest])
			largest = r;

		// If largest is not root
		if (largest != i) {
			swap(arr, i, largest);

			// Recursively heapify the affected sub-tree
			heapify(arr, n, largest);
		}
	}

}

public class Bubble_Sorting_First {

	public static void main(String[] args) {
		bubbleBubble bubbleSorting = new bubbleBubble();
	}

}

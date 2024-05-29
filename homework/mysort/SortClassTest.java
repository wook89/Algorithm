package mysort;

import mysort.BubbleSort;
import mysort.InsertionSort;
import mysort.MergeSort;
import mysort.QuickSort;
import mysort.SelectionSort;

public class SortClassTest {

	public static void main(String[] args) {
		int[] dataList = { 5, 21, 14, 3, 31, 8, 27, 15 };
		// String[] dataList = {"abc", "ssssss", "wwerafd"};
		sortData(dataList);
	}

	static void sortData(int[] dataList) {
		Sort sort;

		sort = new SelectionSort();
		sort.sort(dataList);
		System.out.printf("%-20s %s\n", "Input Data", sort.getOrgData());
		System.out.printf("%-20s %s\n", sort.getClass().getSimpleName() + " Result", sort.getSortedData());
		System.out.println();

		sort = new InsertionSort();
		sort.sort(dataList);
		System.out.printf("%-20s %s\n", "Input Data", sort.getOrgData());
		System.out.printf("%-20s %s\n", sort.getClass().getSimpleName() + " Result", sort.getSortedData());
		System.out.println();

		sort = new BubbleSort();
		sort.sort(dataList);
		System.out.printf("%-20s %s\n", "Input Data", sort.getOrgData());
		System.out.printf("%-20s %s\n", sort.getClass().getSimpleName() + " Result", sort.getSortedData());
		System.out.println();

		sort = new MergeSort();
		sort.sort(dataList);
		System.out.printf("%-20s %s\n", "Input Data", sort.getOrgData());
		System.out.printf("%-20s %s\n", sort.getClass().getSimpleName() + " Result", sort.getSortedData());
		System.out.println();

		sort = new QuickSort();
		sort.sort(dataList);
		System.out.printf("%-20s %s\n", "Input Data", sort.getOrgData());
		System.out.printf("%-20s %s\n", sort.getClass().getSimpleName() + " Result", sort.getSortedData());
		System.out.println();
	}
}
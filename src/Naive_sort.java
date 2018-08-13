package src;

import java.io.*;
import java.util.*;

public class Naive_sort<E> {

	public static void main(String[] args) {
		int intArray[] = new int[] { 1, 3, 5, 7, 10 };
		int intArrayTwo[] = new int[] { 2, 4, 6, 8, 9 };
		ArrayList<int[]> array = new ArrayList<int[]>();
		array.add(intArray);
		array.add(intArrayTwo);
		Sorter(array);
	}

	// Aim of this method is to return a sorted list like
	// int[]{1,2,3,4,5,6,7,8,9,10}
	public static void Sorter(ArrayList<int[]> array) {
		// concat and sort
		List<Integer> result = new ArrayList<>();
		for (int[] list : array) {
			for (int x : list) {
				result.add(x);
			}
		}
		// mergeSort(result , 0, result.size() - 1) maybe ?
		// radix sort maybe ?
		// bubble sort maybe ?
		// but i will just do sort cause why waste time implementing it.
		Collections.sort(result, (a, b) -> a.compareTo(b));
		System.out.println(result.toString());
	}
}

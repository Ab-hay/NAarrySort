package src;

import java.io.*;
import java.util.*;

public class MinHeapSort_PQ<E> {

	public static void main(String[] args) {
		int intArray[] = new int[] { 88, 3, 5, 7, 100 };
		int intArrayTwo[] = new int[] { 2, 4, 63, 8, 9 };
		int intArrayThree[] = new int[] { 1, 42, 16, 8, 9 };
		ArrayList<int[]> array = new ArrayList<int[]>();
		array.add(intArray);
		array.add(intArrayTwo);
		array.add(intArrayThree);
		Sorter(array);
	}

	public static void Sorter(ArrayList<int[]> array) {
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		List<Integer> resultNew = new ArrayList<Integer>();
		for (int[] list : array) {
			for (int x : list) {
				pQueue.add(x);
			}
		}
		while(!pQueue.isEmpty()){
			int top = pQueue.peek();
			resultNew.add(top);
			pQueue.remove(top);
		}
		System.out.print(resultNew.toString());
	}
}

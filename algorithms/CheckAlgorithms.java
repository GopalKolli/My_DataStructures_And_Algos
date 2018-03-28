package com.job.prep.algorithms;

public class CheckAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Algorithms al = new Algorithms();
		//int[] Arr = {1,56,7,435,23,90,5,36,43,12,789,45,0};
		/*int[] result = al.mergeSort(Arr);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}*/
		/*int[] Arr = {2,4,6,7,9,34,56,78,79,123,234,456,678};
		System.out.println(al.binarysearch(Arr, 56));*/
		
		int[] A = {4,2};
		QuickSort q = new QuickSort(A);
		for(int i : q.arr){
			System.out.println(i);
		}
		
	}

}

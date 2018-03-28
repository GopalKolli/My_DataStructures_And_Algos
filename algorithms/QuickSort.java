package com.job.prep.algorithms;

public class QuickSort {

	int[] arr;
	
	public QuickSort(int[] A){
		arr = A;
		sort(0, arr.length-1);
	}
	
	private void sort(int left, int right){
		if(!(right-left >= 1)){
			return;
		}else{
			int q = partition(left,right);
			sort(left,q-1);
			sort(q+1,right);
		}
	}
	
	private int partition(int left, int right){
		
		int pivot = arr[right];
		int i = left;
		int j = right-1;
		
		while(true){
		while(arr[i]<pivot){
			i++;
		}
		while(arr[j]>pivot && j>0){
			j--;
		}
		
		if(i>=j){
			break;
		}
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		}
		
		int temp = arr[i];
		arr[i] = pivot;
		arr[right] = temp;
		
		return i;
	}
	
}

package com.job.prep.algorithms;

public class Algorithms {

	//Sorting Algorithms
	public int[] mergeSort(int[] Arr){
		if(Arr.length==1){
			return Arr;
		}else{
			int[] leftArr = new int[Arr.length/2];
			int[] rightArr = new int[Arr.length-(Arr.length/2)];
			System.arraycopy(Arr, 0, leftArr, 0, leftArr.length);
			System.arraycopy(Arr, leftArr.length, rightArr, 0, rightArr.length);
			int[] leftresult = mergeSort(leftArr);
			int[] rightresult = mergeSort(rightArr);
			int[] finalresult = merge(leftresult,rightresult);
			return finalresult;
		}
	}
	private int[] merge(int[] leftArr, int[] rightArr){
		int[] result = new int[leftArr.length+rightArr.length];
		int i=0,j=0,k=0;
		while(i!=leftArr.length && j!=rightArr.length){
			if(leftArr[i]>rightArr[j]){
				result[k]=rightArr[j];
				j++;
				k++;
			}else{
				result[k]=leftArr[i];
				i++;
				k++;
			}
		}
		
		while(i!=leftArr.length){
			result[k]=leftArr[i];
			i++;
			k++;
		}
		
		while(j!=rightArr.length){
			result[k]=rightArr[j];
			j++;
			k++;
		}
		
		return result;
	}
	
	/*public int[] matrixMultiply(int[] matrix1, int[] matrix2){
		if(matrix1.length==1){
			int[] res=new int[1];
			res[0]=matrix1[0]*matrix2[0];
			return res;
		}else{
			
			//Use a two dimensional array
		}*/
	
	
	
	
	public int binarysearch(int[] Arr, int num){
		
		int low=0;
		int high=Arr.length-1;
		int index = -1;
		
		while(true){
			
			if(high<low){
				break;
			}
			int mid = low+(high-low)/2;
			
			if(num<Arr[mid]){
				high=mid-1;
			}else if(num>Arr[mid]){
				low=mid+1;
			}else{
				index=mid;
				break;
			}
			
		}
		return index;
	}
	
	
}

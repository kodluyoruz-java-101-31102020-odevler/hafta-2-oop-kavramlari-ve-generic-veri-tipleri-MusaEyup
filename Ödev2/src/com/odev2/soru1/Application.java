package com.odev2.soru1;

import java.util.Arrays;



public class Application {

	public static void main(String[] args) {
		
		int [][] matris = { new int[] {1,2,3,4,5},
							new int[] {16,17,18,19,6},
							new int[] {15,24,25,20,7},
							new int[] {14,23,22,21,8},
							new int[] {13,12,11,10,9}
							};

		int[] sortedArray = new int[25];
		int index = 0;
		for (int i = 0; i < matris.length; i ++) {
			for( int j = 0 ; j < matris[i].length; j++ ) {
				sortedArray[index] = matris[i][j];
				index++;
			}
		}
		
		Arrays.sort(sortedArray);
		for(int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ");
		}
	}

}

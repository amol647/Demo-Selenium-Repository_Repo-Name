package testJavaTrainingPackage;

import java.util.Arrays;

public class ReverseAndStoreInSameArray {

	public static void main(String[] args) {
		
		int arr[] = {51, 1, 2, 3, 4};
		
		Arrays.copyOf(arr, 4);
		System.out.println(Arrays.toString(arr));
		
	}
	
}

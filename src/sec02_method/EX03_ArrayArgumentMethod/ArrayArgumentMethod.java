package sec02_method.EX03_ArrayArgumentMethod;

import java.util.Arrays;

public class ArrayArgumentMethod {
	public static void main(String[] args) {
		
		//배열을 매개변수로 가지는 메서드 호출
//		int[] a = new int[] {1,2,3};
//		printArray(a);
		printArray(new int[] {1,2,3});
		
		//printArray({1,2,3}); //오류
		
	}
	
	public static void printArray(int[] a) {
//		int[] a;
//		a=new int[] {1,2,3};
		
//		int[] a;
//		a={1,2,3};
		System.out.println(Arrays.toString(a));
	}
}

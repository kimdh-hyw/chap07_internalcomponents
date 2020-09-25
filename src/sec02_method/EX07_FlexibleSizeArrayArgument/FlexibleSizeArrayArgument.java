package sec02_method.EX07_FlexibleSizeArrayArgument;

import java.util.Arrays;

public class FlexibleSizeArrayArgument {
	public static void main(String[] args) {
		
		//#1.
		method1(1,2);
		method1(1,2,3);
		method1();
		
		//#2.
		method2("안녕", "방가");
		method2("땡큐", "베리", "감사");
		method2();
		
	}
	
	public static void method1(int...values) { //가변길이 배열
		System.out.println("배열의 길이: " + values.length);
		
//		for(int i=0; i<values.length; i++) {
//			System.out.print(values[i]+" ");
//		}
		for(int k: values) {
			System.out.print(k+" ");
		}
		//System.out.println(Arrays.toString(values));
		System.out.println();		
	}
	
	public static void method2(String...values) { //가변길이 배열
		System.out.println("배열의 길이: " + values.length);
		
//		for(int i=0; i<values.length; i++) {
//			System.out.print(values[i]+" ");
//		}
		for(String k: values) {
			System.out.print(k+" ");
		}
		//System.out.println(Arrays.toString(values));
		System.out.println();		
	}
	
//	public static void method1() {
//		
//	}
//	public static void method1(int a, int b) {
//		
//	}
//	public static void method1(int a, int b, int c) {
//		
//	}
}

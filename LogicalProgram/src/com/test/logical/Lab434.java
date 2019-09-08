package com.test.logical;

public class Lab434 {
	public static void main(String args[]){
		int arr[];
		arr=new int[3];
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		System.out.println("-----");
		arr[0]=20;
		arr[1]=30;
		arr[2]=40;
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}

}

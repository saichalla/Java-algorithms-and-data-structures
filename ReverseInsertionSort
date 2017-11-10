package practise;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseInsertionSort {

	static int[] insertSort(int[] a)
	{
		int i=0,j=0,key;
		for(i=1;i<a.length;i++)
		{
			key=a[i];
			for(j=i-1;j>=0&&a[j]<key;j--)
			{
				a[j+1]=a[j];
			}
			a[j+1]=key;
		}
		return a;
	}
	
	public static void main(String[] args) {
		int b[],i;
		try(Scanner sc=new Scanner(System.in)){
		System.out.println("Enter the size of the array");
		i=sc.nextInt();
		b=new int[i];
		System.out.println("Enter array elements");
		for(int j=0;j<i;j++)
			b[j]=sc.nextInt();
		System.out.println("Array after sorting");
		System.out.print(Arrays.toString(insertSort(b)));}
	}

}

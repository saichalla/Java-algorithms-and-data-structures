
public class BubbleSort {

	public int[] BubSort(int[] a)
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
}

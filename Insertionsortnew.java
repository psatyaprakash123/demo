import java.util.*;
import java.lang.*;
class Insertionsortnew{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int n=arr.length;
		//insertion sort logic
		for(int i=1;i<n;i++){
			int key=arr[i];
			int j=i-1;
			while(j>=0 && key<arr[j]){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
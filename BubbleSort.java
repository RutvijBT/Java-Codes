package IterviewCodes;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={6,5,1,3,2};
		int[] result=bubble_sort(a);
		for(int i=0;i<result.length;++i){
			System.out.print(result[i]+" ");
		}

	}
	public static int[] bubble_sort(int[] arr){
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-1-1;j++){
				if(arr[j]>arr[j+1]){
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}

			}

		}
		return arr;
	}
}

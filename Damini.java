class Damini{
static void reverseArray(int arr[], int start,int end){
	int temp;
	while(start<end){
		temp = arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
	System.out.println();
}

static void printArray(int arr[],int size){
	for (int i=0;i<size ;i++ ) 
		System.out.print(arr[i]+" ");
	System.out.println();
}
public static void main(String[] args) {
		//initialize to array
		int arr[]= {3,4,5,6,9,10};
		//call to printArray method
		printArray(arr,6);
		//daminigautam455@gamil.com
		reverseArray(arr,0,5);
		
		System.out.print("value of array: \n");
		printArray(arr,6);
	}	
}

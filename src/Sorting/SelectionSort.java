package Sorting;

public class SelectionSort {

    static void selectionsort(int[]arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){  // i represents the current index
            //find the minimum element in unsorted part of the array
            int min_index = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            //swap current element and minimum index
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;

        }
    }
    public static void main(String[] args) {
        int[]arr = {7,4,3,6,2};
        selectionsort(arr);
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}

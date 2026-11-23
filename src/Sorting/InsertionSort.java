package Sorting;

public class InsertionSort {
    static void insertionsort(int[]arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr = {7,4,3,6,2};
        insertionsort(arr);
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}

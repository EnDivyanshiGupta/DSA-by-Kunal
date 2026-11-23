package Sorting;
public class BubbleSort {
    static void bubbleSort(int[]arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){     //move from it1 to it2 to itn-1
            boolean flag = false;  //has any swapping happened
            for(int j=0; j<n-i-1; j++){  //for internal swaping

                /*
                last i elements are already at correct sorted elements,
                so need to check them. thats why j ko n-i-1 tak le jaa rhe h
                 */
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true; //swapping happened
                }
            }
            if(flag == false){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr = {7,6,3,4,5};
        bubbleSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}





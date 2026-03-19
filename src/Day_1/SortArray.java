package Day_1;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int arr[] = {22,33,442,12,3,3,4,5566,67,7};
        for(int i =0;i< arr.length-1;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }System.out.println(Arrays.toString(arr));
    }
}


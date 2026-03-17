package Day_1;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,42,3,4,32};
        int a = 0, b=arr.length-1;
        while (a<b){
            int temp = a-arr[a];
            arr[a]=arr[b];
            arr[b]=temp;

            a++;
            b--;
        }
        System.out.println(Arrays.toString(arr));

    }
}


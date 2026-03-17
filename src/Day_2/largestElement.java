package Day_2;

public class largestElement {
    int largest(){
        int arr[] = {21,2,34,44,23,4,56,7};

        int max = arr[0];
        for(int i = 0;i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;



    }

    public static void main(String[] args) {
        largestElement element = new largestElement();
        System.out.println(element.largest());
    }
}
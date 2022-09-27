//Java code for linearly searching x in arr[]. If x is present then return its 
//location, otherwise return -1
import java.util.Arrays;

public class Linear_Search {

    public static int search(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        int x = 175; 
        System.out.print(
                    "Array: "+  Arrays.toString(arr) +"\t\t Key: "+ x+"\n\n" );
        // Function call
        int result = search(arr, x);
        if (result == -1) {
            System.out.print(
                    "Element is not present in array \n");
        } else {
            System.out.print("Element is present at index "
                    + result +"\n\n");
        }
    }
}


import java.util.*;

public class Main {
    public static void printArray(int[] arr) {
      for(int i=0; i < arr.length; i++){
        System.out.print(arr[i]+"");
      }
      System.out.println();
    }
    
    public static void main(String[] args) {
      // Bubble sort - Push the largest element to the last
      int[] arr = {7,8,3,1,2};

      for(int i = 0; i < arr.length-1; i++)  {
        System.out.println("Value of i: "+i);
        for(int j=0; j < arr.length-i-1; j++) {
          if(arr[j] < arr[j+1]){
            int temp = arr[j];
            arr[j]  = arr[j+1];
            arr[j+1] =  temp;
          }
        }
      }
      printArray(arr);
    }
}

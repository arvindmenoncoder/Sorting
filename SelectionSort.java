import java.util.*;

public class Main {
    public static void printArray(int[] arr) {
      for(int i=0; i < arr.length; i++){
        System.out.print(arr[i]+"");
      }
      System.out.println();
    }
    
    public static void main(String[] args) {
      // Selection sort - Consider a smallest element and get smallest element first
       int[] arr = {7,8,3,1,2};
       for(int i=0; i<arr.length-1;i++){
         int smallest = i;
         for(int j=i+1; j<arr.length; j++){
           if(arr[smallest] > arr[j])
           {
             smallest = j;
           }
         }
         int temp = arr[i];
         arr[i] =  arr[smallest];
         arr[smallest] = temp;
       }
       printArray(arr);
    }
}


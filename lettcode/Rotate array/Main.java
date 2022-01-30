import java.util.Arrays;

/*
Lettcode 189.Rotate Array
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/
class Main{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[]arr,int k){
        reverse(arr, 0, arr.length-1);  //Ist Reverse the total array
        reverse(arr, 0, k-1);  //Reverse till k from 0
        reverse(arr, k, arr.length-1); //reverse from k to length-1 //Then we get Our Roatedarray
    }
    public  static void reverse( int arr[],int s,int e){
        if(s>e){
            return;
        }
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
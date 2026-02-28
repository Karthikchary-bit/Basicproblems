import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args){
        int arr[][] = { {1,2,3},
                        {4,5,6},
                        {7,8,9}
        };
        int tar =6;
        int[] ans = search(arr,tar);
        System.out.println(Arrays.toString(ans));
        System.out.println(Max(arr));


    }
    public static int[] search(int arr[][],int target){
        for(int row =0;row< arr.length;row++){
            for(int col =0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row ,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static int Max(int arr[][]){
        int max=Integer.MIN_VALUE;
        for(int row =0;row< arr.length;row++){
            for(int col =0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max=arr[row][col];

                }
            }
        }
        return max;
    }
}

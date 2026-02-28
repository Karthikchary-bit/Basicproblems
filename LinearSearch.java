public class Main {
    public static void main(String[] args){
        int[] nums ={1,2,3,4,5,6,7,8};
        int target = 4;
        String name = "Karthik";
        char letter = 'z';
        int start=1;
        int end =6;
        System.out.println(linearSearchString(name,letter));


        System.out.println(linearSearchElement(nums,target));
        System.out.println(linearSearchInRange(nums,6,start,end));
    }

    public static int linearSearchElement(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i = 0;i<=arr.length;i++){
            if(arr[i]==target){
                int element = arr[i];
                return element;
            }
        }
        return -1;
    }
    public static boolean linearSearchString(String arr,char target){
        if(arr.length()==0){
            return false;
        }
        for(int i =0;i<arr.length();i++){
            if(arr.charAt(i)==target){
                return true;
            }

        }
        return false;
    }
    public static boolean linearSearchString2(String arr,char target){
        if(arr.length()==0){
            return false;
        }
        for(char ele : arr.toCharArray()){
            if(ele==target){
                return true;
            }

        }
        return false;
    }
    public static int linearSearch(int[] arr,int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static int linearSearchInRange(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i = start;i<=end;i++){
            if(arr[i]==target){
                int ele = arr[i];
                return ele;
            }
        }
        return -1;
    }
}
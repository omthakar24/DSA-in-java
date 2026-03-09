package ArrayProblems;

public class BinarySearch {
    static int Bih(int k,int[]arr,int low,int high){
       
        if(low > high){
    return -1;
}
 int mid = (low+high)/2;    
        if(arr[mid]==k){
            return mid;
        }
        else if(arr[mid]>k){
            return Bih(k,arr,low,mid-1);
        }
        else{
            return Bih(k,arr,mid+1,high);
        }
        

    }
    public static void main(String[] args) {
        int low = 0;
        int arr[] = {1,2,3,4,5,6};
        int high = arr.length-1;
        int k = 6;
        System.out.println(Bih(k,arr,low,high));
    }
}

package Sorting;

public class Merge {
    static void merge(int[] arr,int low,int mid,int high){
        int left = low;
        int right = mid+1;
        int[] temp = new int[high-low+1];
        int k =0;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp[k]=arr[left];
                left++;
                k++;
            }else{
                temp[k]=arr[right];
                right++;
                k++;
            }
            
        }while(left<=mid){
            temp[k]=arr[left];
            left++;
            k++;
        }
        while(right<=high){
            temp[k]=arr[right];
            right++;
            k++;
        }
       for(int i = 0; i < temp.length; i++){
         arr[low + i] = temp[i];
}
    }
    static void mergeSort(int[] arr,int low, int high){
        if(low==high){
            return;
        }
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void main(String[]args){
        int[] arr = {50,50,50,10,40,30,20,10};
        mergeSort(arr, 0, arr.length-1);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

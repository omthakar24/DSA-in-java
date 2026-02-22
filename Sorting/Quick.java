package Sorting;
import java.util.*;


public class Quick {
    static int pivot(ArrayList<Integer> arr,int low,int high){
        int pivot = arr.get(low);
        int i = low;
        int j = high;
        while(i<j){
            while(i < high && arr.get(i) <= pivot){
                i++;
            }
            while(j > low && arr.get(j) > pivot){
                j--;
            }
            if(i<j){
                int temp = arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);
            }
        }
            int temp = arr.get(low);
            arr.set(low,arr.get(j));
            arr.set(j,temp);
        return j;
    }
    static void quickSort(ArrayList<Integer> arr,int low,int high){
        if(low<high){
            int pivotindex = pivot(arr,low,high);
            quickSort(arr, low, pivotindex-1);
            quickSort(arr,pivotindex+1,high);
        }return;
}
    public static void main(String []args){
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            arr.add(sc.nextInt());
        }
        sc.close();
        int low = 0;
        int high = arr.size()-1;
        quickSort(arr, low, high);
        for(int i =0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }

    }
}

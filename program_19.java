import java.util.*;
public class program_19
{ 
 public static void main(String[] args) 
 { 
     Scanner sc=new Scanner (System.in);
     System.out.println("Enter length of the array");
     int len=sc.nextInt();
     int x[] = new int [len];
     System.out.println("Enter the array elements");
     for(int i =0;i<len;i++)
     x[i]=sc.nextInt();
     System.out.println("Array before sorting:"); 
    int i; 
 for(i=0;i<x.length;i++)
 { 
 System.out.println(x[i]); 
 } 
 int low = 0; 
 int high = x.length - 1;
 
 quickSort(x, low, high); 
 System.out.println("Array after sorting:"); 
 for(i=0;i<x.length;i++)
 { 
 System.out.println(x[i]);
 } 
 } 
 public static void quickSort(int[] arr, int low, int high) { 
 if (arr == null || arr.length == 0) 
 return; 
 
 if (low >= high) 
 return; 
 
 // pick the pivot 
 int middle = low + (high - low) / 2; 
 int pivot = arr[middle]; 
 
 // make left < pivot and right > pivot 
 int i = low, j = high; 
 while (i <= j) { 
 while (arr[i] < pivot) { 
 i++; 
 } 
 
 while (arr[j] > pivot) { 
 j--; 
 } 
 if (i <= j) { 
 int temp = arr[i]; 
 arr[i] = arr[j]; 
 arr[j] = temp; 
 i++; 
 j--; 
 } 
 } 
 
 // recursively sort two sub parts 
 if (low < j) 
 quickSort(arr, low, j); 
 
 if (high > i) 
 quickSort(arr, i, high); 
 } 
}
import java.util.Scanner; 
public class program_20
{ 
 public static void mergesort(int list[],int low,int high)
 { 
 if(low>=high) 
 return; 
 int middle=(low+high)/2; 
 mergesort(list,low,middle); 
 mergesort(list,middle+1,high); 
 merge(list,low,middle,high); 
 } 
 public static void merge(int list[],int low,int middle,int high)
 { 
 int lstList_end=middle; 
 int lIndList_start=middle+1; 
 int l=low; 
 while((l<=lstList_end)&&(lIndList_start<=high)){ 
 if(list[low]<list[lIndList_start]) 
 low++; 
 else{ 
 int temp=list[lIndList_start]; 
 for(int j=lIndList_start-1;j>=low;j--) 
 list[j+1]=list[j]; 
 list[low]=temp; 
 low++; 
 lstList_end++; 
 lIndList_start++; 
 } 
 } 
 } 
 public static void main (String args[]){ 
 int temp;
 Scanner sc=new Scanner(System.in); 
 System.out.println("Enter N(how many numbers to be sorted)"); 
 int n=sc.nextInt(); 
 int list[]=new int[n]; 
 System.out.println("Enter "+n+" numbers one by one"); 
 for(int i=0;i<n;i++) 
 list[i]=sc.nextInt(); 
 System.out.println("List before sorting \n"); 
 for(int i=0;i<list.length;i++) 
 System.out.print(list[i]+" "); 
 System.out.println(); 
 mergesort(list,0,list.length-1); 
 System.out.print("List after sorting \n"); 
 for(int i=0;i<list.length;i++) 
 System.out.print(list[i]+" "); 
 System.out.println(); 
 } 
 }
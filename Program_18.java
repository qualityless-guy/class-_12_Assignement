import java.util.*;
public class Program_18
{
    // Returns the index of the target element in the array or -1 if not found
    public static int binarySearch(int[] array, int target) 
    {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) 
        {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) 
            {
                return mid;
            }
            
            if (array[mid] < target) 
            {
                left = mid + 1;
            } else 
            {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of array elements");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searche");
        int target=sc.nextInt();
        int result = binarySearch(array, target);
        
        if (result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}

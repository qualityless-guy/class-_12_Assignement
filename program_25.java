public class program_25 
{ 
 public static void main(String args[]) 
 { 
 int n,a=1,b=0,c; 
 System.out.println("First 15 pell number"); 
 for(n=1;n<=15;n++) 
 { 
 c=a+2*b; 
 System.out.print(c+" "); 
 a=b; 
 b=c; 
 } 
 } 
}
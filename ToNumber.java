import java.util.Scanner;
public class ToNumber
{
     public static void main(String arg[])    {
          int a,b;
          
           Scanner sc=new Scanner(System.in);  
           
           System.out.println("Enter first number : ");
           a = sc.nextInt();
           
           System.out.println("Enter second number : ");
          
           b = sc.nextInt();
           
           if(a == b){
                System.out.println("Number are equal");
            }else{
                System.out.println("Number are not equal");
            }
            
            
     }
}

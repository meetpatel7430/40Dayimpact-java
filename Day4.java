import java.util.Scanner;

public class Day4 {
     public static void main(String[] args) {
          // Adam number
     //      Scanner sc =new Scanner(System.in);
     //      int n= sc.nextInt();
      
     //      int squ= n*n;
     //      int rev= 0;
      
     //      while(n!= 0)
     //      {
     //             rev=rev*10+n%10;
     //             n/=10;
     //      }
     //      int rsqu= rev*rev;
      
     //      int rsquReverse=0;
     //      while(rsqu!= 0)
     //      {
     //             rsquReverse=rsquReverse * 10 + rsqu % 10;
     //             rsqu/=10;
     //      }
     //      if(squ==rsquReverse)
     //      {
     //          System.out.println("is an Adam number.");
     //      }
     //      else
     //      {
     //          System.out.println("is not Adam number.");   
     // }
     // sc.close();





     // Kaprekar
     System.out.println("Enter 3 digit number:");
    Scanner sc =new Scanner(System.in);
    int num= sc.nextInt();
    int nsq=  num*num;

    int left=nsq%1000;
    int right=nsq/1000;

    int sum=left+right;
    if(sum==num)
    {
        System.out.println("It is Kaprekar num");
    }
    else{
        System.out.println("It is not Kaprekar num");
     }
     sc.close();

     






     }
}
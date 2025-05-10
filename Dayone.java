import java.util.Scanner;
class Dayone{
     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          // int c = sc.nextInt();
          // int d = sc.nextInt();
          // System.out.println(c+d);


          // int a=20;
          // int b=50;
          // System.out.println(a+b);

               //     System.out.println("Enter 4 digit:");
               //    int num=sc.nextInt();
               //    int l=num%10;
               //    int f=num/1000;
                  
               //    System.out.println(l+f);

                  System.out.println("Enter 3 digit:");
                          int num=sc.nextInt();
                  
                          int f=num/100;
                          int m=(num%100)/10;
                          int l=num%10;
                          System.out.println(f+m+l);
                          sc.close();
     
     }
}
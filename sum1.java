import java.util.*;
class mahesh{
public static void main(String[] args){
    System.out.println("Hello Mahesh! Welcome to Calculator !!");
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the value of a = ");
    int a=sc.nextInt();
    System.out.println("the value of a = "+a);
    System.out.print("enter the value of b = ");
    int b=sc.nextInt();
    System.out.println("the value of b = "+b);
    System.out.println("the sum of two numbers is = "+(a+b));

    for(int i=0;i<5;i++){
        System.out.println("Mahesh learn't the basics of java "+i);
        System.out.println("sum of "+(a+b));
        b++;
    }
    System.out.println("the value of b is = "+b); 
    b=b+2;
    int opera = b-9;
    System.out.println("the result is "+opera);  
}

}
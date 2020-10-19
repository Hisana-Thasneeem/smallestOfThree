//TRV19ECO32
//Hisana Thasneem
import java.util.Scanner;
public class SmallestOfThree
{
  public static void main(String[] args)
  {
    int a,b,c;
    int small;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    a = sc.nextInt();
    System.out.print("Enter second number: ");
    b = sc.nextInt();
    System.out.print("Enter third number: ");
    c = sc.nextInt();
    if(a<b & a<c)
        small=a;
    else if(b<c)
        small=b;
    else
        small=c;
    System.out.print("Smallest number is:" + small);

  }
}
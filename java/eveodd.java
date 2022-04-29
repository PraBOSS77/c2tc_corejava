import java.util.Scanner;
class eveodd
{
public static void main(String []args)
{
Scanner sc =new Scanner (System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
System.out.println((n%2)==0?"even":"odd");
}
}
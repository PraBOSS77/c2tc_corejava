import java.util.Scanner;
class search
{
public static void main(String args[])
{
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length of data ");
int len=sc.nextInt();
int a[]=new int[len];
System.out.println("Enter the values");
for(int i=0;i<len;i++)
{
a[i]=sc.nextInt();
System.out.print("  ");
}
System.out.println("Enter the data to search");
int data=sc.nextInt();
for(int i=0;i<len;i++)
{
if(a[i]==data)
{
System.out.println("Data found at :-"+i);
count++;
}
}
if(count==0)
System.out.println("No data found");
}
}